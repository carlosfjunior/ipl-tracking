# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.enum_sensor_type import EnumSensorType  # noqa: F401,E501
import re  # noqa: F401,E501
from swagger_server import util


class GetGeoDataResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, geo_data_id: str=None, vehicle_id: str=None, _date: datetime=None, sensor_type: EnumSensorType=None, latitude: str=None, longitude: str=None, altimeter: str=None):  # noqa: E501
        """GetGeoDataResponse - a model defined in Swagger

        :param geo_data_id: The geo_data_id of this GetGeoDataResponse.  # noqa: E501
        :type geo_data_id: str
        :param vehicle_id: The vehicle_id of this GetGeoDataResponse.  # noqa: E501
        :type vehicle_id: str
        :param _date: The _date of this GetGeoDataResponse.  # noqa: E501
        :type _date: datetime
        :param sensor_type: The sensor_type of this GetGeoDataResponse.  # noqa: E501
        :type sensor_type: EnumSensorType
        :param latitude: The latitude of this GetGeoDataResponse.  # noqa: E501
        :type latitude: str
        :param longitude: The longitude of this GetGeoDataResponse.  # noqa: E501
        :type longitude: str
        :param altimeter: The altimeter of this GetGeoDataResponse.  # noqa: E501
        :type altimeter: str
        """
        self.swagger_types = {
            'geo_data_id': str,
            'vehicle_id': str,
            '_date': datetime,
            'sensor_type': EnumSensorType,
            'latitude': str,
            'longitude': str,
            'altimeter': str
        }

        self.attribute_map = {
            'geo_data_id': 'geoDataId',
            'vehicle_id': 'vehicleId',
            '_date': 'date',
            'sensor_type': 'sensor_type',
            'latitude': 'latitude',
            'longitude': 'longitude',
            'altimeter': 'altimeter'
        }
        self._geo_data_id = geo_data_id
        self._vehicle_id = vehicle_id
        self.__date = _date
        self._sensor_type = sensor_type
        self._latitude = latitude
        self._longitude = longitude
        self._altimeter = altimeter

    @classmethod
    def from_dict(cls, dikt) -> 'GetGeoDataResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetGeoDataResponse of this GetGeoDataResponse.  # noqa: E501
        :rtype: GetGeoDataResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def geo_data_id(self) -> str:
        """Gets the geo_data_id of this GetGeoDataResponse.


        :return: The geo_data_id of this GetGeoDataResponse.
        :rtype: str
        """
        return self._geo_data_id

    @geo_data_id.setter
    def geo_data_id(self, geo_data_id: str):
        """Sets the geo_data_id of this GetGeoDataResponse.


        :param geo_data_id: The geo_data_id of this GetGeoDataResponse.
        :type geo_data_id: str
        """
        if geo_data_id is None:
            raise ValueError("Invalid value for `geo_data_id`, must not be `None`")  # noqa: E501

        self._geo_data_id = geo_data_id

    @property
    def vehicle_id(self) -> str:
        """Gets the vehicle_id of this GetGeoDataResponse.


        :return: The vehicle_id of this GetGeoDataResponse.
        :rtype: str
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id: str):
        """Sets the vehicle_id of this GetGeoDataResponse.


        :param vehicle_id: The vehicle_id of this GetGeoDataResponse.
        :type vehicle_id: str
        """
        if vehicle_id is None:
            raise ValueError("Invalid value for `vehicle_id`, must not be `None`")  # noqa: E501

        self._vehicle_id = vehicle_id

    @property
    def _date(self) -> datetime:
        """Gets the _date of this GetGeoDataResponse.

        Creation date and time  # noqa: E501

        :return: The _date of this GetGeoDataResponse.
        :rtype: datetime
        """
        return self.__date

    @_date.setter
    def _date(self, _date: datetime):
        """Sets the _date of this GetGeoDataResponse.

        Creation date and time  # noqa: E501

        :param _date: The _date of this GetGeoDataResponse.
        :type _date: datetime
        """
        if _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def sensor_type(self) -> EnumSensorType:
        """Gets the sensor_type of this GetGeoDataResponse.


        :return: The sensor_type of this GetGeoDataResponse.
        :rtype: EnumSensorType
        """
        return self._sensor_type

    @sensor_type.setter
    def sensor_type(self, sensor_type: EnumSensorType):
        """Sets the sensor_type of this GetGeoDataResponse.


        :param sensor_type: The sensor_type of this GetGeoDataResponse.
        :type sensor_type: EnumSensorType
        """
        if sensor_type is None:
            raise ValueError("Invalid value for `sensor_type`, must not be `None`")  # noqa: E501

        self._sensor_type = sensor_type

    @property
    def latitude(self) -> str:
        """Gets the latitude of this GetGeoDataResponse.

        Latitude  # noqa: E501

        :return: The latitude of this GetGeoDataResponse.
        :rtype: str
        """
        return self._latitude

    @latitude.setter
    def latitude(self, latitude: str):
        """Sets the latitude of this GetGeoDataResponse.

        Latitude  # noqa: E501

        :param latitude: The latitude of this GetGeoDataResponse.
        :type latitude: str
        """
        if latitude is None:
            raise ValueError("Invalid value for `latitude`, must not be `None`")  # noqa: E501

        self._latitude = latitude

    @property
    def longitude(self) -> str:
        """Gets the longitude of this GetGeoDataResponse.

        Longitude  # noqa: E501

        :return: The longitude of this GetGeoDataResponse.
        :rtype: str
        """
        return self._longitude

    @longitude.setter
    def longitude(self, longitude: str):
        """Sets the longitude of this GetGeoDataResponse.

        Longitude  # noqa: E501

        :param longitude: The longitude of this GetGeoDataResponse.
        :type longitude: str
        """
        if longitude is None:
            raise ValueError("Invalid value for `longitude`, must not be `None`")  # noqa: E501

        self._longitude = longitude

    @property
    def altimeter(self) -> str:
        """Gets the altimeter of this GetGeoDataResponse.

        Altimeter  # noqa: E501

        :return: The altimeter of this GetGeoDataResponse.
        :rtype: str
        """
        return self._altimeter

    @altimeter.setter
    def altimeter(self, altimeter: str):
        """Sets the altimeter of this GetGeoDataResponse.

        Altimeter  # noqa: E501

        :param altimeter: The altimeter of this GetGeoDataResponse.
        :type altimeter: str
        """
        if altimeter is None:
            raise ValueError("Invalid value for `altimeter`, must not be `None`")  # noqa: E501

        self._altimeter = altimeter
