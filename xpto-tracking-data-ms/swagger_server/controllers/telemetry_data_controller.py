import connexion
import json

import swagger_client
from models.entities import TelemetryData
from custom_errors import InvalidPayload, BaseCustomError, EntityNotFound
from schemas.schemas import TelemetryDataSchema
from services.services import TelemetryDataService
from swagger_client.rest import ApiException
from swagger_server.models import ErrorTypeEnum
from swagger_server.models.create_telemetry_data_request import CreateTelemetryDataRequest  # noqa: E501
from swagger_server.models.create_telemetry_data_response import CreateTelemetryDataResponse  # noqa: E501
from swagger_server.models.error_response import ErrorResponse  # noqa: E501
from swagger_server.models.get_telemetry_data_response import GetTelemetryDataResponse  # noqa: E501
from swagger_server.models.list_telemetry_data_response import ListTelemetryDataResponse  # noqa: E501

telemetry_data_service = TelemetryDataService()
telemetry_data_schema = TelemetryDataSchema()
api_instance = swagger_client.VehicleApi(swagger_client.ApiClient(swagger_client.Configuration()))


def create_telemetry_data(body):  # noqa: E501
    """create new TelemetryData

    This operation is usedto create a new TelemetryData on System. # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: CreateTelemetryDataResponse
    """
    response = None
    response_code = None
    try:
        if not connexion.request.is_json:
            raise InvalidPayload(code="CST002", message="Invalid Request Payload",
                                 details=f"Request payload is not a JSON valid")
        body = CreateTelemetryDataRequest.from_dict(connexion.request.get_json())  # noqa: E501

        api_instance.get_vehicle(body.vehicle_id)

        entity = TelemetryData(telemetry_data_id=None, vehicle_id=body.vehicle_id, date=body._date,
                               sensor_type=body.sensor_type, value=body.value)
        entity = telemetry_data_service.save(entity)
        response = CreateTelemetryDataResponse.from_dict(json.loads(telemetry_data_schema.dumps(entity)))
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
                                 message="Error on create new TelemetryData", details=str(e))

    return response.to_dict(), response_code


def get_telemetry_data(telemetry_data_id):  # noqa: E501
    """Get a single TelemetryData&#x27;s info

    This operation is used to retrieve the details of a specific device. # noqa: E501

    :param telemetry_data_id: Unique identifier of the TelemetryData in the database
    :type telemetry_data_id: dict | bytes

    :rtype: GetTelemetryDataResponse
    """
    response = None
    response_code = None
    try:
        entity = telemetry_data_service.fetch_by_id(entity_id=telemetry_data_id)
        if entity is None:
            raise EntityNotFound(code="CST001", message="TelemetryData not found",
                                 details=f"Unable to find TelemetryData ID {telemetry_data_id}")
        response = GetTelemetryDataResponse.from_dict(json.loads(telemetry_data_schema.dumps(entity)))
        response_code = 200
    except BaseCustomError as bce:
        response_code = bce.http_code
        response = bce.to_error_response()
    except Exception as e:
        response_code = 500
        response = ErrorResponse(code="CSM999", type=ErrorTypeEnum.UNKNOWN,
                                 message="Ops.. Unknown error..", details=str(e))
    return response.to_dict(), response_code


def list_telemetry_data():  # noqa: E501
    """Get TelemetryData list

    This operation is used to retrieve a list of TelemetryData. # noqa: E501


    :rtype: ListTelemetryDataResponse
    """
    entities = telemetry_data_service.fetch_all()

    customer_response_list = []
    for entity in entities:
        customer_response_list.append(GetTelemetryDataResponse.from_dict(json.loads(telemetry_data_schema.dumps(entity))))

    response = ListTelemetryDataResponse(content=customer_response_list, total_results=len(customer_response_list))
    return response.to_dict(), 200
