/**
 * Collection automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.starwars;

import com.fasterxml.jackson.annotation.*;

public class Collection {
    private Integer count;
    private String next;
    private String previous;

    @JsonSetter("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonGetter("count")
    public Integer getCount() {
        return this.count;
    }

    @JsonSetter("next")
    public void setNext(String next) {
        this.next = next;
    }

    @JsonGetter("next")
    public String getNext() {
        return this.next;
    }

    @JsonSetter("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    @JsonGetter("previous")
    public String getPrevious() {
        return this.previous;
    }
}

