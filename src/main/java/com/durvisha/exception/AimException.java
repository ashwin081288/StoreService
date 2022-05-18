package com.durvisha.exception;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;

import java.util.Date;

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
public class AimException extends java.lang.Exception {
    @JsonProperty("statusCode")
    private int statusCode;
    @JsonProperty("timestamp")
    private Date timestamp;
    @JsonProperty("message")
    private String message;
    @JsonProperty("description")
    private String description;

}