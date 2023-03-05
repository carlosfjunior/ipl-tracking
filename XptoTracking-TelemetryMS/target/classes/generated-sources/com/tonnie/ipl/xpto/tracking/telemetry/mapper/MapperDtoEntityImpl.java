package com.tonnie.ipl.xpto.tracking.telemetry.mapper;

import com.tonnie.ipl.xpto.tracking.telemetry.model.Sensor;
import com.tonnie.ipl.xpto.tracking.telemetry.model.TelemetryProfile;
import com.tonnie.ipl.xpto.tracking.telemetry.openapi.model.CreateSensorRequestDto;
import com.tonnie.ipl.xpto.tracking.telemetry.openapi.model.CreateSensorResponseDto;
import com.tonnie.ipl.xpto.tracking.telemetry.openapi.model.CreateTelemetryProfileRequestDto;
import com.tonnie.ipl.xpto.tracking.telemetry.openapi.model.CreateTelemetryProfileResponseDto;
import com.tonnie.ipl.xpto.tracking.telemetry.openapi.model.GetSensorResponseDto;
import com.tonnie.ipl.xpto.tracking.telemetry.openapi.model.GetTelemetryProfileResponseDto;
import com.tonnie.ipl.xpto.tracking.telemetry.openapi.model.UpdateSensorRequestDto;
import com.tonnie.ipl.xpto.tracking.telemetry.openapi.model.UpdateTelemetryProfileRequestDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-05T16:21:31+0000",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class MapperDtoEntityImpl implements MapperDtoEntity {

    @Override
    public Sensor mapDtoToEntity(CreateSensorRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Sensor.SensorBuilder sensor = Sensor.builder();

        sensor.type( convertEnumSensorTypeDtoToSensorType( dto.getSensorType() ) );
        sensor.name( dto.getName() );
        if ( dto.getMinValue() != null ) {
            sensor.minValue( dto.getMinValue().doubleValue() );
        }
        if ( dto.getMaxValue() != null ) {
            sensor.maxValue( dto.getMaxValue().doubleValue() );
        }
        sensor.unit( dto.getUnit() );

        return sensor.build();
    }

    @Override
    public Sensor mapDtoToEntity(UpdateSensorRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Sensor.SensorBuilder sensor = Sensor.builder();

        sensor.type( convertEnumSensorTypeDtoToSensorType( dto.getSensorType() ) );
        sensor.name( dto.getName() );
        if ( dto.getMinValue() != null ) {
            sensor.minValue( dto.getMinValue().doubleValue() );
        }
        if ( dto.getMaxValue() != null ) {
            sensor.maxValue( dto.getMaxValue().doubleValue() );
        }
        sensor.unit( dto.getUnit() );

        return sensor.build();
    }

    @Override
    public TelemetryProfile mapDtoToEntity(CreateTelemetryProfileRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        TelemetryProfile.TelemetryProfileBuilder telemetryProfile = TelemetryProfile.builder();

        telemetryProfile.sensors( convertDTOArrayToCollection( dto.getSensors() ) );
        telemetryProfile.name( dto.getName() );

        return telemetryProfile.build();
    }

    @Override
    public TelemetryProfile mapDtoToEntity(UpdateTelemetryProfileRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        TelemetryProfile.TelemetryProfileBuilder telemetryProfile = TelemetryProfile.builder();

        telemetryProfile.sensors( convertDTOArrayToCollection( dto.getSensors() ) );
        telemetryProfile.name( dto.getName() );

        return telemetryProfile.build();
    }

    @Override
    public GetSensorResponseDto mapEntityToDto(Sensor entity) {
        if ( entity == null ) {
            return null;
        }

        GetSensorResponseDto getSensorResponseDto = new GetSensorResponseDto();

        getSensorResponseDto.setSensorType( convertSensorTypeToSensorEnumSensorTypeDto( entity.getType() ) );
        getSensorResponseDto.setSensorId( convertUUIDToString( entity.getId() ) );
        getSensorResponseDto.setName( entity.getName() );
        if ( entity.getMinValue() != null ) {
            getSensorResponseDto.setMinValue( BigDecimal.valueOf( entity.getMinValue() ) );
        }
        if ( entity.getMaxValue() != null ) {
            getSensorResponseDto.setMaxValue( BigDecimal.valueOf( entity.getMaxValue() ) );
        }
        getSensorResponseDto.setUnit( entity.getUnit() );

        return getSensorResponseDto;
    }

    @Override
    public CreateSensorResponseDto mapEntityToCreateResponseDto(Sensor entity) {
        if ( entity == null ) {
            return null;
        }

        CreateSensorResponseDto createSensorResponseDto = new CreateSensorResponseDto();

        createSensorResponseDto.setSensorId( convertUUIDToString( entity.getId() ) );

        return createSensorResponseDto;
    }

    @Override
    public GetTelemetryProfileResponseDto mapEntityToDto(TelemetryProfile entity) {
        if ( entity == null ) {
            return null;
        }

        GetTelemetryProfileResponseDto getTelemetryProfileResponseDto = new GetTelemetryProfileResponseDto();

        getTelemetryProfileResponseDto.setTelemetryprofileId( convertUUIDToString( entity.getId() ) );
        getTelemetryProfileResponseDto.setName( entity.getName() );
        getTelemetryProfileResponseDto.setSensors( sensorSetToGetSensorResponseDtoList( entity.getSensors() ) );

        return getTelemetryProfileResponseDto;
    }

    @Override
    public CreateTelemetryProfileResponseDto mapEntityToCreateResponseDto(TelemetryProfile entity) {
        if ( entity == null ) {
            return null;
        }

        CreateTelemetryProfileResponseDto createTelemetryProfileResponseDto = new CreateTelemetryProfileResponseDto();

        createTelemetryProfileResponseDto.setTelemetryprofileId( convertUUIDToString( entity.getId() ) );

        return createTelemetryProfileResponseDto;
    }

    protected List<GetSensorResponseDto> sensorSetToGetSensorResponseDtoList(Set<Sensor> set) {
        if ( set == null ) {
            return null;
        }

        List<GetSensorResponseDto> list = new ArrayList<GetSensorResponseDto>( set.size() );
        for ( Sensor sensor : set ) {
            list.add( mapEntityToDto( sensor ) );
        }

        return list;
    }
}
