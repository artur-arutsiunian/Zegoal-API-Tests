package rest.objects.client.patch.external;

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
        "is_active",
        "connected_users",
        "is_exist"
})
@Generated("jsonschema2pojo")
public class PatchClientExternal {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("is_active")
    private Boolean isActive;
    @JsonProperty("connected_users")
    private List<Object> connectedUsers = null;
    @JsonProperty("is_exist")
    private Boolean isExist;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pk")
    public Integer getPk() {
        return pk;
    }

    @JsonProperty("pk")
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    @JsonProperty("is_active")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("connected_users")
    public List<Object> getConnectedUsers() {
        return connectedUsers;
    }

    @JsonProperty("connected_users")
    public void setConnectedUsers(List<Object> connectedUsers) {
        this.connectedUsers = connectedUsers;
    }

    @JsonProperty("is_exist")
    public Boolean getIsExist() {
        return isExist;
    }

    @JsonProperty("is_exist")
    public void setIsExist(Boolean isExist) {
        this.isExist = isExist;
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