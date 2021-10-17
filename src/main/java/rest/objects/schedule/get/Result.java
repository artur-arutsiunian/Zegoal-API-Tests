package rest.objects.schedule.get;

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
        "pk",
        "start_datetime",
        "end_datetime",
        "user",
        "type",
        "is_night_shift",
        "parent"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("start_datetime")
    private String startDatetime;
    @JsonProperty("end_datetime")
    private String endDatetime;
    @JsonProperty("user")
    private User user;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("is_night_shift")
    private Boolean isNightShift;
    @JsonProperty("parent")
    private Object parent;
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

    @JsonProperty("start_datetime")
    public String getStartDatetime() {
        return startDatetime;
    }

    @JsonProperty("start_datetime")
    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    @JsonProperty("end_datetime")
    public String getEndDatetime() {
        return endDatetime;
    }

    @JsonProperty("end_datetime")
    public void setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("is_night_shift")
    public Boolean getIsNightShift() {
        return isNightShift;
    }

    @JsonProperty("is_night_shift")
    public void setIsNightShift(Boolean isNightShift) {
        this.isNightShift = isNightShift;
    }

    @JsonProperty("parent")
    public Object getParent() {
        return parent;
    }

    @JsonProperty("parent")
    public void setParent(Object parent) {
        this.parent = parent;
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
