
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
    "id",
    "name",
    "description",
    "modified",
    "resourceURI",
    "urls",
    "thumbnail",
    "comics",
    "stories",
    "events",
    "series"
})
public class Character {

    @JsonProperty("id")
    public int id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("description")
    public String description;
    @JsonProperty("modified")
    public String modified;
    @JsonProperty("resourceURI")
    public String resourceURI;
    @JsonProperty("urls")
    public List<Url> urls = new ArrayList<Url>();
    @JsonProperty("thumbnail")
    public Image thumbnail;
    @JsonProperty("comics")
    public ComicList comics;
    @JsonProperty("stories")
    public StorieList stories;
    @JsonProperty("events")
    public EventList events;
    @JsonProperty("series")
    public SeriesList series;

}
