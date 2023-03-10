# coding: utf-8

"""
    IPL Tracking - Microservice API

    API description for Tracking microservice.  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class GetVehicleResponse(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'vehicle_id': 'str',
        'customer_owner_id': 'str',
        'telemetry_profile_id': 'str',
        'current_driver_id': 'str',
        'number_plate': 'str',
        'vin': 'str',
        'color': 'str'
    }

    attribute_map = {
        'vehicle_id': 'vehicleId',
        'customer_owner_id': 'customerOwnerId',
        'telemetry_profile_id': 'telemetryProfileId',
        'current_driver_id': 'currentDriverId',
        'number_plate': 'numberPlate',
        'vin': 'vin',
        'color': 'color'
    }

    def __init__(self, vehicle_id=None, customer_owner_id=None, telemetry_profile_id=None, current_driver_id=None, number_plate=None, vin=None, color=None):  # noqa: E501
        """GetVehicleResponse - a model defined in Swagger"""  # noqa: E501
        self._vehicle_id = None
        self._customer_owner_id = None
        self._telemetry_profile_id = None
        self._current_driver_id = None
        self._number_plate = None
        self._vin = None
        self._color = None
        self.discriminator = None
        self.vehicle_id = vehicle_id
        self.customer_owner_id = customer_owner_id
        self.telemetry_profile_id = telemetry_profile_id
        self.current_driver_id = current_driver_id
        self.number_plate = number_plate
        self.vin = vin
        self.color = color

    @property
    def vehicle_id(self):
        """Gets the vehicle_id of this GetVehicleResponse.  # noqa: E501


        :return: The vehicle_id of this GetVehicleResponse.  # noqa: E501
        :rtype: str
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id):
        """Sets the vehicle_id of this GetVehicleResponse.


        :param vehicle_id: The vehicle_id of this GetVehicleResponse.  # noqa: E501
        :type: str
        """
        if vehicle_id is None:
            raise ValueError("Invalid value for `vehicle_id`, must not be `None`")  # noqa: E501

        self._vehicle_id = vehicle_id

    @property
    def customer_owner_id(self):
        """Gets the customer_owner_id of this GetVehicleResponse.  # noqa: E501


        :return: The customer_owner_id of this GetVehicleResponse.  # noqa: E501
        :rtype: str
        """
        return self._customer_owner_id

    @customer_owner_id.setter
    def customer_owner_id(self, customer_owner_id):
        """Sets the customer_owner_id of this GetVehicleResponse.


        :param customer_owner_id: The customer_owner_id of this GetVehicleResponse.  # noqa: E501
        :type: str
        """
        if customer_owner_id is None:
            raise ValueError("Invalid value for `customer_owner_id`, must not be `None`")  # noqa: E501

        self._customer_owner_id = customer_owner_id

    @property
    def telemetry_profile_id(self):
        """Gets the telemetry_profile_id of this GetVehicleResponse.  # noqa: E501


        :return: The telemetry_profile_id of this GetVehicleResponse.  # noqa: E501
        :rtype: str
        """
        return self._telemetry_profile_id

    @telemetry_profile_id.setter
    def telemetry_profile_id(self, telemetry_profile_id):
        """Sets the telemetry_profile_id of this GetVehicleResponse.


        :param telemetry_profile_id: The telemetry_profile_id of this GetVehicleResponse.  # noqa: E501
        :type: str
        """
        if telemetry_profile_id is None:
            raise ValueError("Invalid value for `telemetry_profile_id`, must not be `None`")  # noqa: E501

        self._telemetry_profile_id = telemetry_profile_id

    @property
    def current_driver_id(self):
        """Gets the current_driver_id of this GetVehicleResponse.  # noqa: E501


        :return: The current_driver_id of this GetVehicleResponse.  # noqa: E501
        :rtype: str
        """
        return self._current_driver_id

    @current_driver_id.setter
    def current_driver_id(self, current_driver_id):
        """Sets the current_driver_id of this GetVehicleResponse.


        :param current_driver_id: The current_driver_id of this GetVehicleResponse.  # noqa: E501
        :type: str
        """
        if current_driver_id is None:
            raise ValueError("Invalid value for `current_driver_id`, must not be `None`")  # noqa: E501

        self._current_driver_id = current_driver_id

    @property
    def number_plate(self):
        """Gets the number_plate of this GetVehicleResponse.  # noqa: E501

        Number Plate  # noqa: E501

        :return: The number_plate of this GetVehicleResponse.  # noqa: E501
        :rtype: str
        """
        return self._number_plate

    @number_plate.setter
    def number_plate(self, number_plate):
        """Sets the number_plate of this GetVehicleResponse.

        Number Plate  # noqa: E501

        :param number_plate: The number_plate of this GetVehicleResponse.  # noqa: E501
        :type: str
        """
        if number_plate is None:
            raise ValueError("Invalid value for `number_plate`, must not be `None`")  # noqa: E501

        self._number_plate = number_plate

    @property
    def vin(self):
        """Gets the vin of this GetVehicleResponse.  # noqa: E501

        Vehicle Identification Number  # noqa: E501

        :return: The vin of this GetVehicleResponse.  # noqa: E501
        :rtype: str
        """
        return self._vin

    @vin.setter
    def vin(self, vin):
        """Sets the vin of this GetVehicleResponse.

        Vehicle Identification Number  # noqa: E501

        :param vin: The vin of this GetVehicleResponse.  # noqa: E501
        :type: str
        """
        if vin is None:
            raise ValueError("Invalid value for `vin`, must not be `None`")  # noqa: E501

        self._vin = vin

    @property
    def color(self):
        """Gets the color of this GetVehicleResponse.  # noqa: E501

        Color  # noqa: E501

        :return: The color of this GetVehicleResponse.  # noqa: E501
        :rtype: str
        """
        return self._color

    @color.setter
    def color(self, color):
        """Sets the color of this GetVehicleResponse.

        Color  # noqa: E501

        :param color: The color of this GetVehicleResponse.  # noqa: E501
        :type: str
        """
        if color is None:
            raise ValueError("Invalid value for `color`, must not be `None`")  # noqa: E501

        self._color = color

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(GetVehicleResponse, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, GetVehicleResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
