
package com.br.camarllon.marvelorchestrator.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "offset",
    "limit",
    "total",
    "count",
    "results"
})
public class ComicDataContainer {

    @JsonProperty("offset")
    public int offset;
    @JsonProperty("limit")
    public int limit;
    @JsonProperty("total")
    public int total;
    @JsonProperty("count")
    public int count;
    @JsonProperty("results")
    public List<Comic> results = new ArrayList<Comic>();

}
