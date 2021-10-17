package rest.objects.epic.get;

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
        "planned_start_at",
        "planned_start_at_date",
        "planned_start_at_time",
        "status",
        "assigned_user",
        "possible_assignees",
        "tasks",
        "external_id"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("name")
    private String name;
    @JsonProperty("planned_start_at")
    private String plannedStartAt;
    @JsonProperty("planned_start_at_date")
    private String plannedStartAtDate;
    @JsonProperty("planned_start_at_time")
    private String plannedStartAtTime;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("assigned_user")
    private Object assignedUser;
    @JsonProperty("possible_assignees")
    private Object possibleAssignees;
    @JsonProperty("tasks")
    private List<Integer> tasks = null;
    @JsonProperty("external_id")
    private Object externalId;
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

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("assigned_user")
    public Object getAssignedUser() {
        return assignedUser;
    }

    @JsonProperty("assigned_user")
    public void setAssignedUser(Object assignedUser) {
        this.assignedUser = assignedUser;
    }

    @JsonProperty("possible_assignees")
    public Object getPossibleAssignees() {
        return possibleAssignees;
    }

    @JsonProperty("possible_assignees")
    public void setPossibleAssignees(Object possibleAssignees) {
        this.possibleAssignees = possibleAssignees;
    }

    @JsonProperty("tasks")
    public List<Integer> getTasks() {
        return tasks;
    }

    @JsonProperty("tasks")
    public void setTasks(List<Integer> tasks) {
        this.tasks = tasks;
    }

    @JsonProperty("external_id")
    public Object getExternalId() {
        return externalId;
    }

    @JsonProperty("external_id")
    public void setExternalId(Object externalId) {
        this.externalId = externalId;
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
