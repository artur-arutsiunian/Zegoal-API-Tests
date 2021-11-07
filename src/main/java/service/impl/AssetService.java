package service.impl;

import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.asset.AssetRequest;
import rest.objects.asset.AssetRequestPatch;
import rest.objects.asset.get.GetAsset;
import rest.objects.asset.patch.PatchAsset;
import rest.objects.asset.post.PostAsset;
import rest.objects.form.FormRequest;
import rest.objects.token.Token;
import service.BaseService;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AssetService extends BaseService {

    private final static String ASSET_CREATE_ENDPOINT = "/api/v1/asset/";
    private final static String ASSET_PATCH_ENDPOINT = "/api/v1/asset/2/";
    private final static String ASSET_GET_ENDPOINT = "/api/v1/asset/";

    public PostAsset getCreateAsset(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateAsset())
                .post(BASE_URL + ASSET_CREATE_ENDPOINT)
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
                new AssetRequest("qwer107", 3);
    }

//    private Map<String, Object> initCreateAsset(String name, int location) {
//        Map<String, Object> body = new HashMap<>();
//
//        body.put("name", name);
//        body.put("location", location);
//        return body;
//    }

    public PatchAsset getPatchAsset(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initPatchAsset())
                .patch(BASE_URL + ASSET_PATCH_ENDPOINT)
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
                new AssetRequestPatch(8);
    }

//    private Map<String, Object> initPatchAsset(int location) {
//        Map<String, Object> body = new HashMap<>();
//
//        body.put("location", location);
//        return body;
//    }

    public GetAsset getGetAsset(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(BASE_URL + ASSET_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetAsset.class);
    }
}
