package rest.objects.user.get;

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
        "pk",
        "email",
        "phone_number",
        "is_editable",
        "profile",
        "manager",
        "groups",
        "settings",
        "viewed_clusters",
        "clusters",
        "external_id",
        "is_active"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("pk")
    private String pk;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("is_editable")
    private Boolean isEditable;
    @JsonProperty("profile")
    private Profile profile;
    @JsonProperty("manager")
    private Object manager;
    @JsonProperty("groups")
    private List<Group> groups = null;
    @JsonProperty("settings")
    private List<Setting> settings = null;
    @JsonProperty("viewed_clusters")
    private List<Object> viewedClusters = null;
    @JsonProperty("clusters")
    private List<Object> clusters = null;
    @JsonProperty("external_id")
    private Object externalId;
    @JsonProperty("is_active")
    private Boolean isActive;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pk")
    public String getPk() {
        return pk;
    }

    @JsonProperty("pk")
    public void setPk(String pk) {
        this.pk = pk;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("is_editable")
    public Boolean getIsEditable() {
        return isEditable;
    }

    @JsonProperty("is_editable")
    public void setIsEditable(Boolean isEditable) {
        this.isEditable = isEditable;
    }

    @JsonProperty("profile")
    public Profile getProfile() {
        return profile;
    }

    @JsonProperty("profile")
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @JsonProperty("manager")
    public Object getManager() {
        return manager;
    }

    @JsonProperty("manager")
    public void setManager(Object manager) {
        this.manager = manager;
    }

    @JsonProperty("groups")
    public List<Group> getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @JsonProperty("settings")
    public List<Setting> getSettings() {
        return settings;
    }

    @JsonProperty("settings")
    public void setSettings(List<Setting> settings) {
        this.settings = settings;
    }

    @JsonProperty("viewed_clusters")
    public List<Object> getViewedClusters() {
        return viewedClusters;
    }

    @JsonProperty("viewed_clusters")
    public void setViewedClusters(List<Object> viewedClusters) {
        this.viewedClusters = viewedClusters;
    }

    @JsonProperty("clusters")
    public List<Object> getClusters() {
        return clusters;
    }

    @JsonProperty("clusters")
    public void setClusters(List<Object> clusters) {
        this.clusters = clusters;
    }

    @JsonProperty("external_id")
    public Object getExternalId() {
        return externalId;
    }

    @JsonProperty("external_id")
    public void setExternalId(Object externalId) {
        this.externalId = externalId;
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