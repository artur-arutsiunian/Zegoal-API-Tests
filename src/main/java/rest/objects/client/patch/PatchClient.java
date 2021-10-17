package rest.objects.client.patch;

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
        "main_location",
        "is_editable",
        "phone_number",
        "email",
        "site_address",
        "parent_company",
        "billing_info",
        "city",
        "employees_number",
        "industry",
        "priority",
        "region",
        "subregion",
        "annual_revenue",
        "size",
        "status",
        "type",
        "external_id"
})
@Generated("jsonschema2pojo")
public class PatchClient {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("main_location")
    private Integer mainLocation;
    @JsonProperty("is_editable")
    private Boolean isEditable;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("site_address")
    private Object siteAddress;
    @JsonProperty("parent_company")
    private Object parentCompany;
    @JsonProperty("billing_info")
    private Object billingInfo;
    @JsonProperty("city")
    private Object city;
    @JsonProperty("employees_number")
    private Object employeesNumber;
    @JsonProperty("industry")
    private Object industry;
    @JsonProperty("priority")
    private Object priority;
    @JsonProperty("region")
    private Object region;
    @JsonProperty("subregion")
    private Object subregion;
    @JsonProperty("annual_revenue")
    private Object annualRevenue;
    @JsonProperty("size")
    private Object size;
    @JsonProperty("status")
    private Object status;
    @JsonProperty("type")
    private Object type;
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

    @JsonProperty("main_location")
    public Integer getMainLocation() {
        return mainLocation;
    }

    @JsonProperty("main_location")
    public void setMainLocation(Integer mainLocation) {
        this.mainLocation = mainLocation;
    }

    @JsonProperty("is_editable")
    public Boolean getIsEditable() {
        return isEditable;
    }

    @JsonProperty("is_editable")
    public void setIsEditable(Boolean isEditable) {
        this.isEditable = isEditable;
    }

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    @JsonProperty("site_address")
    public Object getSiteAddress() {
        return siteAddress;
    }

    @JsonProperty("site_address")
    public void setSiteAddress(Object siteAddress) {
        this.siteAddress = siteAddress;
    }

    @JsonProperty("parent_company")
    public Object getParentCompany() {
        return parentCompany;
    }

    @JsonProperty("parent_company")
    public void setParentCompany(Object parentCompany) {
        this.parentCompany = parentCompany;
    }

    @JsonProperty("billing_info")
    public Object getBillingInfo() {
        return billingInfo;
    }

    @JsonProperty("billing_info")
    public void setBillingInfo(Object billingInfo) {
        this.billingInfo = billingInfo;
    }

    @JsonProperty("city")
    public Object getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(Object city) {
        this.city = city;
    }

    @JsonProperty("employees_number")
    public Object getEmployeesNumber() {
        return employeesNumber;
    }

    @JsonProperty("employees_number")
    public void setEmployeesNumber(Object employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @JsonProperty("industry")
    public Object getIndustry() {
        return industry;
    }

    @JsonProperty("industry")
    public void setIndustry(Object industry) {
        this.industry = industry;
    }

    @JsonProperty("priority")
    public Object getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Object priority) {
        this.priority = priority;
    }

    @JsonProperty("region")
    public Object getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(Object region) {
        this.region = region;
    }

    @JsonProperty("subregion")
    public Object getSubregion() {
        return subregion;
    }

    @JsonProperty("subregion")
    public void setSubregion(Object subregion) {
        this.subregion = subregion;
    }

    @JsonProperty("annual_revenue")
    public Object getAnnualRevenue() {
        return annualRevenue;
    }

    @JsonProperty("annual_revenue")
    public void setAnnualRevenue(Object annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    @JsonProperty("size")
    public Object getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Object size) {
        this.size = size;
    }

    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
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