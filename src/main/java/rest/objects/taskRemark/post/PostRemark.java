package rest.objects.taskRemark.post;

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
        "creator",
        "type",
        "main_report_form",
        "main_cancel_form",
        "location",
        "description",
        "planned_start_at",
        "planned_end_at",
        "assigned_user",
        "contacts",
        "assets",
        "epic",
        "is_overdue",
        "all_day",
        "email",
        "external_id",
        "status",
        "label",
        "linked_task",
        "task_type",
        "name"
})
@Generated("jsonschema2pojo")
public class PostRemark {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("creator")
    private String creator;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("main_report_form")
    private Integer mainReportForm;
    @JsonProperty("main_cancel_form")
    private Integer mainCancelForm;
    @JsonProperty("location")
    private Integer location;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("planned_start_at")
    private String plannedStartAt;
    @JsonProperty("planned_end_at")
    private String plannedEndAt;
    @JsonProperty("assigned_user")
    private String assignedUser;
    @JsonProperty("contacts")
    private List<Object> contacts = null;
    @JsonProperty("assets")
    private List<Object> assets = null;
    @JsonProperty("epic")
    private Object epic;
    @JsonProperty("is_overdue")
    private Object isOverdue;
    @JsonProperty("all_day")
    private Boolean allDay;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("external_id")
    private Object externalId;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("label")
    private Object label;
    @JsonProperty("linked_task")
    private Integer linkedTask;
    @JsonProperty("task_type")
    private Integer taskType;
    @JsonProperty("name")
    private String name;
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

    @JsonProperty("creator")
    public String getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("main_report_form")
    public Integer getMainReportForm() {
        return mainReportForm;
    }

    @JsonProperty("main_report_form")
    public void setMainReportForm(Integer mainReportForm) {
        this.mainReportForm = mainReportForm;
    }

    @JsonProperty("main_cancel_form")
    public Integer getMainCancelForm() {
        return mainCancelForm;
    }

    @JsonProperty("main_cancel_form")
    public void setMainCancelForm(Integer mainCancelForm) {
        this.mainCancelForm = mainCancelForm;
    }

    @JsonProperty("location")
    public Integer getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Integer location) {
        this.location = location;
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
    public String getAssignedUser() {
        return assignedUser;
    }

    @JsonProperty("assigned_user")
    public void setAssignedUser(String assignedUser) {
        this.assignedUser = assignedUser;
    }

    @JsonProperty("contacts")
    public List<Object> getContacts() {
        return contacts;
    }

    @JsonProperty("contacts")
    public void setContacts(List<Object> contacts) {
        this.contacts = contacts;
    }

    @JsonProperty("assets")
    public List<Object> getAssets() {
        return assets;
    }

    @JsonProperty("assets")
    public void setAssets(List<Object> assets) {
        this.assets = assets;
    }

    @JsonProperty("epic")
    public Object getEpic() {
        return epic;
    }

    @JsonProperty("epic")
    public void setEpic(Object epic) {
        this.epic = epic;
    }

    @JsonProperty("is_overdue")
    public Object getIsOverdue() {
        return isOverdue;
    }

    @JsonProperty("is_overdue")
    public void setIsOverdue(Object isOverdue) {
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

    @JsonProperty("external_id")
    public Object getExternalId() {
        return externalId;
    }

    @JsonProperty("external_id")
    public void setExternalId(Object externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("label")
    public Object getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(Object label) {
        this.label = label;
    }

    @JsonProperty("linked_task")
    public Integer getLinkedTask() {
        return linkedTask;
    }

    @JsonProperty("linked_task")
    public void setLinkedTask(Integer linkedTask) {
        this.linkedTask = linkedTask;
    }

    @JsonProperty("task_type")
    public Integer getTaskType() {
        return taskType;
    }

    @JsonProperty("task_type")
    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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