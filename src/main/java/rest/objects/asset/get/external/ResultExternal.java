package rest.objects.asset.get.external;

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
        "description",
        "image",
        "location",
        "inventory_number",
        "serial_number",
        "external_id"
})
@Generated("jsonschema2pojo")
public class ResultExternal {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("image")
    private Object image;
    @JsonProperty("location")
    private Integer location;
    @JsonProperty("inventory_number")
    private Object inventoryNumber;
    @JsonProperty("serial_number")
    private Object serialNumber;
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

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("image")
    public Object getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Object image) {
        this.image = image;
    }

    @JsonProperty("location")
    public Integer getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Integer location) {
        this.location = location;
    }

    @JsonProperty("inventory_number")
    public Object getInventoryNumber() {
        return inventoryNumber;
    }

    @JsonProperty("inventory_number")
    public void setInventoryNumber(Object inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    @JsonProperty("serial_number")
    public Object getSerialNumber() {
        return serialNumber;
    }

    @JsonProperty("serial_number")
    public void setSerialNumber(Object serialNumber) {
        this.serialNumber = serialNumber;
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
