package rest.objects.epic.post;

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
        "creator",
        "description",
        "planned_start_at",
        "planned_end_at",
        "assigned_user",
        "possible_assignees",
        "tasks",
        "status",
        "external_id"
})
@Generated("jsonschema2pojo")
public class PostEpic {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("name")
    private String name;
    @JsonProperty("creator")
    private String creator;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("planned_start_at")
    private String plannedStartAt;
    @JsonProperty("planned_end_at")
    private String plannedEndAt;
    @JsonProperty("assigned_user")
    private Object assignedUser;
    @JsonProperty("possible_assignees")
    private List<Object> possibleAssignees = null;
    @JsonProperty("tasks")
    private List<Integer> tasks = null;
    @JsonProperty("status")
    private Integer status;
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

    @JsonProperty("creator")
    public String getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("planned_start_at")
    public String getPlannedStartAt() {
        return plannedStartAt;
    }

    @JsonProperty("planned_start_at")
    public void setPlannedStartAt(String plannedStartAt) {
        this.plannedStartAt = plannedStartAt;
    }

    @JsonProperty("planned_end_at")
    public String getPlannedEndAt() {
        return plannedEndAt;
    }

    @JsonProperty("planned_end_at")
    public void setPlannedEndAt(String plannedEndAt) {
        this.plannedEndAt = plannedEndAt;
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
    public List<Object> getPossibleAssignees() {
        return possibleAssignees;
    }

    @JsonProperty("possible_assignees")
    public void setPossibleAssignees(List<Object> possibleAssignees) {
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

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
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
