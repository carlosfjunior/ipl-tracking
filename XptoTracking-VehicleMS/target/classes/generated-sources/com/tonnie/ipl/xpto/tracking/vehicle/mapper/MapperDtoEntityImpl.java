package com.tonnie.ipl.xpto.tracking.vehicle.mapper;

import com.tonnie.ipl.xpto.tracking.vehicle.model.Vehicle;
import com.tonnie.ipl.xpto.tracking.vehicle.openapi.model.CreateVehicleRequestDto;
import com.tonnie.ipl.xpto.tracking.vehicle.openapi.model.CreateVehicleResponseDto;
import com.tonnie.ipl.xpto.tracking.vehicle.openapi.model.GetVehicleResponseDto;
import com.tonnie.ipl.xpto.tracking.vehicle.openapi.model.UpdateVehicleRequestDto;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-05T14:56:03+0000",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class MapperDtoEntityImpl implements MapperDtoEntity {

    @Override
    public Vehicle mapDtoToEntity(CreateVehicleRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Vehicle.VehicleBuilder vehicle = Vehicle.builder();

        if ( dto.getCustomerOwnerId() != null ) {
            vehicle.customerOwnerId( UUID.fromString( dto.getCustomerOwnerId() ) );
        }
        if ( dto.getTelemetryProfileId() != null ) {
            vehicle.telemetryProfileId( UUID.fromString( dto.getTelemetryProfileId() ) );
        }
        if ( dto.getCurrentDriverId() != null ) {
            vehicle.currentDriverId( UUID.fromString( dto.getCurrentDriverId() ) );
        }
        vehicle.numberPlate( dto.getNumberPlate() );
        vehicle.vin( dto.getVin() );
        vehicle.color( dto.getColor() );

        return vehicle.build();
    }

    @Override
    public Vehicle mapDtoToEntity(UpdateVehicleRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Vehicle.VehicleBuilder vehicle = Vehicle.builder();

        if ( dto.getCustomerOwnerId() != null ) {
            vehicle.customerOwnerId( UUID.fromString( dto.getCustomerOwnerId() ) );
        }
        if ( dto.getTelemetryProfileId() != null ) {
            vehicle.telemetryProfileId( UUID.fromString( dto.getTelemetryProfileId() ) );
        }
        if ( dto.getCurrentDriverId() != null ) {
            vehicle.currentDriverId( UUID.fromString( dto.getCurrentDriverId() ) );
        }
        vehicle.numberPlate( dto.getNumberPlate() );
        vehicle.vin( dto.getVin() );
        vehicle.color( dto.getColor() );

        return vehicle.build();
    }

    @Override
    public GetVehicleResponseDto mapEntityToDto(Vehicle entity) {
        if ( entity == null ) {
            return null;
        }

        GetVehicleResponseDto getVehicleResponseDto = new GetVehicleResponseDto();

        getVehicleResponseDto.setVehicleId( convertUUIDToString( entity.getId() ) );
        if ( entity.getCustomerOwnerId() != null ) {
            getVehicleResponseDto.setCustomerOwnerId( entity.getCustomerOwnerId().toString() );
        }
        if ( entity.getTelemetryProfileId() != null ) {
            getVehicleResponseDto.setTelemetryProfileId( entity.getTelemetryProfileId().toString() );
        }
        if ( entity.getCurrentDriverId() != null ) {
            getVehicleResponseDto.setCurrentDriverId( entity.getCurrentDriverId().toString() );
        }
        getVehicleResponseDto.setNumberPlate( entity.getNumberPlate() );
        getVehicleResponseDto.setVin( entity.getVin() );
        getVehicleResponseDto.setColor( entity.getColor() );

        return getVehicleResponseDto;
    }

    @Override
    public CreateVehicleResponseDto mapEntityToCreateResponseDto(Vehicle entity) {
        if ( entity == null ) {
            return null;
        }

        CreateVehicleResponseDto createVehicleResponseDto = new CreateVehicleResponseDto();

        createVehicleResponseDto.setVehicleId( convertUUIDToString( entity.getId() ) );

        return createVehicleResponseDto;
    }
}
