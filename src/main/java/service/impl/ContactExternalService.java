package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.contact.ContactRequestForPatchExternal;
import rest.objects.contact.get.external.GetContactExternal;
import rest.objects.contact.patch.external.PatchContactExternal;
import rest.objects.token.Auth;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ContactExternalService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public List<PatchContactExternal> getPatchContactExternal() {

        JsonPath jsonPath = given(requestBuilder.requestSpec)
                .when()
                .body(initPatchContact())
                .patch("/bulk_update_contact/list_update/")
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
                new ContactRequestForPatchExternal(6, true),
                new ContactRequestForPatchExternal(5, true));
    }

    public GetContactExternal getGetContactExternal() {
        return given(requestBuilder.requestSpec)
                .when()
                .get("contact/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetContactExternal.class);
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
