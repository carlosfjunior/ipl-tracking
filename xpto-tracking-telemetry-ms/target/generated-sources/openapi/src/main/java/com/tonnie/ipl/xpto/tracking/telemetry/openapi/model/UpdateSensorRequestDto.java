package com.tonnie.ipl.xpto.tracking.telemetry.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tonnie.ipl.xpto.tracking.telemetry.openapi.model.EnumSensorTypeDto;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateSensorRequestDto
 */

@JsonTypeName("UpdateSensorRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-05T16:21:28.645059Z[Europe/Lisbon]")
public class UpdateSensorRequestDto {

  @JsonProperty("name")
  private String name;

  @JsonProperty("sensor_type")
  private EnumSensorTypeDto sensorType;

  @JsonProperty("minValue")
  private BigDecimal minValue;

  @JsonProperty("maxValue")
  private BigDecimal maxValue;

  @JsonProperty("unit")
  private String unit;

  public UpdateSensorRequestDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Complete Sensor name
   * @return name
  */
  
  @Schema(name = "name", example = "Foo bar", description = "Complete Sensor name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateSensorRequestDto sensorType(EnumSensorTypeDto sensorType) {
    this.sensorType = sensorType;
    return this;
  }

  /**
   * Get sensorType
   * @return sensorType
  */
  @Valid 
  @Schema(name = "sensor_type", required = false)
  public EnumSensorTypeDto getSensorType() {
    return sensorType;
  }

  public void setSensorType(EnumSensorTypeDto sensorType) {
    this.sensorType = sensorType;
  }

  public UpdateSensorRequestDto minValue(BigDecimal minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Min value allowed
   * @return minValue
  */
  @Valid 
  @Schema(name = "minValue", example = "0.0", description = "Min value allowed", required = false)
  public BigDecimal getMinValue() {
    return minValue;
  }

  public void setMinValue(BigDecimal minValue) {
    this.minValue = minValue;
  }

  public UpdateSensorRequestDto maxValue(BigDecimal maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Max value allowed
   * @return maxValue
  */
  @Valid 
  @Schema(name = "maxValue", example = "255.0", description = "Max value allowed", required = false)
  public BigDecimal getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(BigDecimal maxValue) {
    this.maxValue = maxValue;
  }

  public UpdateSensorRequestDto unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Unit
   * @return unit
  */
  
  @Schema(name = "unit", example = "Km/h", description = "Unit", required = false)
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSensorRequestDto updateSensorRequest = (UpdateSensorRequestDto) o;
    return Objects.equals(this.name, updateSensorRequest.name) &&
        Objects.equals(this.sensorType, updateSensorRequest.sensorType) &&
        Objects.equals(this.minValue, updateSensorRequest.minValue) &&
        Objects.equals(this.maxValue, updateSensorRequest.maxValue) &&
        Objects.equals(this.unit, updateSensorRequest.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sensorType, minValue, maxValue, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSensorRequestDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sensorType: ").append(toIndentedString(sensorType)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

