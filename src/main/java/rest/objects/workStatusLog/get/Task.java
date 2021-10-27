package rest.objects.workStatusLog.get;

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
        "name",
        "location",
        "created_at",
        "planned_start_at",
        "planned_start_at_date",
        "planned_start_at_time",
        "planned_end_at",
        "status",
        "assigned_user",
        "epic",
        "is_overdue",
        "all_day",
        "email",
        "assets",
        "contacts",
        "external_id",
        "creator"
})
@Generated("jsonschema2pojo")
public class Task {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("name")
    private String name;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("planned_start_at")
    private String plannedStartAt;
    @JsonProperty("planned_start_at_date")
    private String plannedStartAtDate;
    @JsonProperty("planned_start_at_time")
    private String plannedStartAtTime;
    @JsonProperty("planned_end_at")
    private String plannedEndAt;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("assigned_user")
    private AssignedUser assignedUser;
    @JsonProperty("epic")
    private Integer epic;
    @JsonProperty("is_overdue")
    private Boolean isOverdue;
    @JsonProperty("all_day")
    private Boolean allDay;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("assets")
    private List<Object> assets = null;
    @JsonProperty("contacts")
    private List<Object> contacts = null;
    @JsonProperty("external_id")
    private Object externalId;
    @JsonProperty("creator")
    private Creator creator;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("planned_start_at")
    public String getPlannedStartAt() {
        return plannedStartAt;
    }

    @JsonProperty("planned_start_at")
    public void setPlannedStartAt(String plannedStartAt) {
        this.plannedStartAt = plannedStartAt;
    }

    @JsonProperty("planned_start_at_date")
    public String getPlannedStartAtDate() {
        return plannedStartAtDate;
    }

    @JsonProperty("planned_start_at_date")
    public void setPlannedStartAtDate(String plannedStartAtDate) {
        this.plannedStartAtDate = plannedStartAtDate;
    }

    @JsonProperty("planned_start_at_time")
    public String getPlannedStartAtTime() {
        return plannedStartAtTime;
    }

    @JsonProperty("planned_start_at_time")
    public void setPlannedStartAtTime(String plannedStartAtTime) {
        this.plannedStartAtTime = plannedStartAtTime;
    }

    @JsonProperty("planned_end_at")
    public String getPlannedEndAt() {
        return plannedEndAt;
    }

    @JsonProperty("planned_end_at")
    public void setPlannedEndAt(String plannedEndAt) {
        this.plannedEndAt = plannedEndAt;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("assigned_user")
    public AssignedUser getAssignedUser() {
        return assignedUser;
    }

    @JsonProperty("assigned_user")
    public void setAssignedUser(AssignedUser assignedUser) {
        this.assignedUser = assignedUser;
    }

    @JsonProperty("epic")
    public Integer getEpic() {
        return epic;
    }

    @JsonProperty("epic")
    public void setEpic(Integer epic) {
        this.epic = epic;
    }

    @JsonProperty("is_overdue")
    public Boolean getIsOverdue() {
        return isOverdue;
    }

    @JsonProperty("is_overdue")
    public void setIsOverdue(Boolean isOverdue) {
        this.isOverdue = isOverdue;
    }

    @JsonProperty("all_day")
    public Boolean getAllDay() {
        return allDay;
    }

    @JsonProperty("all_day")
    public void setAllDay(Boolean allDay) {
        this.allDay = allDay;
    }

    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    @JsonProperty("assets")
    public List<Object> getAssets() {
        return assets;
    }

    @JsonProperty("assets")
    public void setAssets(List<Object> assets) {
        this.assets = assets;
    }

    @JsonProperty("contacts")
    public List<Object> getContacts() {
        return contacts;
    }

    @JsonProperty("contacts")
    public void setContacts(List<Object> contacts) {
        this.contacts = contacts;
    }

    @JsonProperty("external_id")
    public Object getExternalId() {
        return externalId;
    }

    @JsonProperty("external_id")
    public void setExternalId(Object externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("creator")
    public Creator getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(Creator creator) {
        this.creator = creator;
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
