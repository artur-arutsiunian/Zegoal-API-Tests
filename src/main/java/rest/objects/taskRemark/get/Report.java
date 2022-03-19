package rest.objects.taskRemark.get;

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
        "forms",
        "form_groups",
        "form_fields",
        "form_field_values",
        "form_results"
})
@Generated("jsonschema2pojo")
public class Report {

    @JsonProperty("forms")
    private List<Form> forms = null;
    @JsonProperty("form_groups")
    private List<FormGroup> formGroups = null;
    @JsonProperty("form_fields")
    private List<FormField> formFields = null;
    @JsonProperty("form_field_values")
    private List<Object> formFieldValues = null;
    @JsonProperty("form_results")
    private List<Object> formResults = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("forms")
    public List<Form> getForms() {
        return forms;
    }

    @JsonProperty("forms")
    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

    @JsonProperty("form_groups")
    public List<FormGroup> getFormGroups() {
        return formGroups;
    }

    @JsonProperty("form_groups")
    public void setFormGroups(List<FormGroup> formGroups) {
        this.formGroups = formGroups;
    }
}