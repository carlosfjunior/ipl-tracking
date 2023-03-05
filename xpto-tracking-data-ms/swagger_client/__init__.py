# coding: utf-8

# flake8: noqa

"""
    IPL Tracking - Microservice API

    API description for Tracking microservice.  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

# import apis into sdk package
from swagger_client.api.vehicle_api import VehicleApi
# import ApiClient
from swagger_client.api_client import ApiClient
from swagger_client.configuration import Configuration
# import models into sdk package
from swagger_client.models.create_vehicle_request import CreateVehicleRequest
from swagger_client.models.create_vehicle_response import CreateVehicleResponse
from swagger_client.models.error_response import ErrorResponse
from swagger_client.models.error_type_enum import ErrorTypeEnum
from swagger_client.models.get_vehicle_response import GetVehicleResponse
from swagger_client.models.list_vehicles_response import ListVehiclesResponse
from swagger_client.models.uuid import UUID
from swagger_client.models.update_vehicle_request import UpdateVehicleRequest