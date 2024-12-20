/**
 * Starship automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.starwars;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A Starship is a single transport craft that has hyperdrive capability
 */
public class Starship {
    private String name;
    private String model;
    private String starshipClass;
    private String manufacturer;
    private String costInCredits;
    private String length;
    private String crew;
    private String passengers;
    private String maxAtmospheringSpeed;
    private String hyperdriveRating;
    private String mGLT;
    private String cargoCapacity;
    private String consumables;
    private java.util.List<String> films;
    private java.util.List<String> pilots;
    private String url;
    private java.time.LocalDateTime created;
    private java.time.LocalDateTime edited;
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    @JsonSetter("model")
    public void setModel(String model) {
        this.model = model;
    }
    @JsonGetter("model")
    public String getModel() {
        return this.model;
    }
    @JsonSetter("starship_class")
    public void setStarshipClass(String starshipClass) {
        this.starshipClass = starshipClass;
    }
    @JsonGetter("starship_class")
    public String getStarshipClass() {
        return this.starshipClass;
    }
    @JsonSetter("manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    @JsonGetter("manufacturer")
    public String getManufacturer() {
        return this.manufacturer;
    }
    @JsonSetter("cost_in_credits")
    public void setCostInCredits(String costInCredits) {
        this.costInCredits = costInCredits;
    }
    @JsonGetter("cost_in_credits")
    public String getCostInCredits() {
        return this.costInCredits;
    }
    @JsonSetter("length")
    public void setLength(String length) {
        this.length = length;
    }
    @JsonGetter("length")
    public String getLength() {
        return this.length;
    }
    @JsonSetter("crew")
    public void setCrew(String crew) {
        this.crew = crew;
    }
    @JsonGetter("crew")
    public String getCrew() {
        return this.crew;
    }
    @JsonSetter("passengers")
    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }
    @JsonGetter("passengers")
    public String getPassengers() {
        return this.passengers;
    }
    @JsonSetter("max_atmosphering_speed")
    public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    }
    @JsonGetter("max_atmosphering_speed")
    public String getMaxAtmospheringSpeed() {
        return this.maxAtmospheringSpeed;
    }
    @JsonSetter("hyperdrive_rating")
    public void setHyperdriveRating(String hyperdriveRating) {
        this.hyperdriveRating = hyperdriveRating;
    }
    @JsonGetter("hyperdrive_rating")
    public String getHyperdriveRating() {
        return this.hyperdriveRating;
    }
    @JsonSetter("MGLT")
    public void setMGLT(String mGLT) {
        this.mGLT = mGLT;
    }
    @JsonGetter("MGLT")
    public String getMGLT() {
        return this.mGLT;
    }
    @JsonSetter("cargo_capacity")
    public void setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    @JsonGetter("cargo_capacity")
    public String getCargoCapacity() {
        return this.cargoCapacity;
    }
    @JsonSetter("consumables")
    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }
    @JsonGetter("consumables")
    public String getConsumables() {
        return this.consumables;
    }
    @JsonSetter("films")
    public void setFilms(java.util.List<String> films) {
        this.films = films;
    }
    @JsonGetter("films")
    public java.util.List<String> getFilms() {
        return this.films;
    }
    @JsonSetter("pilots")
    public void setPilots(java.util.List<String> pilots) {
        this.pilots = pilots;
    }
    @JsonGetter("pilots")
    public java.util.List<String> getPilots() {
        return this.pilots;
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
    public void setCreated(java.time.LocalDateTime created) {
        this.created = created;
    }
    @JsonGetter("created")
    public java.time.LocalDateTime getCreated() {
        return this.created;
    }
    @JsonSetter("edited")
    public void setEdited(java.time.LocalDateTime edited) {
        this.edited = edited;
    }
    @JsonGetter("edited")
    public java.time.LocalDateTime getEdited() {
        return this.edited;
    }
}
