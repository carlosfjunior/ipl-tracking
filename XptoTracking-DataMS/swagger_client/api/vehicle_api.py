# coding: utf-8

"""
    IPL Tracking - Microservice API

    API description for Tracking microservice.  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class VehicleApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def create_vehicle(self, body, **kwargs):  # noqa: E501
        """Create new Vehicle  # noqa: E501

        This operation is usedto create a new Vehicle on System.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_vehicle(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CreateVehicleRequest body: (required)
        :return: CreateVehicleResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_vehicle_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.create_vehicle_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def create_vehicle_with_http_info(self, body, **kwargs):  # noqa: E501
        """Create new Vehicle  # noqa: E501

        This operation is usedto create a new Vehicle on System.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_vehicle_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CreateVehicleRequest body: (required)
        :return: CreateVehicleResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_vehicle" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `create_vehicle`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/vehicles', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='CreateVehicleResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def delete_vehicle(self, vehicle_id, **kwargs):  # noqa: E501
        """Delete Vehicle  # noqa: E501

        This operation is delete a Vehicle.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_vehicle(vehicle_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str vehicle_id: Unique identifier of the Vehicle in the database (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_vehicle_with_http_info(vehicle_id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_vehicle_with_http_info(vehicle_id, **kwargs)  # noqa: E501
            return data

    def delete_vehicle_with_http_info(self, vehicle_id, **kwargs):  # noqa: E501
        """Delete Vehicle  # noqa: E501

        This operation is delete a Vehicle.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_vehicle_with_http_info(vehicle_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str vehicle_id: Unique identifier of the Vehicle in the database (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['vehicle_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_vehicle" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'vehicle_id' is set
        if ('vehicle_id' not in params or
                params['vehicle_id'] is None):
            raise ValueError("Missing the required parameter `vehicle_id` when calling `delete_vehicle`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'vehicle_id' in params:
            path_params['vehicleId'] = params['vehicle_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/vehicles/{vehicleId}', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_vehicle(self, vehicle_id, **kwargs):  # noqa: E501
        """Get a single Vehicle's info  # noqa: E501

        This operation is used to retrieve the details of a specific device.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_vehicle(vehicle_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str vehicle_id: Unique identifier of the Vehicle in the database (required)
        :return: GetVehicleResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_vehicle_with_http_info(vehicle_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_vehicle_with_http_info(vehicle_id, **kwargs)  # noqa: E501
            return data

    def get_vehicle_with_http_info(self, vehicle_id, **kwargs):  # noqa: E501
        """Get a single Vehicle's info  # noqa: E501

        This operation is used to retrieve the details of a specific device.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_vehicle_with_http_info(vehicle_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str vehicle_id: Unique identifier of the Vehicle in the database (required)
        :return: GetVehicleResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['vehicle_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_vehicle" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'vehicle_id' is set
        if ('vehicle_id' not in params or
                params['vehicle_id'] is None):
            raise ValueError("Missing the required parameter `vehicle_id` when calling `get_vehicle`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'vehicle_id' in params:
            path_params['vehicleId'] = params['vehicle_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/vehicles/{vehicleId}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='GetVehicleResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def list_vehicles(self, **kwargs):  # noqa: E501
        """Get Vehicles list  # noqa: E501

        This operation is used to retrieve a list of Vehicles.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.list_vehicles(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: ListVehiclesResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.list_vehicles_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.list_vehicles_with_http_info(**kwargs)  # noqa: E501
            return data

    def list_vehicles_with_http_info(self, **kwargs):  # noqa: E501
        """Get Vehicles list  # noqa: E501

        This operation is used to retrieve a list of Vehicles.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.list_vehicles_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: ListVehiclesResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = []  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method list_vehicles" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/vehicles', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='ListVehiclesResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def update_vehicle(self, body, vehicle_id, **kwargs):  # noqa: E501
        """Update Vehicle's attributes  # noqa: E501

        This operation is used to update some of the Vehicle's attributes.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_vehicle(body, vehicle_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param UpdateVehicleRequest body: (required)
        :param str vehicle_id: Unique identifier of the Sensor in the database (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.update_vehicle_with_http_info(body, vehicle_id, **kwargs)  # noqa: E501
        else:
            (data) = self.update_vehicle_with_http_info(body, vehicle_id, **kwargs)  # noqa: E501
            return data

    def update_vehicle_with_http_info(self, body, vehicle_id, **kwargs):  # noqa: E501
        """Update Vehicle's attributes  # noqa: E501

        This operation is used to update some of the Vehicle's attributes.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_vehicle_with_http_info(body, vehicle_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param UpdateVehicleRequest body: (required)
        :param str vehicle_id: Unique identifier of the Sensor in the database (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'vehicle_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_vehicle" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `update_vehicle`")  # noqa: E501
        # verify the required parameter 'vehicle_id' is set
        if ('vehicle_id' not in params or
                params['vehicle_id'] is None):
            raise ValueError("Missing the required parameter `vehicle_id` when calling `update_vehicle`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'vehicle_id' in params:
            path_params['vehicleId'] = params['vehicle_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/vehicles/{vehicleId}', 'PUT',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
