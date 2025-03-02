/**
 * Planet automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.starwars;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("A Planet is a large mass, planet or planetoid in the Star Wars Universe, at the time of 0 ABY")
public class Planet {
    private String name;
    private String diameter;
    private String rotationPeriod;
    private String orbitalPeriod;
    private String gravity;
    private String population;
    private String climate;
    private String terrain;
    private String surfaceWater;
    private java.util.List<String> residents;
    private java.util.List<String> films;
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

    @JsonSetter("diameter")
    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    @JsonGetter("diameter")
    public String getDiameter() {
        return this.diameter;
    }

    @JsonSetter("rotation_period")
    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    @JsonGetter("rotation_period")
    public String getRotationPeriod() {
        return this.rotationPeriod;
    }

    @JsonSetter("orbital_period")
    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    @JsonGetter("orbital_period")
    public String getOrbitalPeriod() {
        return this.orbitalPeriod;
    }

    @JsonSetter("gravity")
    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    @JsonGetter("gravity")
    public String getGravity() {
        return this.gravity;
    }

    @JsonSetter("population")
    public void setPopulation(String population) {
        this.population = population;
    }

    @JsonGetter("population")
    public String getPopulation() {
        return this.population;
    }

    @JsonSetter("climate")
    public void setClimate(String climate) {
        this.climate = climate;
    }

    @JsonGetter("climate")
    public String getClimate() {
        return this.climate;
    }

    @JsonSetter("terrain")
    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    @JsonGetter("terrain")
    public String getTerrain() {
        return this.terrain;
    }

    @JsonSetter("surface_water")
    public void setSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
    }

    @JsonGetter("surface_water")
    public String getSurfaceWater() {
        return this.surfaceWater;
    }

    @JsonSetter("residents")
    public void setResidents(java.util.List<String> residents) {
        this.residents = residents;
    }

    @JsonGetter("residents")
    public java.util.List<String> getResidents() {
        return this.residents;
    }

    @JsonSetter("films")
    public void setFilms(java.util.List<String> films) {
        this.films = films;
    }

    @JsonGetter("films")
    public java.util.List<String> getFilms() {
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

