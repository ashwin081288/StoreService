package com.durvisha.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Generated;

@Generated
@Builder
@JsonSerialize
@JsonDeserialize
@JsonIgnoreProperties
@JsonPOJOBuilder
@JsonAutoDetect
@JsonClassDescription("Item Json")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "itemName"
})
public class Item {

    @JsonProperty("itemName")
    private String itemName;

}
