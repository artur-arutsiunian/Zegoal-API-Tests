package service.impl;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
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

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public PostLocation getCreateLocation() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initCreateLocation())
                .post("/")
                .then().assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostLocation.class);
    }

    @SneakyThrows
    private LocationRequest initCreateLocation(Object[]... field) {
        return
                new LocationRequest(2, new PointPojo("Point", List.of(27, 53)), "Белоруснефть-Минскавтозаправка", "location city", 200);
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

    public PatchLocation getPatchLocation() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initPatchLocation())
                .patch("5/")
                .then().assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PatchLocation.class);
    }

    @SneakyThrows
    private LocationRequestForPatch initPatchLocation(Object[]... field) {
        return
                new LocationRequestForPatch(1, "city city");
    }

//    private Map<String, Object> initPatchLocation(int client, String raw_address) {
//        Map<String, Object> body = new HashMap<>();
//
//        body.put("client", client);
//        body.put("raw_address", raw_address);
//        return body;
//    }

    public GetLocation getGetLocation() {

        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetLocation.class);
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder() {
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/location")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}