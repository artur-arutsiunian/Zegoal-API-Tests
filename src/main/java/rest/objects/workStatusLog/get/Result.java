package rest.objects.workStatusLog.get;

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
        "id_mobile",
        "user",
        "device",
        "from_status",
        "to_status",
        "mobile_datetime",
        "point",
        "task"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("id_mobile")
    private Integer idMobile;
    @JsonProperty("user")
    private User user;
    @JsonProperty("device")
    private String device;
    @JsonProperty("from_status")
    private Integer fromStatus;
    @JsonProperty("to_status")
    private Integer toStatus;
    @JsonProperty("mobile_datetime")
    private Integer mobileDatetime;
    @JsonProperty("point")
    private Point point;
    @JsonProperty("task")
    private Task task;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id_mobile")
    public Integer getIdMobile() {
        return idMobile;
    }

    @JsonProperty("id_mobile")
    public void setIdMobile(Integer idMobile) {
        this.idMobile = idMobile;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("device")
    public String getDevice() {
        return device;
    }

    @JsonProperty("device")
    public void setDevice(String device) {
        this.device = device;
    }

    @JsonProperty("from_status")
    public Integer getFromStatus() {
        return fromStatus;
    }

    @JsonProperty("from_status")
    public void setFromStatus(Integer fromStatus) {
        this.fromStatus = fromStatus;
    }

    @JsonProperty("to_status")
    public Integer getToStatus() {
        return toStatus;
    }

    @JsonProperty("to_status")
    public void setToStatus(Integer toStatus) {
        this.toStatus = toStatus;
    }

    @JsonProperty("mobile_datetime")
    public Integer getMobileDatetime() {
        return mobileDatetime;
    }

    @JsonProperty("mobile_datetime")
    public void setMobileDatetime(Integer mobileDatetime) {
        this.mobileDatetime = mobileDatetime;
    }

    @JsonProperty("point")
    public Point getPoint() {
        return point;
    }

    @JsonProperty("point")
    public void setPoint(Point point) {
        this.point = point;
    }

    @JsonProperty("task")
    public Task getTask() {
        return task;
    }

    @JsonProperty("task")
    public void setTask(Task task) {
        this.task = task;
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
