package com.tonnie.ipl.xpto.tracking.telemetry.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * CreateTelemetryProfileRequestDto
 */

@JsonTypeName("CreateTelemetryProfileRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-05T16:21:28.969664Z[Europe/Lisbon]")
public class CreateTelemetryProfileRequestDto {

  @JsonProperty("name")
  private String name;

  @JsonProperty("sensors")
  @Valid
  private List<String> sensors = null;

  public CreateTelemetryProfileRequestDto name(String name) {
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

  public CreateTelemetryProfileRequestDto sensors(List<String> sensors) {
    this.sensors = sensors;
    return this;
  }

  public CreateTelemetryProfileRequestDto addSensorsItem(String sensorsItem) {
    if (this.sensors == null) {
      this.sensors = new ArrayList<>();
    }
    this.sensors.add(sensorsItem);
    return this;
  }

  /**
   * unique identifier of the sensors in the database
   * @return sensors
  */
  
  @Schema(name = "sensors", description = "unique identifier of the sensors in the database", required = false)
  public List<String> getSensors() {
    return sensors;
  }

  public void setSensors(List<String> sensors) {
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
    CreateTelemetryProfileRequestDto createTelemetryProfileRequest = (CreateTelemetryProfileRequestDto) o;
    return Objects.equals(this.name, createTelemetryProfileRequest.name) &&
        Objects.equals(this.sensors, createTelemetryProfileRequest.sensors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sensors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTelemetryProfileRequestDto {\n");
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

