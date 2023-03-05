package com.tonnie.ipl.xpto.tracking.vehicle.openapi.model;

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
 * CreateVehicleRequestDto
 */

@JsonTypeName("CreateVehicleRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-05T14:56:00.318047Z[Europe/Lisbon]")
public class CreateVehicleRequestDto {

  @JsonProperty("customerOwnerId")
  private String customerOwnerId;

  @JsonProperty("telemetryProfileId")
  private String telemetryProfileId;

  @JsonProperty("currentDriverId")
  private String currentDriverId;

  @JsonProperty("numberPlate")
  private String numberPlate;

  @JsonProperty("vin")
  private String vin;

  @JsonProperty("color")
  private String color;

  public CreateVehicleRequestDto customerOwnerId(String customerOwnerId) {
    this.customerOwnerId = customerOwnerId;
    return this;
  }

  /**
   * Get customerOwnerId
   * @return customerOwnerId
  */
  @NotNull @Pattern(regexp = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$") 
  @Schema(name = "customerOwnerId", example = "0af401df-7d7a-1f36-817d-7b0a058d0003", required = true)
  public String getCustomerOwnerId() {
    return customerOwnerId;
  }

  public void setCustomerOwnerId(String customerOwnerId) {
    this.customerOwnerId = customerOwnerId;
  }

  public CreateVehicleRequestDto telemetryProfileId(String telemetryProfileId) {
    this.telemetryProfileId = telemetryProfileId;
    return this;
  }

  /**
   * Get telemetryProfileId
   * @return telemetryProfileId
  */
  @NotNull @Pattern(regexp = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$") 
  @Schema(name = "telemetryProfileId", example = "0af401df-7d7a-1f36-817d-7b0a058d0003", required = true)
  public String getTelemetryProfileId() {
    return telemetryProfileId;
  }

  public void setTelemetryProfileId(String telemetryProfileId) {
    this.telemetryProfileId = telemetryProfileId;
  }

  public CreateVehicleRequestDto currentDriverId(String currentDriverId) {
    this.currentDriverId = currentDriverId;
    return this;
  }

  /**
   * Get currentDriverId
   * @return currentDriverId
  */
  @NotNull @Pattern(regexp = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$") 
  @Schema(name = "currentDriverId", example = "0af401df-7d7a-1f36-817d-7b0a058d0003", required = true)
  public String getCurrentDriverId() {
    return currentDriverId;
  }

  public void setCurrentDriverId(String currentDriverId) {
    this.currentDriverId = currentDriverId;
  }

  public CreateVehicleRequestDto numberPlate(String numberPlate) {
    this.numberPlate = numberPlate;
    return this;
  }

  /**
   * Number Plate
   * @return numberPlate
  */
  @NotNull 
  @Schema(name = "numberPlate", example = "AG-78-RH", description = "Number Plate", required = true)
  public String getNumberPlate() {
    return numberPlate;
  }

  public void setNumberPlate(String numberPlate) {
    this.numberPlate = numberPlate;
  }

  public CreateVehicleRequestDto vin(String vin) {
    this.vin = vin;
    return this;
  }

  /**
   * Vehicle Identification Number
   * @return vin
  */
  @NotNull 
  @Schema(name = "vin", example = "4Y1SL65848Z411439", description = "Vehicle Identification Number", required = true)
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public CreateVehicleRequestDto color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Color
   * @return color
  */
  @NotNull 
  @Schema(name = "color", example = "Red", description = "Color", required = true)
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVehicleRequestDto createVehicleRequest = (CreateVehicleRequestDto) o;
    return Objects.equals(this.customerOwnerId, createVehicleRequest.customerOwnerId) &&
        Objects.equals(this.telemetryProfileId, createVehicleRequest.telemetryProfileId) &&
        Objects.equals(this.currentDriverId, createVehicleRequest.currentDriverId) &&
        Objects.equals(this.numberPlate, createVehicleRequest.numberPlate) &&
        Objects.equals(this.vin, createVehicleRequest.vin) &&
        Objects.equals(this.color, createVehicleRequest.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOwnerId, telemetryProfileId, currentDriverId, numberPlate, vin, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVehicleRequestDto {\n");
    sb.append("    customerOwnerId: ").append(toIndentedString(customerOwnerId)).append("\n");
    sb.append("    telemetryProfileId: ").append(toIndentedString(telemetryProfileId)).append("\n");
    sb.append("    currentDriverId: ").append(toIndentedString(currentDriverId)).append("\n");
    sb.append("    numberPlate: ").append(toIndentedString(numberPlate)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

