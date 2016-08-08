
package com.br.camarllon.marvelorchestrator.models;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "path",
    "extension"
})
public class Image {

    @JsonProperty("path")
    public String path;
    @JsonProperty("extension")
    public String extension;

}
