package rest.objects.commentNotification.get;

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
        "id",
        "user_recipient",
        "sender",
        "created",
        "task_id",
        "task_form_name",
        "task_status",
        "planned_start_at",
        "is_read",
        "read_at"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("user_recipient")
    private UserRecipient userRecipient;
    @JsonProperty("sender")
    private Sender sender;
    @JsonProperty("created")
    private String created;
    @JsonProperty("task_id")
    private Integer taskId;
    @JsonProperty("task_form_name")
    private String taskFormName;
    @JsonProperty("task_status")
    private Integer taskStatus;
    @JsonProperty("planned_start_at")
    private String plannedStartAt;
    @JsonProperty("is_read")
    private Boolean isRead;
    @JsonProperty("read_at")
    private String readAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("user_recipient")
    public UserRecipient getUserRecipient() {
        return userRecipient;
    }

    @JsonProperty("user_recipient")
    public void setUserRecipient(UserRecipient userRecipient) {
        this.userRecipient = userRecipient;
    }

    @JsonProperty("sender")
    public Sender getSender() {
        return sender;
    }

    @JsonProperty("sender")
    public void setSender(Sender sender) {
        this.sender = sender;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("task_id")
    public Integer getTaskId() {
        return taskId;
    }

    @JsonProperty("task_id")
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    @JsonProperty("task_form_name")
    public String getTaskFormName() {
        return taskFormName;
    }

    @JsonProperty("task_form_name")
    public void setTaskFormName(String taskFormName) {
        this.taskFormName = taskFormName;
    }

    @JsonProperty("task_status")
    public Integer getTaskStatus() {
        return taskStatus;
    }

    @JsonProperty("task_status")
    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    @JsonProperty("planned_start_at")
    public String getPlannedStartAt() {
        return plannedStartAt;
    }

    @JsonProperty("planned_start_at")
    public void setPlannedStartAt(String plannedStartAt) {
        this.plannedStartAt = plannedStartAt;
    }

    @JsonProperty("is_read")
    public Boolean getIsRead() {
        return isRead;
    }

    @JsonProperty("is_read")
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    @JsonProperty("read_at")
    public String getReadAt() {
        return readAt;
    }

    @JsonProperty("read_at")
    public void setReadAt(String readAt) {
        this.readAt = readAt;
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
