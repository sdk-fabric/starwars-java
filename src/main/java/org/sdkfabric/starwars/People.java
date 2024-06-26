/**
 * People automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.starwars;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.time.LocalDateTime;
import java.util.List;

/**
 * A People is an individual person or character within the Star Wars universe
 */
public class People {
    private String name;
    private String birthYear;
    private String eyeColor;
    private String gender;
    private String hairColor;
    private String height;
    private String mass;
    private String skinColor;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> starships;
    private List<String> vehicles;
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
    @JsonSetter("birth_year")
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }
    @JsonGetter("birth_year")
    public String getBirthYear() {
        return this.birthYear;
    }
    @JsonSetter("eye_color")
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    @JsonGetter("eye_color")
    public String getEyeColor() {
        return this.eyeColor;
    }
    @JsonSetter("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }
    @JsonGetter("gender")
    public String getGender() {
        return this.gender;
    }
    @JsonSetter("hair_color")
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    @JsonGetter("hair_color")
    public String getHairColor() {
        return this.hairColor;
    }
    @JsonSetter("height")
    public void setHeight(String height) {
        this.height = height;
    }
    @JsonGetter("height")
    public String getHeight() {
        return this.height;
    }
    @JsonSetter("mass")
    public void setMass(String mass) {
        this.mass = mass;
    }
    @JsonGetter("mass")
    public String getMass() {
        return this.mass;
    }
    @JsonSetter("skin_color")
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
    @JsonGetter("skin_color")
    public String getSkinColor() {
        return this.skinColor;
    }
    @JsonSetter("homeworld")
    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }
    @JsonGetter("homeworld")
    public String getHomeworld() {
        return this.homeworld;
    }
    @JsonSetter("films")
    public void setFilms(List<String> films) {
        this.films = films;
    }
    @JsonGetter("films")
    public List<String> getFilms() {
        return this.films;
    }
    @JsonSetter("species")
    public void setSpecies(List<String> species) {
        this.species = species;
    }
    @JsonGetter("species")
    public List<String> getSpecies() {
        return this.species;
    }
    @JsonSetter("starships")
    public void setStarships(List<String> starships) {
        this.starships = starships;
    }
    @JsonGetter("starships")
    public List<String> getStarships() {
        return this.starships;
    }
    @JsonSetter("vehicles")
    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }
    @JsonGetter("vehicles")
    public List<String> getVehicles() {
        return this.vehicles;
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
