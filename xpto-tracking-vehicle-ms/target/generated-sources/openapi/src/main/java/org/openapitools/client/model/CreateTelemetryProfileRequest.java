/*
 * IPL Tracking - Microservice API
 * API description for Tracking microservice.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateTelemetryProfileRequest
 */
@JsonPropertyOrder({
  CreateTelemetryProfileRequest.JSON_PROPERTY_NAME,
  CreateTelemetryProfileRequest.JSON_PROPERTY_SENSORS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-05T14:56:00.970714Z[Europe/Lisbon]")
public class CreateTelemetryProfileRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SENSORS = "sensors";
  private List<String> sensors = null;

  public CreateTelemetryProfileRequest() {
  }

  public CreateTelemetryProfileRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Complete TelemetryProfile name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Foo bar", required = true, value = "Complete TelemetryProfile name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateTelemetryProfileRequest sensors(List<String> sensors) {
    
    this.sensors = sensors;
    return this;
  }

  public CreateTelemetryProfileRequest addSensorsItem(String sensorsItem) {
    if (this.sensors == null) {
      this.sensors = new ArrayList<>();
    }
    this.sensors.add(sensorsItem);
    return this;
  }

   /**
   * unique identifier of the sensors in the database
   * @return sensors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "unique identifier of the sensors in the database")
  @JsonProperty(JSON_PROPERTY_SENSORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSensors() {
    return sensors;
  }


  @JsonProperty(JSON_PROPERTY_SENSORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    CreateTelemetryProfileRequest createTelemetryProfileRequest = (CreateTelemetryProfileRequest) o;
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
    sb.append("class CreateTelemetryProfileRequest {\n");
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
