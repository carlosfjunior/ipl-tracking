package com.tonnie.ipl.xpto.tracking.telemetry.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateTelemetryProfileResponseDto
 */

@JsonTypeName("CreateTelemetryProfileResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-05T16:21:28.969664Z[Europe/Lisbon]")
public class CreateTelemetryProfileResponseDto {

  @JsonProperty("telemetryprofileId")
  private String telemetryprofileId;

  public CreateTelemetryProfileResponseDto telemetryprofileId(String telemetryprofileId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTelemetryProfileResponseDto createTelemetryProfileResponse = (CreateTelemetryProfileResponseDto) o;
    return Objects.equals(this.telemetryprofileId, createTelemetryProfileResponse.telemetryprofileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telemetryprofileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTelemetryProfileResponseDto {\n");
    sb.append("    telemetryprofileId: ").append(toIndentedString(telemetryprofileId)).append("\n");
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

