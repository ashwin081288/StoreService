package com.durvisha.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonSerialize
@JsonDeserialize
@JsonIgnoreProperties
@JsonPOJOBuilder
@JsonAutoDetect
@JsonClassDescription("Store Json")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "invoice",
        "item",
        "product"
})
public class Store  {

    @JsonProperty("invoice")
    private String invoice;
    @JsonProperty("item")
    private Item item;
    @JsonProperty("product")
    private Product product;

}
