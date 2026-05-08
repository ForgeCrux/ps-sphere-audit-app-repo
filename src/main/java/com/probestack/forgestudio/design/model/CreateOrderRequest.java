package com.probestack.forgestudio.design.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.probestack.forgestudio.design.model.OrderItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateOrderRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-08T17:13:08.912352659Z[GMT]")public class CreateOrderRequest {

  private String customerId;

  @Valid
  private List<@Valid OrderItem> items = new ArrayList<>();

  public CreateOrderRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateOrderRequest(String customerId, List<@Valid OrderItem> items) {
    this.customerId = customerId;
    this.items = items;
  }

  public CreateOrderRequest customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  @NotNull   @Schema(name = "customerId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public CreateOrderRequest items(List<@Valid OrderItem> items) {
    this.items = items;
    return this;
  }

  public CreateOrderRequest addItemsItem(OrderItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @NotNull @Valid   @Schema(name = "items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid OrderItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrderItem> items) {
    this.items = items;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderRequest createOrderRequest = (CreateOrderRequest) o;
    return Objects.equals(this.customerId, createOrderRequest.customerId) &&
        Objects.equals(this.items, createOrderRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequest {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

