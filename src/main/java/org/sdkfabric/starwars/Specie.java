/**
 * Specie automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.starwars;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.time.LocalDateTime;
import java.util.List;

/**
 * A Species resource is a type of person or character within the Star Wars Universe.
 */
public class Specie {
    private String name;
    private String classification;
    private String designation;
    private String averageHeight;
    private String averageLifespan;
    private String eyeColors;
    private String hairColors;
    private String skinColors;
    private String language;
    private String homeworld;
    private List<String> people;
    private List<String> films;
    private String url;
    private LocalDateTime created;
    private LocalDateTime edited;
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    @JsonSetter("classification")
    public void setClassification(String classification) {
        this.classification = classification;
    }
    @JsonGetter("classification")
    public String getClassification() {
        return this.classification;
    }
    @JsonSetter("designation")
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    @JsonGetter("designation")
    public String getDesignation() {
        return this.designation;
    }
    @JsonSetter("average_height")
    public void setAverageHeight(String averageHeight) {
        this.averageHeight = averageHeight;
    }
    @JsonGetter("average_height")
    public String getAverageHeight() {
        return this.averageHeight;
    }
    @JsonSetter("average_lifespan")
    public void setAverageLifespan(String averageLifespan) {
        this.averageLifespan = averageLifespan;
    }
    @JsonGetter("average_lifespan")
    public String getAverageLifespan() {
        return this.averageLifespan;
    }
    @JsonSetter("eye_colors")
    public void setEyeColors(String eyeColors) {
        this.eyeColors = eyeColors;
    }
    @JsonGetter("eye_colors")
    public String getEyeColors() {
        return this.eyeColors;
    }
    @JsonSetter("hair_colors")
    public void setHairColors(String hairColors) {
        this.hairColors = hairColors;
    }
    @JsonGetter("hair_colors")
    public String getHairColors() {
        return this.hairColors;
    }
    @JsonSetter("skin_colors")
    public void setSkinColors(String skinColors) {
        this.skinColors = skinColors;
    }
    @JsonGetter("skin_colors")
    public String getSkinColors() {
        return this.skinColors;
    }
    @JsonSetter("language")
    public void setLanguage(String language) {
        this.language = language;
    }
    @JsonGetter("language")
    public String getLanguage() {
        return this.language;
    }
    @JsonSetter("homeworld")
    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }
    @JsonGetter("homeworld")
    public String getHomeworld() {
        return this.homeworld;
    }
    @JsonSetter("people")
    public void setPeople(List<String> people) {
        this.people = people;
    }
    @JsonGetter("people")
    public List<String> getPeople() {
        return this.people;
    }
    @JsonSetter("films")
    public void setFilms(List<String> films) {
        this.films = films;
    }
    @JsonGetter("films")
    public List<String> getFilms() {
        return this.films;
    }
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }
    @JsonGetter("url")
    public String getUrl() {
        return this.url;
    }
    @JsonSetter("created")
    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
    @JsonGetter("created")
    public LocalDateTime getCreated() {
        return this.created;
    }
    @JsonSetter("edited")
    public void setEdited(LocalDateTime edited) {
        this.edited = edited;
    }
    @JsonGetter("edited")
    public LocalDateTime getEdited() {
        return this.edited;
    }
}
