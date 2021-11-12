package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import lombok.SneakyThrows;
import rest.objects.client.ClientRequestForPatchExternal;
import rest.objects.client.get.external.GetClientExternal;
import rest.objects.client.patch.external.PatchClientExternal;
import rest.objects.token.Auth;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ClientExternalService extends BaseService {

    private final static String CLIENT_PATCH_EXTERNAL_ENDPOINT = "/api/external/bulk_update_client/list_update/";
    private final static String CLIENT_GET_EXTERNAL_ENDPOINT = "/api/external/client/";

    public List<PatchClientExternal> getPatchClientExternal(Auth auth) {

        JsonPath jsonPath = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .body(initPatchClient())
                .patch(url + CLIENT_PATCH_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract().body().jsonPath();
        return jsonPath.getList("", PatchClientExternal.class);
    }

    @SneakyThrows
    private List<ClientRequestForPatchExternal> initPatchClient(Object[]... field) {
        return ImmutableList.of(
                new ClientRequestForPatchExternal(4, true),
                new ClientRequestForPatchExternal(5, true));
    }


    public GetClientExternal getGetTClientExternal(Auth auth) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .get(url + CLIENT_GET_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetClientExternal.class);
    }

    public List<PatchClientExternal> getPatchClientExternalForProd(Auth auth) {

        JsonPath jsonPath = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .body(initPatchClientForProd())
                .patch(url + CLIENT_PATCH_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract().body().jsonPath();
        return jsonPath.getList("", PatchClientExternal.class);
    }

    @SneakyThrows
    private List<ClientRequestForPatchExternal> initPatchClientForProd(Object[]... field) {
        return ImmutableList.of(
                new ClientRequestForPatchExternal(1, true),
                new ClientRequestForPatchExternal(2, true));
    }

    public GetClientExternal getGetTClientExternalForProd(Auth auth) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .get(url + CLIENT_GET_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetClientExternal.class);
    }
}
