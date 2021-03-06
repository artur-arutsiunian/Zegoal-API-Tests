package service.impl;

import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.client.ClientRequest;
import rest.objects.client.MainLocationPojo;
import rest.objects.client.get.GetClient;
import rest.objects.client.patch.PatchClient;
import rest.objects.client.post.PostClient;
import rest.objects.form.FormFieldRequest;
import rest.objects.form.FormGroupRequest;
import rest.objects.form.FormRequest;
import rest.objects.token.Token;
import service.BaseService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ClientService extends BaseService {

    private final static String CLIENT_CREATE_ENDPOINT = "/api/v1/client/";
    private final static String CLIENT_PATCH_ENDPOINT = "/api/v1/client/3/";
    private final static String CLIENT_GET_ENDPOINT = "/api/v1/client/";

    /**
     * Static method which allows us to log request and response data
     * @see RestAssured#filters(Filter, Filter...)
     */
//    static {
//        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
//    }

    public PostClient getCreateClient(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateClient())
                .post(BASE_URL + CLIENT_CREATE_ENDPOINT)
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
                new ClientRequest("client name98", new MainLocationPojo("main loc"));
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

    public PatchClient getPatchClient(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initPatchClient())
                .patch(BASE_URL + CLIENT_PATCH_ENDPOINT)
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
                new ClientRequest("client name");
    }

//    private Map<String, Object> initPatchClient(String name) {
//        Map<String, Object> body = new HashMap<>();
//
//        body.put("name", name);
//        return body;
//    }

    public GetClient getGetClient(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(BASE_URL + CLIENT_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetClient.class);
    }

    public PostClient getCreateClientForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initCreateClientForProd())
                .post(BASE_URL_FOR_PROD + CLIENT_CREATE_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostClient.class);
    }

    @SneakyThrows
    private ClientRequest initCreateClientForProd(Object[]... field) {
        return
                new ClientRequest("client name98", new MainLocationPojo("main loc"));
    }

    public PatchClient getPatchClientForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initPatchClientForProd())
                .patch(BASE_URL_FOR_PROD + CLIENT_PATCH_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PatchClient.class);
    }

    @SneakyThrows
    private ClientRequest initPatchClientForProd(Object[]... field) {
        return
                new ClientRequest("client name2");
    }

    public GetClient getGetClientForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .get(BASE_URL_FOR_PROD + CLIENT_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetClient.class);
    }
}