package service.impl;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.client.ClientRequest;
import rest.objects.client.MainLocationPojo;
import rest.objects.client.get.GetClient;
import rest.objects.client.patch.PatchClient;
import rest.objects.client.post.PostClient;
import rest.objects.token.Token;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class ClientService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public PostClient getCreateClient() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initCreateClient())
                .post("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostClient.class);
    }

    @SneakyThrows
    private ClientRequest initCreateClient(Object[]... field) {
        return
                new ClientRequest("client ou9", new MainLocationPojo("main lkl"));
    }

//    private Map<String, Object> initCreateClient(String name, String name1) {
//        Map<String, Object> body = new HashMap<>();
//
//        Map<String, Object> main_location = new HashMap<>();
//        main_location.put("name", name);
//
//        body.put("name", name);
//        body.put("main_location", main_location);
//        return body;
//    }

    public PatchClient getPatchClient() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initPatchClient())
                .patch("3/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PatchClient.class);
    }

    @SneakyThrows
    private ClientRequest initPatchClient(Object[]... field) {
        return
                new ClientRequest("client 0");
    }

//    private Map<String, Object> initPatchClient(String name) {
//        Map<String, Object> body = new HashMap<>();
//
//        body.put("name", name);
//        return body;
//    }

    public GetClient getGetClient() {

        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetClient.class);
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder() {
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/client")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}