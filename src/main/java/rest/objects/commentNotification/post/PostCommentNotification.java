package rest.objects.commentNotification.post;

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
        "created_at",
        "updated_at",
        "is_read",
        "read_at",
        "comment",
        "user_recipient"
})
@Generated("jsonschema2pojo")
public class PostCommentNotification {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("is_read")
    private Boolean isRead;
    @JsonProperty("read_at")
    private String readAt;
    @JsonProperty("comment")
    private Integer comment;
    @JsonProperty("user_recipient")
    private Object userRecipient;
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

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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

    @JsonProperty("comment")
    public Integer getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(Integer comment) {
        this.comment = comment;
    }

    @JsonProperty("user_recipient")
    public Object getUserRecipient() {
        return userRecipient;
    }

    @JsonProperty("user_recipient")
    public void setUserRecipient(Object userRecipient) {
        this.userRecipient = userRecipient;
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
