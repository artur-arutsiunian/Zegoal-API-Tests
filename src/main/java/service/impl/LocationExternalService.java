package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
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

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public PostLocationExternal getCreateLocationExternal() {
        return given(requestBuilder.requestSpec)
                .when()
                .body(initCreateLocation())
                .post("bulk_location_client/")
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
                new LocationRequestExternal("for loc", "somenn"),
        new LocationRequestExternal("for loc2", "some"));
    }

    public List<PatchLocationExternal> getPatchLocationExternal() {

        JsonPath jsonPath = given(requestBuilder.requestSpec)
                .when()
                .body(initPatchLocation())
                .patch("bulk_update_location/list_update/")
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
                new LocationRequestForPatchExternal(27, true),
                new LocationRequestForPatchExternal(28, true));
    }

    public GetLocationExternal getGetTLocationExternal() {
        return given(requestBuilder.requestSpec)
                .when()
                .get("location/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetLocationExternal.class);
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder() {
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/external/")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                    .build();
        }
    }
}
