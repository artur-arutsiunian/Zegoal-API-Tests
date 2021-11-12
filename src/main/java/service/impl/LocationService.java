package service.impl;

import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.location.LocationRequest;
import rest.objects.location.LocationRequestForPatch;
import rest.objects.location.PointPojo;
import rest.objects.location.get.GetLocation;
import rest.objects.location.patch.PatchLocation;
import rest.objects.location.post.PostLocation;
import rest.objects.token.Token;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class LocationService extends BaseService {

    private final static String LOCATION_CREATE_ENDPOINT = "/api/v1/location/";
    private final static String LOCATION_PATCH_ENDPOINT = "/api/v1/location/3/";
    private final static String LOCATION_GET_ENDPOINT = "/api/v1/location/";


    /**
     * Static method which allows us to log request and response data
     * @see RestAssured#filters(Filter, Filter...)
     */
//    static {
//        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
//    }

    public PostLocation getCreateLocation(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateLocation())
                .post(url + LOCATION_CREATE_ENDPOINT)
                .then().assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostLocation.class);
    }

    @SneakyThrows
    private LocationRequest initCreateLocation(Object[]... field) {
        return
                new LocationRequest(1, new PointPojo("Point", List.of(27,53)), "Белоруснефть-Минскавтозаправка", "проспект Дзержинского, 73А", 200);
    }

//    private Map<String, Object> initCreateLocation(String client, String type, List<Integer> coordinates, String name, String raw_address, int radius) {
//        Map<String, Object> body = new HashMap<>();
//
//        Map<String, Object> point = new HashMap<>();
//        point.put("type", type);
//        point.put("coordinates", coordinates);
//
//        body.put("client", client);
//        point.put("point", point);
//        body.put("name", name);
//        body.put("raw_address", raw_address);
//        body.put("radius", radius);
//        return body;
//    }

    public PatchLocation getPatchLocation(Token token){

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initPatchLocation())
                .patch(url + LOCATION_PATCH_ENDPOINT)
                .then().assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PatchLocation.class);
    }

    @SneakyThrows
    private LocationRequestForPatch initPatchLocation(Object[]... field) {
        return
                new LocationRequestForPatch(1,"mm1");
    }

//    private Map<String, Object> initPatchLocation(int client, String raw_address) {
//        Map<String, Object> body = new HashMap<>();
//
//        body.put("client", client);
//        body.put("raw_address", raw_address);
//        return body;
//    }

    public GetLocation getGetLocation(Token token){

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(url + LOCATION_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetLocation.class);
    }

    public PostLocation getCreateLocationForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initCreateLocationForProd())
                .post(url + LOCATION_CREATE_ENDPOINT)
                .then().assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostLocation.class);
    }

    @SneakyThrows
    private LocationRequest initCreateLocationForProd(Object[]... field) {
        return
                new LocationRequest(1, new PointPojo("Point", List.of(27,53)), "Белоруснефть-Минскавтозаправка", "проспект Дзержинского, 73А", 200);
    }

    public PatchLocation getPatchLocationForProd(Token tokenProd){

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initPatchLocationForProd())
                .patch(url + LOCATION_PATCH_ENDPOINT)
                .then().assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PatchLocation.class);
    }

    @SneakyThrows
    private LocationRequestForPatch initPatchLocationForProd(Object[]... field) {
        return
                new LocationRequestForPatch(1,"mm1");
    }

    public GetLocation getGetLocationForProd(Token tokenProd){

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .get(url + LOCATION_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetLocation.class);
    }
}