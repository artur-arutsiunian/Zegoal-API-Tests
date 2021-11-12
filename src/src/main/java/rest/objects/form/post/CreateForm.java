package rest.objects.form.post;

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
        "name",
        "type",
        "is_sales",
        "used_in_templates"
})
@Generated("jsonschema2pojo")
public class CreateForm {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("is_sales")
    private Boolean isSales;
    @JsonProperty("used_in_templates")
    private Boolean usedInTemplates;
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

    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("is_sales")
    public Boolean getIsSales() {
        return isSales;
    }

    @JsonProperty("is_sales")
    public void setIsSales(Boolean isSales) {
        this.isSales = isSales;
    }

    @JsonProperty("used_in_templates")
    public Boolean getUsedInTemplates() {
        return usedInTemplates;
    }

    @JsonProperty("used_in_templates")
    public void setUsedInTemplates(Boolean usedInTemplates) {
        this.usedInTemplates = usedInTemplates;
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
