package com.tonnie.ipl.xpto.tracking.telemetry.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tonnie.ipl.xpto.tracking.telemetry.openapi.model.GetSensorResponseDto;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetTelemetryProfileResponseDto
 */

@JsonTypeName("GetTelemetryProfileResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-05T16:21:28.969664Z[Europe/Lisbon]")
public class GetTelemetryProfileResponseDto {

  @JsonProperty("telemetryprofileId")
  private String telemetryprofileId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("sensors")
  @Valid
  private List<GetSensorResponseDto> sensors = new ArrayList<>();

  public GetTelemetryProfileResponseDto telemetryprofileId(String telemetryprofileId) {
    this.telemetryprofileId = telemetryprofileId;
    return this;
  }

  /**
   * Get telemetryprofileId
   * @return telemetryprofileId
  */
  @NotNull @Pattern(regexp = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$") 
  @Schema(name = "telemetryprofileId", example = "0af401df-7d7a-1f36-817d-7b0a058d0003", required = true)
  public String getTelemetryprofileId() {
    return telemetryprofileId;
  }

  public void setTelemetryprofileId(String telemetryprofileId) {
    this.telemetryprofileId = telemetryprofileId;
  }

  public GetTelemetryProfileResponseDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Complete TelemetryProfile name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Foo bar", description = "Complete TelemetryProfile name", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetTelemetryProfileResponseDto sensors(List<GetSensorResponseDto> sensors) {
    this.sensors = sensors;
    return this;
  }

  public GetTelemetryProfileResponseDto addSensorsItem(GetSensorResponseDto sensorsItem) {
    this.sensors.add(sensorsItem);
    return this;
  }

  /**
   * Sensors associated
   * @return sensors
  */
  @NotNull @Valid 
  @Schema(name = "sensors", description = "Sensors associated", required = true)
  public List<GetSensorResponseDto> getSensors() {
    return sensors;
  }

  public void setSensors(List<GetSensorResponseDto> sensors) {
    this.sensors = sensors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTelemetryProfileResponseDto getTelemetryProfileResponse = (GetTelemetryProfileResponseDto) o;
    return Objects.equals(this.telemetryprofileId, getTelemetryProfileResponse.telemetryprofileId) &&
        Objects.equals(this.name, getTelemetryProfileResponse.name) &&
        Objects.equals(this.sensors, getTelemetryProfileResponse.sensors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telemetryprofileId, name, sensors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTelemetryProfileResponseDto {\n");
    sb.append("    telemetryprofileId: ").append(toIndentedString(telemetryprofileId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sensors: ").append(toIndentedString(sensors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

