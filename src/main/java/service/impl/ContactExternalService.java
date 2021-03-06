package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import lombok.SneakyThrows;
import rest.objects.contact.ContactRequestForPatchExternal;
import rest.objects.contact.get.external.GetContactExternal;
import rest.objects.contact.patch.external.PatchContactExternal;
import rest.objects.token.Auth;
import rest.objects.token.AuthProd;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ContactExternalService extends BaseService {

    private final static String CONTACT_PATCH_EXTERNAL_ENDPOINT = "/api/external/bulk_update_contact/list_update/";
    private final static String CONTACT_GET_EXTERNAL_ENDPOINT = "/api/external/contact/";

    public List<PatchContactExternal> getPatchContactExternal(Auth auth) {

        JsonPath jsonPath = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .body(initPatchContact())
                .patch(BASE_URL + CONTACT_PATCH_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract().body().jsonPath();
        return jsonPath.getList("", PatchContactExternal.class);
    }

    @SneakyThrows
    private List<ContactRequestForPatchExternal> initPatchContact(Object[]... field) {
        return ImmutableList.of(
                new ContactRequestForPatchExternal(3, true),
                new ContactRequestForPatchExternal(4, true));
    }

    public GetContactExternal getGetContactExternal(Auth auth) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .get(BASE_URL + CONTACT_GET_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetContactExternal.class);
    }

    public List<PatchContactExternal> getPatchContactExternalForProd(AuthProd authProd) {

        JsonPath jsonPath = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + authProd.getApiKeyProd().getApiKey())
                .when()
                .body(initPatchContactForProd())
                .patch(BASE_URL_FOR_PROD + CONTACT_PATCH_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract().body().jsonPath();
        return jsonPath.getList("", PatchContactExternal.class);
    }

    @SneakyThrows
    private List<ContactRequestForPatchExternal> initPatchContactForProd(Object[]... field) {
        return ImmutableList.of(
                new ContactRequestForPatchExternal(1, true),
                new ContactRequestForPatchExternal(2, true));
    }

    public GetContactExternal getGetContactExternalForProd(AuthProd authProd) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + authProd.getApiKeyProd().getApiKey())
                .when()
                .get(BASE_URL_FOR_PROD + CONTACT_GET_EXTERNAL_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetContactExternal.class);
    }
}
