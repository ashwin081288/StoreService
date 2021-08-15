package com.durvisha.exception;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonSerialize
@JsonDeserialize
@JsonIgnoreProperties
@JsonIgnoreType
@JsonPOJOBuilder
@JsonAutoDetect
@JsonClassDescription("Aim Exception Json")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "statusCode",
        "timestamp",
        "message",
        "description"
})
public class AimException {
    @JsonProperty("statusCode")
    private int statusCode;
    @JsonProperty("timestamp")
    private Date timestamp;
    @JsonProperty("message")
    private String message;
    @JsonProperty("description")
    private String description;

}