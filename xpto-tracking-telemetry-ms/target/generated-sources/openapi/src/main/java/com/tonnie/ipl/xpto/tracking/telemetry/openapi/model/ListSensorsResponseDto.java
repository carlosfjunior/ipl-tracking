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
 * generic paged response
 */

@Schema(name = "ListSensorsResponse", description = "generic paged response")
@JsonTypeName("ListSensorsResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-05T16:21:28.645059Z[Europe/Lisbon]")
public class ListSensorsResponseDto {

  @JsonProperty("content")
  @Valid
  private List<GetSensorResponseDto> content = new ArrayList<>();

  @JsonProperty("totalResults")
  private Long totalResults;

  public ListSensorsResponseDto content(List<GetSensorResponseDto> content) {
    this.content = content;
    return this;
  }

  public ListSensorsResponseDto addContentItem(GetSensorResponseDto contentItem) {
    this.content.add(contentItem);
    return this;
  }

  /**
   * list of paged items
   * @return content
  */
  @NotNull @Valid 
  @Schema(name = "content", description = "list of paged items", required = true)
  public List<GetSensorResponseDto> getContent() {
    return content;
  }

  public void setContent(List<GetSensorResponseDto> content) {
    this.content = content;
  }

  public ListSensorsResponseDto totalResults(Long totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  /**
   * total number of records
   * @return totalResults
  */
  @NotNull 
  @Schema(name = "totalResults", example = "50", description = "total number of records", required = true)
  public Long getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Long totalResults) {
    this.totalResults = totalResults;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSensorsResponseDto listSensorsResponse = (ListSensorsResponseDto) o;
    return Objects.equals(this.content, listSensorsResponse.content) &&
        Objects.equals(this.totalResults, listSensorsResponse.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, totalResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSensorsResponseDto {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
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

