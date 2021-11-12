package rest.objects.location.post;

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
        "id",
        "contacts",
        "assets",
        "created_at",
        "updated_at",
        "is_active",
        "sales_id",
        "name",
        "street",
        "building",
        "zip_code",
        "raw_address",
        "radius",
        "polygon",
        "point",
        "phone_number",
        "email",
        "external_id",
        "client",
        "country",
        "city",
        "type",
        "status",
        "region",
        "group",
        "priority"
})
@Generated("jsonschema2pojo")
public class PostLocation {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("contacts")
    private List<Object> contacts = null;
    @JsonProperty("assets")
    private List<Object> assets = null;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("is_active")
    private Boolean isActive;
    @JsonProperty("sales_id")
    private String salesId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("street")
    private String street;
    @JsonProperty("building")
    private String building;
    @JsonProperty("zip_code")
    private String zipCode;
    @JsonProperty("raw_address")
    private String rawAddress;
    @JsonProperty("radius")
    private Integer radius;
    @JsonProperty("polygon")
    private Object polygon;
    @JsonProperty("point")
    private Point point;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("external_id")
    private Object externalId;
    @JsonProperty("client")
    private Integer client;
    @JsonProperty("country")
    private Object country;
    @JsonProperty("city")
    private Object city;
    @JsonProperty("type")
    private Object type;
    @JsonProperty("status")
    private Object status;
    @JsonProperty("region")
    private Object region;
    @JsonProperty("group")
    private Object group;
    @JsonProperty("priority")
    private Object priority;
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

    @JsonProperty("sales_id")
    public String getSalesId() {
        return salesId;
    }

    @JsonProperty("sales_id")
    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("building")
    public String getBuilding() {
        return building;
    }

    @JsonProperty("building")
    public void setBuilding(String building) {
        this.building = building;
    }

    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("raw_address")
    public String getRawAddress() {
        return rawAddress;
    }

    @JsonProperty("raw_address")
    public void setRawAddress(String rawAddress) {
        this.rawAddress = rawAddress;
    }

    @JsonProperty("radius")
    public Integer getRadius() {
        return radius;
    }

    @JsonProperty("radius")
    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @JsonProperty("polygon")
    public Object getPolygon() {
        return polygon;
    }

    @JsonProperty("polygon")
    public void setPolygon(Object polygon) {
        this.polygon = polygon;
    }

    @JsonProperty("point")
    public Point getPoint() {
        return point;
    }

    @JsonProperty("point")
    public void setPoint(Point point) {
        this.point = point;
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

    @JsonProperty("external_id")
    public Object getExternalId() {
        return externalId;
    }

    @JsonProperty("external_id")
    public void setExternalId(Object externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("client")
    public Integer getClient() {
        return client;
    }

    @JsonProperty("client")
    public void setClient(Integer client) {
        this.client = client;
    }

    @JsonProperty("country")
    public Object getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Object country) {
        this.country = country;
    }

    @JsonProperty("city")
    public Object getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(Object city) {
        this.city = city;
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

    @JsonProperty("region")
    public Object getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(Object region) {
        this.region = region;
    }

    @JsonProperty("group")
    public Object getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(Object group) {
        this.group = group;
    }

    @JsonProperty("priority")
    public Object getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Object priority) {
        this.priority = priority;
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