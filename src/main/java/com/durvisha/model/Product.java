package com.durvisha.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonSerialize
@JsonDeserialize
@JsonIgnoreProperties
@JsonPOJOBuilder
@JsonAutoDetect
@JsonClassDescription("Product Json")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "productName"
})
public class Product  {

    @JsonProperty("productName")
    private String productName;
}
