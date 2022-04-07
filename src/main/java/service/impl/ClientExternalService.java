package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.client.ClientRequestForPatchExternal;
import rest.objects.client.get.external.GetClientExternal;
import rest.objects.client.patch.external.PatchClientExternal;
import rest.objects.token.Auth;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ClientExternalService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public List<PatchClientExternal> getPatchClientExternal() {

        JsonPath jsonPath = given(requestBuilder.requestSpec)
                .when()
                .body(initPatchClient())
                .patch("bulk_update_client/list_update/")
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
                new ClientRequestForPatchExternal(19, true),
                new ClientRequestForPatchExternal(5, true));
    }


    public GetClientExternal getGetTClientExternal() {
        return given(requestBuilder.requestSpec)
                .when()
                .get("client/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetClientExternal.class);
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
