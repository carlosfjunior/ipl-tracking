package com.tonnie.ipl.xpto.tracking.telemetry.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tonnie.ipl.xpto.tracking.telemetry.openapi.model.ErrorTypeEnumDto;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ErrorResponseDto
 */

@JsonTypeName("ErrorResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-05T16:21:28.969664Z[Europe/Lisbon]")
public class ErrorResponseDto {

  @JsonProperty("code")
  private String code;

  @JsonProperty("type")
  private ErrorTypeEnumDto type;

  @JsonProperty("message")
  private String message;

  @JsonProperty("details")
  private String details;

  public ErrorResponseDto code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Application error code
   * @return code
  */
  
  @Schema(name = "code", example = "CST0001", description = "Application error code", required = false)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorResponseDto type(ErrorTypeEnumDto type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", required = false)
  public ErrorTypeEnumDto getType() {
    return type;
  }

  public void setType(ErrorTypeEnumDto type) {
    this.type = type;
  }

  public ErrorResponseDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Short error explanation
   * @return message
  */
  
  @Schema(name = "message", example = "Unauthorized", description = "Short error explanation", required = false)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorResponseDto details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Short error detail
   * @return details
  */
  
  @Schema(name = "details", example = "Parameter X has invalid value", description = "Short error detail", required = false)
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponseDto errorResponse = (ErrorResponseDto) o;
    return Objects.equals(this.code, errorResponse.code) &&
        Objects.equals(this.type, errorResponse.type) &&
        Objects.equals(this.message, errorResponse.message) &&
        Objects.equals(this.details, errorResponse.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseDto {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

