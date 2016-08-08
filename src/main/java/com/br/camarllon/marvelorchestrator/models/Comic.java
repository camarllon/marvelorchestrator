
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
    "digitalId",
    "title",
    "issueNumber",
    "variantDescription",
    "description",
    "modified",
    "isbn",
    "upc",
    "diamondCode",
    "ean",
    "issn",
    "format",
    "pageCount",
    "textObjects",
    "resourceURI",
    "urls",
    "series",
    "variants",
    "collections",
    "collectedIssues",
    "dates",
    "prices",
    "thumbnail",
    "images",
    "creators",
    "characters",
    "stories",
    "events"
})
public class Comic {

    @JsonProperty("id")
    public int id;
    @JsonProperty("digitalId")
    public int digitalId;
    @JsonProperty("title")
    public String title;
    @JsonProperty("issueNumber")
    public String issueNumber;
    @JsonProperty("variantDescription")
    public String variantDescription;
    @JsonProperty("description")
    public String description;
    @JsonProperty("modified")
    public String modified;
    @JsonProperty("isbn")
    public String isbn;
    @JsonProperty("upc")
    public String upc;
    @JsonProperty("diamondCode")
    public String diamondCode;
    @JsonProperty("ean")
    public String ean;
    @JsonProperty("issn")
    public String issn;
    @JsonProperty("format")
    public String format;
    @JsonProperty("pageCount")
    public int pageCount;
    @JsonProperty("textObjects")
    public List<TextObject> textObjects = new ArrayList<TextObject>();
    @JsonProperty("resourceURI")
    public String resourceURI;
    @JsonProperty("urls")
    public List<Url> urls = new ArrayList<Url>();
    @JsonProperty("series")
    public SeriesList series;
    @JsonProperty("variants")
    public List<ComicSummary> variants = new ArrayList<ComicSummary>();
    @JsonProperty("collections")
    public List<ComicSummary> collections = new ArrayList<ComicSummary>();
    @JsonProperty("collectedIssues")
    public List<ComicSummary> collectedIssues = new ArrayList<ComicSummary>();
    @JsonProperty("dates")
    public List<ComicDate> dates = new ArrayList<ComicDate>();
    @JsonProperty("prices")
    public List<ComicPrice> prices = new ArrayList<ComicPrice>();
    @JsonProperty("thumbnail")
    public Image thumbnail;
    @JsonProperty("images")
    public List<Image> images = new ArrayList<Image>();
    @JsonProperty("creators")
    public CreatorList creators;
    @JsonProperty("characters")
    public CharacterList characters;
    @JsonProperty("stories")
    public StorieList stories;
    @JsonProperty("events")
    public EventList events;

}
