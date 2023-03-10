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

class ListVehiclesResponse(object):
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
        'content': 'list[GetVehicleResponse]',
        'total_results': 'int'
    }

    attribute_map = {
        'content': 'content',
        'total_results': 'totalResults'
    }

    def __init__(self, content=None, total_results=None):  # noqa: E501
        """ListVehiclesResponse - a model defined in Swagger"""  # noqa: E501
        self._content = None
        self._total_results = None
        self.discriminator = None
        self.content = content
        self.total_results = total_results

    @property
    def content(self):
        """Gets the content of this ListVehiclesResponse.  # noqa: E501

        list of paged items  # noqa: E501

        :return: The content of this ListVehiclesResponse.  # noqa: E501
        :rtype: list[GetVehicleResponse]
        """
        return self._content

    @content.setter
    def content(self, content):
        """Sets the content of this ListVehiclesResponse.

        list of paged items  # noqa: E501

        :param content: The content of this ListVehiclesResponse.  # noqa: E501
        :type: list[GetVehicleResponse]
        """
        if content is None:
            raise ValueError("Invalid value for `content`, must not be `None`")  # noqa: E501

        self._content = content

    @property
    def total_results(self):
        """Gets the total_results of this ListVehiclesResponse.  # noqa: E501

        total number of records  # noqa: E501

        :return: The total_results of this ListVehiclesResponse.  # noqa: E501
        :rtype: int
        """
        return self._total_results

    @total_results.setter
    def total_results(self, total_results):
        """Sets the total_results of this ListVehiclesResponse.

        total number of records  # noqa: E501

        :param total_results: The total_results of this ListVehiclesResponse.  # noqa: E501
        :type: int
        """
        if total_results is None:
            raise ValueError("Invalid value for `total_results`, must not be `None`")  # noqa: E501

        self._total_results = total_results

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
        if issubclass(ListVehiclesResponse, dict):
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
        if not isinstance(other, ListVehiclesResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
