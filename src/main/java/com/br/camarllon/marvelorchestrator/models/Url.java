
package com.br.camarllon.marvelorchestrator.models;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "type",
    "url"
})
public class Url {

    @JsonProperty("type")
    public String type;
    @JsonProperty("url")
    public String url;

}
