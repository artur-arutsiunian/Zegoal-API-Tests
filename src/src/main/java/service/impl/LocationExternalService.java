package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import lombok.SneakyThrows;
import rest.objects.location.LocationRequestExternal;
import rest.objects.location.LocationRequestForPatchExternal;
import rest.objects.location.get.external.GetLocationExternal;
import rest.objects.location.patch.external.PatchLocationExternal;
import rest.objects.location.post.external.PostLocationExternal;
import rest.objects.token.Auth;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class LocationExternalService extends BaseService {

    private final static String LOCATION_CREATE_EXTERNAL_ENDPOINT = "/api/external/bulk_location_client/";
    private final static String LOCATION_PATCH_EXTERNAL_ENDPOINT = "/api/external/bulk_update_location/list_update/";
    private final static String LOCATION_GET_EXTERNAL_ENDPOINT = "api/external/location/";

    public PostLocationExternal getCreateLocationExternal() {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .body(initCreateLocation())
                .post(url + LOCATION_CREATE_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostLocationExternal.class);
    }

    @SneakyThrows
    private List<LocationRequestExternal> initCreateLocation(Object[]... field) {
        return ImmutableList.of(
                new LocationRequestExternal("проспект Дзержинского, 76А", "2021-10-09 11:00"),
        new LocationRequestExternal("проспект Дзержинского, 78А", "2021-10-09 17:00"));
    }

    public List<PatchLocationExternal> getPatchLocationExternal() {

        JsonPath jsonPath = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .body(initPatchLocation())
                .patch(url + LOCATION_PATCH_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract().body().jsonPath();
        return jsonPath.getList("", PatchLocationExternal.class);
    }

    @SneakyThrows
    private List<LocationRequestForPatchExternal> initPatchLocation(Object[]... field) {
        return ImmutableList.of(
                new LocationRequestForPatchExternal(4, true),
                new LocationRequestForPatchExternal(5, true));
    }

    public GetLocationExternal getGetTLocationExternal() {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .get(url + LOCATION_GET_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetLocationExternal.class);
    }

    public PostLocationExternal getCreateLocationExternalForProd() {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .body(initCreateLocationForProd())
                .post(url + LOCATION_CREATE_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostLocationExternal.class);
    }

    @SneakyThrows
    private List<LocationRequestExternal> initCreateLocationForProd(Object[]... field) {
        return ImmutableList.of(
                new LocationRequestExternal("проспект Дзержинского, 76А", "2021-10-09 11:00"),
                new LocationRequestExternal("проспект Дзержинского, 78А", "2021-10-09 17:00"));
    }
    public List<PatchLocationExternal> getPatchLocationExternalForProd() {

        JsonPath jsonPath = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .body(initPatchLocationForProd())
                .patch(url + LOCATION_PATCH_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract().body().jsonPath();
        return jsonPath.getList("", PatchLocationExternal.class);
    }

    @SneakyThrows
    private List<LocationRequestForPatchExternal> initPatchLocationForProd(Object[]... field) {
        return ImmutableList.of(
                new LocationRequestForPatchExternal(2, true),
                new LocationRequestForPatchExternal(3, true));
    }

    public GetLocationExternal getGetTLocationExternalForProd() {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .get(url + LOCATION_GET_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetLocationExternal.class);
    }
}
