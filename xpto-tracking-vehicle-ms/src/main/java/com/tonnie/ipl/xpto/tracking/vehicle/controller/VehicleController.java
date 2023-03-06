package com.tonnie.ipl.xpto.tracking.vehicle.controller;

import static com.tonnie.ipl.xpto.tracking.vehicle.util.Constants.TRACE_ID;
import static com.tonnie.ipl.xpto.tracking.vehicle.util.Constants.X_TRACE_ID;

import com.tonnie.ipl.xpto.tracking.vehicle.exception.EntityNotFoundException;
import com.tonnie.ipl.xpto.tracking.vehicle.mapper.MapperDtoEntity;
import com.tonnie.ipl.xpto.tracking.vehicle.openapi.api.VehiclesApi;
import com.tonnie.ipl.xpto.tracking.vehicle.openapi.model.*;
import com.tonnie.ipl.xpto.tracking.vehicle.service.IVehicleService;
import com.tonnie.ipl.xpto.tracking.vehicle.util.Messages;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.openapitools.client.api.DriverApi;
import org.openapitools.client.api.TelemetryProfileApi;
import org.slf4j.MDC;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Objects;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class VehicleController implements VehiclesApi {

    private final IVehicleService service;
    private final MapperDtoEntity mapper;
    private final TelemetryProfileApi telemetryProfileApi;
    private final DriverApi driverApi;

    @Override
    public ResponseEntity<CreateVehicleResponseDto> createVehicle(CreateVehicleRequestDto createVehicleRequestDto) {

        var headers = new HttpHeaders();
        headers.set(X_TRACE_ID, MDC.get(TRACE_ID));

        try {
            var getDriverResponse = driverApi.getDriver(createVehicleRequestDto.getCurrentDriverId());
            if (!StringUtils.equals(getDriverResponse.getCustomerId(), createVehicleRequestDto.getCustomerOwnerId())) {
                throw new EntityNotFoundException(String.format(
                        Messages.CUSTOMER_OWNER_ASSOCIATION_FAILED_CUSTOMER_NOT_RELATED,
                        createVehicleRequestDto.getCustomerOwnerId()));
            }
        } catch (HttpClientErrorException e) {
            throw new EntityNotFoundException(String.format(
                    Messages.CURRENT_DRIVER_ASSOCIATION_FAILED_DRIVER_NOT_FOUND,
                    createVehicleRequestDto.getCurrentDriverId()));
        }

        try {
            telemetryProfileApi.getTelemetryProfile(createVehicleRequestDto.getTelemetryProfileId());
        } catch (HttpClientErrorException e) {
            throw new EntityNotFoundException(String.format(
                    Messages.TELEMETRY_PROFILE_ASSOCIATION_FAILED_TELEMETRY_PROFILE_NOT_FOUND,
                    createVehicleRequestDto.getTelemetryProfileId()));
        }

        var newEntity = mapper.mapDtoToEntity(createVehicleRequestDto);
        newEntity = service.save(newEntity);

        return new ResponseEntity<>(mapper.mapEntityToCreateResponseDto(newEntity), headers, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateVehicle(String vehicleId, UpdateVehicleRequestDto updateVehicleRequestDto) {

        var headers = new HttpHeaders();
        headers.set(X_TRACE_ID, MDC.get(TRACE_ID));

        var persistedEntity = service.findById(UUID.fromString(vehicleId)).orElseThrow(
                () -> new EntityNotFoundException(String.format(Messages.VEHICLE_NOT_FOUND_FOR_ID, vehicleId)));

        var newEntity = mapper.mapDtoToEntity(updateVehicleRequestDto);

        persistedEntity.setCustomerOwnerId(newEntity.getCustomerOwnerId());
        persistedEntity.setTelemetryProfileId(newEntity.getTelemetryProfileId());
        persistedEntity.setCurrentDriverId(newEntity.getCurrentDriverId());
        persistedEntity.setNumberPlate(newEntity.getNumberPlate());
        persistedEntity.setVin(newEntity.getVin());
        persistedEntity.setColor(newEntity.getColor());

        service.update(persistedEntity);

        return ResponseEntity.noContent().headers(headers).build();
    }

    @Override
    public ResponseEntity<Void> deleteVehicle(String vehicleId) {

        var headers = new HttpHeaders();
        headers.set(X_TRACE_ID, MDC.get(TRACE_ID));

        var persistedEntity = service.findById(UUID.fromString(vehicleId)).orElseThrow(
                () -> new EntityNotFoundException(String.format(Messages.VEHICLE_NOT_FOUND_FOR_ID, vehicleId)));

        service.delete(persistedEntity);

        return ResponseEntity.noContent().headers(headers).build();
    }

    @Override
    public ResponseEntity<GetVehicleResponseDto> getVehicle(String vehicleId) {

        var headers = new HttpHeaders();
        headers.set(X_TRACE_ID, MDC.get(TRACE_ID));

        var persistedEntity = service.findById(UUID.fromString(vehicleId)).orElseThrow(
                () -> new EntityNotFoundException(String.format(Messages.VEHICLE_NOT_FOUND_FOR_ID, vehicleId)));

        return ResponseEntity.ok().headers(headers).body(mapper.mapEntityToDto(persistedEntity));
    }

    @Override
    public ResponseEntity<ListVehiclesResponseDto> listVehicles() {

        var headers = new HttpHeaders();
        headers.set(X_TRACE_ID, MDC.get(TRACE_ID));

        var responseDto = mapper.convertVehicleCollectionToListDTO(service.findAll());

        return ResponseEntity.ok().headers(headers).body(responseDto);
    }
}
