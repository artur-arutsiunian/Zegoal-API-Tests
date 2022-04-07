package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.asset.AssetRequestForPatchExternal;
import rest.objects.asset.get.external.GetAssetExternal;
import rest.objects.asset.patch.external.PatchAssetExternal;
import rest.objects.token.Auth;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class AssetExternalService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public List<PatchAssetExternal> getPatchAssetExternal() {

        JsonPath jsonPath = given(requestBuilder.requestSpec)
                .when()
                .body(initPatchAsset())
                .patch("bulk_update_asset/list_update/")
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
                new AssetRequestForPatchExternal(11, true));
    }

    public GetAssetExternal getGetAssetExternal() {
        return given(requestBuilder.requestSpec)
                .when()
                .get("asset/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetAssetExternal.class);
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder() {
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/external")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                    .build();
        }
    }
}