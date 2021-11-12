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
import rest.objects.token.Token;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class ClientService extends BaseService {

    private final static String CLIENT_CREATE_ENDPOINT = "/api/v1/client/";
    private final static String CLIENT_PATCH_ENDPOINT = "/api/v1/client/2/";
    private final static String CLIENT_GET_ENDPOINT = "/api/v1/client/";

    public PostClient getCreateClient(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateClient())
                .post(url + CLIENT_CREATE_ENDPOINT)
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
                .patch(url + CLIENT_PATCH_ENDPOINT)
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
                .get(url + CLIENT_GET_ENDPOINT)
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
                .post(url + CLIENT_CREATE_ENDPOINT)
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
                .patch(url + CLIENT_PATCH_ENDPOINT)
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
                new ClientRequest("client name");
    }

    public GetClient getGetClientForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .get(url + CLIENT_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetClient.class);
    }
}