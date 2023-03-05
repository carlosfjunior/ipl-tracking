package com.tonnie.ipl.xpto.tracking.vehicle.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * type of Sensor
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-05T14:55:59.947775Z[Europe/Lisbon]")
public enum EnumSensorTypeDto {
  
  RPM("RPM"),
  
  ODOMETER("ODOMETER"),
  
  SPEED("SPEED");

  private String value;

  EnumSensorTypeDto(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EnumSensorTypeDto fromValue(String value) {
    for (EnumSensorTypeDto b : EnumSensorTypeDto.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

