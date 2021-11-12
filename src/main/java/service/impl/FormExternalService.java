package service.impl;

import io.restassured.http.ContentType;
import rest.objects.form.get.external.GetFormExternal;
import rest.objects.token.Auth;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class FormExternalService extends BaseService {

    private final static String FORM_GET_EXTERNAL_ENDPOINT = "/api/external/form/";

    public GetFormExternal getGetFormExternal(Auth auth) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .get(url + FORM_GET_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetFormExternal.class);
    }

        public GetFormExternal getGetFormExternalForProd(Auth auth) {
            return given()
                    .contentType(ContentType.JSON)
                    .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                    .when()
                    .get(url + FORM_GET_EXTERNAL_ENDPOINT)
                    .then()
                    .assertThat()
                    .contentType(ContentType.JSON)
                    .statusCode(200)
                    .extract()
                    .as(GetFormExternal.class);
        }
}
