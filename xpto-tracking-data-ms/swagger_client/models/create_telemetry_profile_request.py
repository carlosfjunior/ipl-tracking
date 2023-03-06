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

class CreateTelemetryProfileRequest(object):
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
        'name': 'str',
        'sensors': 'list[str]'
    }

    attribute_map = {
        'name': 'name',
        'sensors': 'sensors'
    }

    def __init__(self, name=None, sensors=None):  # noqa: E501
        """CreateTelemetryProfileRequest - a model defined in Swagger"""  # noqa: E501
        self._name = None
        self._sensors = None
        self.discriminator = None
        self.name = name
        if sensors is not None:
            self.sensors = sensors

    @property
    def name(self):
        """Gets the name of this CreateTelemetryProfileRequest.  # noqa: E501

        Complete TelemetryProfile name  # noqa: E501

        :return: The name of this CreateTelemetryProfileRequest.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this CreateTelemetryProfileRequest.

        Complete TelemetryProfile name  # noqa: E501

        :param name: The name of this CreateTelemetryProfileRequest.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def sensors(self):
        """Gets the sensors of this CreateTelemetryProfileRequest.  # noqa: E501

        unique identifier of the sensors in the database  # noqa: E501

        :return: The sensors of this CreateTelemetryProfileRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._sensors

    @sensors.setter
    def sensors(self, sensors):
        """Sets the sensors of this CreateTelemetryProfileRequest.

        unique identifier of the sensors in the database  # noqa: E501

        :param sensors: The sensors of this CreateTelemetryProfileRequest.  # noqa: E501
        :type: list[str]
        """

        self._sensors = sensors

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
        if issubclass(CreateTelemetryProfileRequest, dict):
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
        if not isinstance(other, CreateTelemetryProfileRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
