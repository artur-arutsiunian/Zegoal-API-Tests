package rest.objects.user.patch;

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
        "profile",
        "groups",
        "manager",
        "viewed_clusters",
        "clusters",
        "external_id",
        "is_active"
})
@Generated("jsonschema2pojo")
public class PatchUser {

    @JsonProperty("pk")
    private String pk;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("profile")
    private Profile profile;
    @JsonProperty("groups")
    private List<Integer> groups = null;
    @JsonProperty("manager")
    private Object manager;
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

    @JsonProperty("profile")
    public Profile getProfile() {
        return profile;
    }

    @JsonProperty("profile")
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @JsonProperty("groups")
    public List<Integer> getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(List<Integer> groups) {
        this.groups = groups;
    }

    @JsonProperty("manager")
    public Object getManager() {
        return manager;
    }

    @JsonProperty("manager")
    public void setManager(Object manager) {
        this.manager = manager;
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