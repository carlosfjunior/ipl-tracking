# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.create_geo_data_request import CreateGeoDataRequest  # noqa: E501
from swagger_server.models.create_geo_data_response import CreateGeoDataResponse  # noqa: E501
from swagger_server.models.error_response import ErrorResponse  # noqa: E501
from swagger_server.models.get_telemetry_data_response import GetTelemetryDataResponse  # noqa: E501
from swagger_server.models.list_geo_data_response import ListGeoDataResponse  # noqa: E501
from swagger_server.test import BaseTestCase


class TestGeoDataController(BaseTestCase):
    """GeoDataController integration test stubs"""

    def test_create_geo_data(self):
        """Test case for create_geo_data

        create new GeoData
        """
        body = CreateGeoDataRequest()
        response = self.client.open(
            '/tracking/geodata',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_geo_data(self):
        """Test case for get_geo_data

        Get a single GeoData's info
        """
        response = self.client.open(
            '/tracking/geodata/{geoDataId}'.format(geo_data_id='geo_data_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_geo_data(self):
        """Test case for list_geo_data

        Get GeoData list
        """
        response = self.client.open(
            '/tracking/geodata',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
