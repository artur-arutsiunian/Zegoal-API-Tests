package service.impl;

import io.restassured.http.ContentType;
import rest.objects.form.get.external.GetFormExternal;
import rest.objects.token.Auth;
import rest.objects.token.AuthProd;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class FormExternalService extends BaseService {

    private final static String FORM_GET_EXTERNAL_ENDPOINT = "/api/external/form/";

    public GetFormExternal getGetFormExternal(Auth auth) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .get(BASE_URL + FORM_GET_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetFormExternal.class);
    }

    public GetFormExternal getGetFormExternalForProd(AuthProd authProd) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + authProd.getApiKeyProd().getApiKey())
                .when()
                .get(BASE_URL_FOR_PROD + FORM_GET_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetFormExternal.class);
    }
}
