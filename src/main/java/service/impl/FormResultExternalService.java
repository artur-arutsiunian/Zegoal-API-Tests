package service.impl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import rest.objects.formResultExternal.GetFormResultExternal;
import rest.objects.token.Auth;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class FormResultExternalService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public GetFormResultExternal getGetFormResultExternal() {
        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetFormResultExternal.class);
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder() {
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/external/form_result/")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                    .build();
        }
    }
}
