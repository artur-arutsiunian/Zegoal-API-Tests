package rest.objects.user.patch;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "first_name",
        "last_name",
        "full_name",
        "position",
        "is_displayed_on_map"
})
@Generated("jsonschema2pojo")
public class Profile {

    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("position")
    private Object position;
    @JsonProperty("is_displayed_on_map")
    private Boolean isDisplayedOnMap;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("position")
    public Object getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Object position) {
        this.position = position;
    }

    @JsonProperty("is_displayed_on_map")
    public Boolean getIsDisplayedOnMap() {
        return isDisplayedOnMap;
    }

    @JsonProperty("is_displayed_on_map")
    public void setIsDisplayedOnMap(Boolean isDisplayedOnMap) {
        this.isDisplayedOnMap = isDisplayedOnMap;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
