package service.impl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.asset.AssetRequest;
import rest.objects.asset.AssetRequestPatch;
import rest.objects.asset.get.GetAsset;
import rest.objects.asset.patch.PatchAsset;
import rest.objects.asset.post.PostAsset;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class AssetService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public PostAsset createAsset() {
        return given(requestBuilder.requestSpec)
                .when()
                .body(initCreateAsset())
                .post("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostAsset.class);
    }

    @SneakyThrows
    private AssetRequest initCreateAsset(Object[]... field) {
        return
                new AssetRequest("locationexternal", 3);
    }

//    private Map<String, Object> initCreateAsset(String name, int location) {
//        Map<String, Object> body = new HashMap<>();
//
//        body.put("name", name);
//        body.put("location", location);
//        return body;
//    }

    public PatchAsset PatchAsset() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initPatchAsset())
                .patch("1/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PatchAsset.class);
    }

    @SneakyThrows
    private AssetRequestPatch initPatchAsset(Object[]... field) {
        return
                new AssetRequestPatch(6);
    }

//    private Map<String, Object> initPatchAsset(int location) {
//        Map<String, Object> body = new HashMap<>();
//
//        body.put("location", location);
//        return body;
//    }

    public GetAsset getAsset() {

        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetAsset.class);
    }

    public int DeleteAsset() {

        return given(requestBuilder.requestSpec)
                .when()
                .delete("5/")
                .then()
                .assertThat()
                .statusCode(204)
                .extract()
                .statusCode();
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder() {
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/asset")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}