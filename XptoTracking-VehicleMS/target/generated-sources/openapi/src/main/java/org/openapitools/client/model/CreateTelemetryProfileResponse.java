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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateTelemetryProfileResponse
 */
@JsonPropertyOrder({
  CreateTelemetryProfileResponse.JSON_PROPERTY_TELEMETRYPROFILE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-05T14:56:00.970714Z[Europe/Lisbon]")
public class CreateTelemetryProfileResponse {
  public static final String JSON_PROPERTY_TELEMETRYPROFILE_ID = "telemetryprofileId";
  private String telemetryprofileId;

  public CreateTelemetryProfileResponse() {
  }

  public CreateTelemetryProfileResponse telemetryprofileId(String telemetryprofileId) {
    
    this.telemetryprofileId = telemetryprofileId;
    return this;
  }

   /**
   * Get telemetryprofileId
   * @return telemetryprofileId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0af401df-7d7a-1f36-817d-7b0a058d0003", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TELEMETRYPROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTelemetryprofileId() {
    return telemetryprofileId;
  }


  @JsonProperty(JSON_PROPERTY_TELEMETRYPROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    CreateTelemetryProfileResponse createTelemetryProfileResponse = (CreateTelemetryProfileResponse) o;
    return Objects.equals(this.telemetryprofileId, createTelemetryProfileResponse.telemetryprofileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telemetryprofileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTelemetryProfileResponse {\n");
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
