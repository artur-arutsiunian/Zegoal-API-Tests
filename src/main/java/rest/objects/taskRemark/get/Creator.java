package rest.objects.taskRemark.get;

import java.util.HashMap;
import java.util.List;
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
        "is_displayed_on_map",
        "user",
        "avatar",
        "online",
        "is_editable",
        "last_points",
        "is_active"
})
@Generated("jsonschema2pojo")
public class Creator {

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
    @JsonProperty("user")
    private String user;
    @JsonProperty("avatar")
    private Object avatar;
    @JsonProperty("online")
    private Boolean online;
    @JsonProperty("is_editable")
    private Boolean isEditable;
    @JsonProperty("last_points")
    private List<Object> lastPoints = null;
    @JsonProperty("is_active")
    private Boolean isActive;
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

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("avatar")
    public Object getAvatar() {
        return avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(Object avatar) {
        this.avatar = avatar;
    }

    @JsonProperty("online")
    public Boolean getOnline() {
        return online;
    }

    @JsonProperty("online")
    public void setOnline(Boolean online) {
        this.online = online;
    }

    @JsonProperty("is_editable")
    public Boolean getIsEditable() {
        return isEditable;
    }

    @JsonProperty("is_editable")
    public void setIsEditable(Boolean isEditable) {
        this.isEditable = isEditable;
    }

    @JsonProperty("last_points")
    public List<Object> getLastPoints() {
        return lastPoints;
    }

    @JsonProperty("last_points")
    public void setLastPoints(List<Object> lastPoints) {
        this.lastPoints = lastPoints;
    }

    @JsonProperty("is_active")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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