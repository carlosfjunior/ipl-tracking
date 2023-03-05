package com.tonnie.ipl.xpto.tracking.vehicle.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;
import com.tonnie.ipl.xpto.tracking.vehicle.XptoTrackingVehicleMsApplication;
import com.tonnie.ipl.xpto.tracking.vehicle.openapi.model.CreateVehicleResponseDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.openapitools.client.api.CustomerApi;
import org.openapitools.client.api.DriverApi;
import org.openapitools.client.api.TelemetryProfileApi;
import org.openapitools.client.model.GetCustomerResponse;
import org.openapitools.client.model.GetDriverResponse;
import org.openapitools.client.model.GetTelemetryProfileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = XptoTrackingVehicleMsApplication.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureMockMvc
class VehicleControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper jsonMapper;

	@MockBean
	private CustomerApi customerApi;

	@MockBean
	private DriverApi driverApi;

	@MockBean
	private TelemetryProfileApi telemetryProfileApi;
	
	public static final String BASE_PATH = "/tracking";
	public static final String ENTITY_PATH = "/vehicles";
	public static final String BASE_RESOURCE_REQUEST_PATH = "samples/request/";
	public static final String BASE_RESOURCE_RESPONSE_PATH = "samples/response/";
	public static final String VEHICLE_REF_ID = "e74486b1-cec7-4236-af6c-2aee39d98397";
	
	@Test
	@Order(1)
	void listEntities() throws Exception {
		URL responseResource = Resources.getResource(BASE_RESOURCE_RESPONSE_PATH+"response_list_all_vehicles.json");
		mockMvc
			.perform(
				get(URI.create(BASE_PATH+ENTITY_PATH))
					.accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
				)
			.andExpect(status().isOk())
			.andExpect(content().json(Resources.toString(responseResource, Charset.defaultCharset())));
	}
	@Test
	@Order(2)
	void getEntity() throws Exception {
		URL responseResource = Resources.getResource(BASE_RESOURCE_RESPONSE_PATH+"response_get_vehicle.json");
		mockMvc
		.perform(
				get(BASE_PATH+ENTITY_PATH+"/{vehicleId}", VEHICLE_REF_ID)
				.accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
				)
		.andExpect(status().isOk())
		.andExpect(content().json(Resources.toString(responseResource, Charset.defaultCharset())));
	}
	@Test
	@Order(3)
	void createEntity() throws Exception {

		Mockito.when(customerApi.getCustomer(Mockito.anyString())).thenReturn(new GetCustomerResponse());
		Mockito.when(driverApi.getDriver(Mockito.anyString())).thenReturn(new GetDriverResponse());
		Mockito.when(telemetryProfileApi.getTelemetryProfile(Mockito.anyString())).thenReturn(new GetTelemetryProfileResponse());

		URL requestResource = Resources.getResource(BASE_RESOURCE_REQUEST_PATH+"request_create_vehicle.json");
		MvcResult mvcResult = mockMvc
		.perform(
				post(BASE_PATH+ENTITY_PATH)
				.accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
				.content(Resources.toString(requestResource, Charset.defaultCharset()))
				)
		.andExpect(status().isCreated()).andReturn();
		String jsonResponse = mvcResult.getResponse().getContentAsString();
		Assertions.assertThat(jsonResponse).isNotEmpty();
		CreateVehicleResponseDto responseDTO = jsonMapper.readValue(jsonResponse, CreateVehicleResponseDto.class);
		Assertions.assertThat(responseDTO).isNotNull();
		Assertions.assertThat(responseDTO.getVehicleId()).isNotNull();
	}
	@Test
	@Order(4)
	void updateEntity() throws Exception {
		URL requestResource = Resources.getResource(BASE_RESOURCE_REQUEST_PATH+"request_update_vehicle.json");
		mockMvc
		.perform(
				put(BASE_PATH+ENTITY_PATH+"/{vehicleId}", VEHICLE_REF_ID)
				.accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
				.content(Resources.toString(requestResource, Charset.defaultCharset()))
				)
		.andExpect(status().isNoContent());
	}
	@Test
	@Order(5)
	void updateEntityFailsNotFound() throws Exception {
		URL requestResource = Resources.getResource(BASE_RESOURCE_REQUEST_PATH+"request_update_vehicle.json");
		mockMvc
		.perform(
				put(BASE_PATH+ENTITY_PATH+"/{vehicleId}",UUID.randomUUID())
				.accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
				.content(Resources.toString(requestResource, Charset.defaultCharset()))
				)
		.andExpect(status().isNotFound());
	}
	@Test
	@Order(6)
	void deleteEntity() throws Exception {
		 mockMvc
		.perform(
				delete(BASE_PATH+ENTITY_PATH+"/{vehicleId}", VEHICLE_REF_ID)
				.accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
				)
		.andExpect(status().isNoContent());
		
		
	}
	@Test
	@Order(7)
	void deleteEntityFailsNotFound() throws Exception {
		 mockMvc
		.perform(
				delete(BASE_PATH+ENTITY_PATH+"/{vehicleId}",UUID.randomUUID())
				.accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
				)
		.andExpect(status().isNotFound());
		
		
	}
	@Test
	@Order(8)
	void getEntityFailsNotFound() throws Exception {
		mockMvc
		.perform(
				get(BASE_PATH+ENTITY_PATH+"/{vehicleId}",UUID.randomUUID())
				.accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
				)
		.andExpect(status().isNotFound());
	}
}