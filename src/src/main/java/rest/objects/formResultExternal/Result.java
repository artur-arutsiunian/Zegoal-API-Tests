package rest.objects.formResultExternal;

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
        "value",
        "task_id",
        "form_field",
        "form"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("value")
    private String value;
    @JsonProperty("task_id")
    private Integer taskId;
    @JsonProperty("form_field")
    private Integer formField;
    @JsonProperty("form")
    private Integer form;
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

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("task_id")
    public Integer getTaskId() {
        return taskId;
    }

    @JsonProperty("task_id")
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    @JsonProperty("form_field")
    public Integer getFormField() {
        return formField;
    }

    @JsonProperty("form_field")
    public void setFormField(Integer formField) {
        this.formField = formField;
    }

    @JsonProperty("form")
    public Integer getForm() {
        return form;
    }

    @JsonProperty("form")
    public void setForm(Integer form) {
        this.form = form;
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