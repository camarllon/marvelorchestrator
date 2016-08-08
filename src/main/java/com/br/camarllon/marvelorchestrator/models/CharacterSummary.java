
package com.br.camarllon.marvelorchestrator.models;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "resourceURI",
    "name",
    "role"
})
public class CharacterSummary {

    @JsonProperty("resourceURI")
    public String resourceURI;
    @JsonProperty("name")
    public String name;
    @JsonProperty("role")
    public String role;

}
