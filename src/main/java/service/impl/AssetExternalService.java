package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import lombok.SneakyThrows;
import rest.objects.asset.AssetRequestForPatchExternal;
import rest.objects.asset.get.external.GetAssetExternal;
import rest.objects.asset.patch.external.PatchAssetExternal;
import rest.objects.token.Auth;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class AssetExternalService extends BaseService {

    private final static String ASSET_PATCH_EXTERNAL_ENDPOINT = "/api/external/bulk_update_asset/list_update/";
    private final static String ASSET_GET_EXTERNAL_ENDPOINT = "/api/external/asset/";

    public List<PatchAssetExternal> getPatchAssetExternal(Auth auth) {

        JsonPath jsonPath = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .body(initPatchAsset())
                .patch(url + ASSET_PATCH_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract().body().jsonPath();
        return jsonPath.getList("", PatchAssetExternal.class);
    }

    @SneakyThrows
    private List<AssetRequestForPatchExternal> initPatchAsset(Object[]... field) {
        return ImmutableList.of(
                new AssetRequestForPatchExternal(3, true),
                new AssetRequestForPatchExternal(4, true));
    }

    public GetAssetExternal getGetAssetExternal(Auth auth) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .get(url + ASSET_GET_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetAssetExternal.class);
    }

    public List<PatchAssetExternal> getPatchAssetExternalForProd(Auth auth) {

        JsonPath jsonPath = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .body(initPatchAssetForProd())
                .patch(url + ASSET_PATCH_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract().body().jsonPath();
        return jsonPath.getList("", PatchAssetExternal.class);
    }

    @SneakyThrows
    private List<AssetRequestForPatchExternal> initPatchAssetForProd(Object[]... field) {
        return ImmutableList.of(
                new AssetRequestForPatchExternal(1, true),
                new AssetRequestForPatchExternal(2, true));
    }

    public GetAssetExternal getGetAssetExternalForProd(Auth auth) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .get(url + ASSET_GET_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetAssetExternal.class);
    }
}
