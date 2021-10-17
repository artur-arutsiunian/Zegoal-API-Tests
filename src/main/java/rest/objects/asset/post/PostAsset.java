package rest.objects.asset.post;


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
        "image",
        "location",
        "internal_address",
        "production_date",
        "installation_date",
        "warranty_end_date",
        "inventory_number",
        "serial_number",
        "contract",
        "description",
        "type",
        "status",
        "model",
        "external_id"
})
@Generated("jsonschema2pojo")
public class PostAsset {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("name")
    private String name;
    @JsonProperty("image")
    private Object image;
    @JsonProperty("location")
    private Integer location;
    @JsonProperty("internal_address")
    private Object internalAddress;
    @JsonProperty("production_date")
    private Object productionDate;
    @JsonProperty("installation_date")
    private Object installationDate;
    @JsonProperty("warranty_end_date")
    private Object warrantyEndDate;
    @JsonProperty("inventory_number")
    private Object inventoryNumber;
    @JsonProperty("serial_number")
    private Object serialNumber;
    @JsonProperty("contract")
    private Object contract;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("type")
    private Object type;
    @JsonProperty("status")
    private Object status;
    @JsonProperty("model")
    private Object model;
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

    @JsonProperty("internal_address")
    public Object getInternalAddress() {
        return internalAddress;
    }

    @JsonProperty("internal_address")
    public void setInternalAddress(Object internalAddress) {
        this.internalAddress = internalAddress;
    }

    @JsonProperty("production_date")
    public Object getProductionDate() {
        return productionDate;
    }

    @JsonProperty("production_date")
    public void setProductionDate(Object productionDate) {
        this.productionDate = productionDate;
    }

    @JsonProperty("installation_date")
    public Object getInstallationDate() {
        return installationDate;
    }

    @JsonProperty("installation_date")
    public void setInstallationDate(Object installationDate) {
        this.installationDate = installationDate;
    }

    @JsonProperty("warranty_end_date")
    public Object getWarrantyEndDate() {
        return warrantyEndDate;
    }

    @JsonProperty("warranty_end_date")
    public void setWarrantyEndDate(Object warrantyEndDate) {
        this.warrantyEndDate = warrantyEndDate;
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

    @JsonProperty("contract")
    public Object getContract() {
        return contract;
    }

    @JsonProperty("contract")
    public void setContract(Object contract) {
        this.contract = contract;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    @JsonProperty("model")
    public Object getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(Object model) {
        this.model = model;
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