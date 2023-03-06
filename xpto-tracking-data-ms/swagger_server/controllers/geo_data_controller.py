import os

import connexion
import json

import swagger_client
from models.entities import GeoData
from custom_errors import InvalidPayload, BaseCustomError, EntityNotFound
from schemas.schemas import GeoDataSchema
from services.services import GeoDataService
from swagger_client.rest import ApiException
from swagger_server.models import ErrorTypeEnum, GetGeoDataResponse
from swagger_server.models.create_geo_data_request import CreateGeoDataRequest  # noqa: E501
from swagger_server.models.create_geo_data_response import CreateGeoDataResponse  # noqa: E501
from swagger_server.models.error_response import ErrorResponse  # noqa: E501
from swagger_server.models.list_geo_data_response import ListGeoDataResponse  # noqa: E501

geo_data_service = GeoDataService()
geo_data_schema = GeoDataSchema()

configuration = swagger_client.Configuration()
configuration.host = os.environ['VEHICLE_API_URI']
api_instance = swagger_client.VehicleApi(swagger_client.ApiClient(configuration))


def create_geo_data(body):  # noqa: E501
    """create new GeoData

    This operation is usedto create a new GeoData on System. # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: CreateGeoDataResponse
    """
    response = None
    response_code = None
    try:
        if not connexion.request.is_json:
            raise InvalidPayload(code="CST002", message="Invalid Request Payload",
                                 details=f"Request payload is not a JSON valid")
        body = CreateGeoDataRequest.from_dict(connexion.request.get_json())  # noqa: E501

        api_instance.get_vehicle(body.vehicle_id)

        entity = GeoData(geo_data_id=None, vehicle_id=body.vehicle_id, date=body._date,
                         sensor_type=body.sensor_type, latitude=body.latitude, longitude=body.longitude,
                         altimeter=body.altimeter)
        entity = geo_data_service.save(entity)
        response = CreateGeoDataResponse.from_dict(json.loads(geo_data_schema.dumps(entity)))
        response_code = 201

    except BaseCustomError as bce:
        response_code = bce.http_code
        response = bce.to_error_response()
    except ApiException as e:
        response_code = 404
        response = ErrorResponse(code="CST0003", type=ErrorTypeEnum.PERSISTENCE,
                                 message=f"Target Vehicle not found. It's not possible to associate to a geo data. "
                                         f"CurrentDriver ID: {body.vehicle_id}", details=str(e))
    except Exception as e:
        response_code = 500
        response = ErrorResponse(code="CST0002", type=ErrorTypeEnum.PERSISTENCE,
                                 message="Error on create new GeoData", details=str(e))

    return response.to_dict(), response_code


def get_geo_data(geo_data_id):  # noqa: E501
    """Get a single GeoData&#x27;s info

    This operation is used to retrieve the details of a specific device. # noqa: E501

    :param geo_data_id: Unique identifier of the GeoData in the database
    :type geo_data_id: dict | bytes

    :rtype: GetGeoDataResponse
    """
    response = None
    response_code = None
    try:
        entity = geo_data_service.fetch_by_id(entity_id=geo_data_id)
        if entity is None:
            raise EntityNotFound(code="CST001", message="GeoData not found",
                                 details=f"Unable to find GeoData ID {geo_data_id}")
        response = GetGeoDataResponse.from_dict(json.loads(geo_data_schema.dumps(entity)))
        response_code = 200
    except BaseCustomError as bce:
        response_code = bce.http_code
        response = bce.to_error_response()
    except Exception as e:
        response_code = 500
        response = ErrorResponse(code="CSM999", type=ErrorTypeEnum.UNKNOWN,
                                 message="Ops.. Unknown error..", details=str(e))
    return response.to_dict(), response_code


def list_geo_data():  # noqa: E501
    """Get GeoData list

    This operation is used to retrieve a list of GeoData. # noqa: E501


    :rtype: ListGeoDataResponse
    """
    entities = geo_data_service.fetch_all()

    customer_response_list = []
    for entity in entities:
        customer_response_list.append(
            GetGeoDataResponse.from_dict(json.loads(geo_data_schema.dumps(entity))))

    response = ListGeoDataResponse(content=customer_response_list, total_results=len(customer_response_list))
    return response.to_dict(), 200
