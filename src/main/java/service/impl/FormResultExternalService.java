package service.impl;

import io.restassured.http.ContentType;
import rest.objects.formResultExternal.GetFormResultExternal;
import rest.objects.token.Auth;
import rest.objects.token.AuthProd;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class FormResultExternalService extends BaseService {

    private final static String ASSET_PATCH_EXTERNAL_ENDPOINT = "/api/external/form_result/";

    public GetFormResultExternal getGetFormResultExternal(Auth auth) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .get(BASE_URL + ASSET_PATCH_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetFormResultExternal.class);
    }

    public GetFormResultExternal getGetFormResultExternalForProd(AuthProd authProd) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + authProd.getApiKeyProd().getApiKey())
                .when()
                .get(BASE_URL_FOR_PROD + ASSET_PATCH_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetFormResultExternal.class);
    }
    }
