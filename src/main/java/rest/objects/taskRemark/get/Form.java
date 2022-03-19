package rest.objects.taskRemark.get;

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
        "is_sales",
        "created_at",
        "updated_at",
        "is_active",
        "name",
        "is_new",
        "type",
        "uuid",
        "is_system",
        "creator",
        "editor"
})
@Generated("jsonschema2pojo")
public class Form {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("is_sales")
    private Boolean isSales;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("is_active")
    private Boolean isActive;
    @JsonProperty("name")
    private String name;
    @JsonProperty("is_new")
    private Boolean isNew;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("is_system")
    private Boolean isSystem;
    @JsonProperty("creator")
    private String creator;
    @JsonProperty("editor")
    private String editor;
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

    @JsonProperty("is_sales")
    public Boolean getIsSales() {
        return isSales;
    }

    @JsonProperty("is_sales")
    public void setIsSales(Boolean isSales) {
        this.isSales = isSales;
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

    @JsonProperty("is_active")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("is_new")
    public Boolean getIsNew() {
        return isNew;
    }

    @JsonProperty("is_new")
    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("is_system")
    public Boolean getIsSystem() {
        return isSystem;
    }

    @JsonProperty("is_system")
    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    @JsonProperty("creator")
    public String getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @JsonProperty("editor")
    public String getEditor() {
        return editor;
    }

    @JsonProperty("editor")
    public void setEditor(String editor) {
        this.editor = editor;
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