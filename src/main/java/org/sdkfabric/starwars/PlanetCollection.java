/**
 * PlanetCollection automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.starwars;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class PlanetCollection extends Collection {
    private List<Planet> results;
    @JsonSetter("results")
    public void setResults(List<Planet> results) {
        this.results = results;
    }
    @JsonGetter("results")
    public List<Planet> getResults() {
        return this.results;
    }
}
