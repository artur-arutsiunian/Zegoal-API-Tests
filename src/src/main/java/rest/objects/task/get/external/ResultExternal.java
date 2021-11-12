package rest.objects.task.get.external;

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
        "client",
        "planned_start_at",
        "planned_end_at",
        "start_at",
        "end_at",
        "status",
        "creator",
        "assigned_user",
        "main_report_form",
        "main_cancel_form",
        "duration",
        "description",
        "contacts",
        "assets",
        "is_overdue",
        "all_day",
        "external_id"
})
@Generated("jsonschema2pojo")
public class ResultExternal {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("name")
    private String name;
    @JsonProperty("location")
    private Integer location;
    @JsonProperty("client")
    private Integer client;
    @JsonProperty("planned_start_at")
    private String plannedStartAt;
    @JsonProperty("planned_end_at")
    private String plannedEndAt;
    @JsonProperty("start_at")
    private Object startAt;
    @JsonProperty("end_at")
    private Object endAt;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("creator")
    private CreatorExternal creator;
    @JsonProperty("assigned_user")
    private AssignedUserExternal assignedUser;
    @JsonProperty("main_report_form")
    private Integer mainReportForm;
    @JsonProperty("main_cancel_form")
    private Integer mainCancelForm;
    @JsonProperty("duration")
    private Object duration;
    @JsonProperty("description")
    private String description;
    @JsonProperty("contacts")
    private List<Object> contacts = null;
    @JsonProperty("assets")
    private List<Object> assets = null;
    @JsonProperty("is_overdue")
    private Boolean isOverdue;
    @JsonProperty("all_day")
    private Boolean allDay;
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

    @JsonProperty("location")
    public Integer getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Integer location) {
        this.location = location;
    }

    @JsonProperty("client")
    public Integer getClient() {
        return client;
    }

    @JsonProperty("client")
    public void setClient(Integer client) {
        this.client = client;
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

    @JsonProperty("start_at")
    public Object getStartAt() {
        return startAt;
    }

    @JsonProperty("start_at")
    public void setStartAt(Object startAt) {
        this.startAt = startAt;
    }

    @JsonProperty("end_at")
    public Object getEndAt() {
        return endAt;
    }

    @JsonProperty("end_at")
    public void setEndAt(Object endAt) {
        this.endAt = endAt;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("creator")
    public CreatorExternal getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(CreatorExternal creator) {
        this.creator = creator;
    }

    @JsonProperty("assigned_user")
    public AssignedUserExternal getAssignedUser() {
        return assignedUser;
    }

    @JsonProperty("assigned_user")
    public void setAssignedUser(AssignedUserExternal assignedUser) {
        this.assignedUser = assignedUser;
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

    @JsonProperty("duration")
    public Object getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Object duration) {
        this.duration = duration;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
