package service.impl;

import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.epic.EpicRequest;
import rest.objects.epic.EpicRequestPatch;
import rest.objects.epic.get.GetEpic;
import rest.objects.epic.patch.PatchEpic;
import rest.objects.epic.post.PostEpic;
import rest.objects.token.Token;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class EpicService extends BaseService {

    private final static String EPIC_CREATE_ENDPOINT= "/api/v1/epic/";
    private final static String EPIC_PATCH_ENDPOINT= "/api/v1/epic/2/";
    private final static String EPIC_GET_ENDPOINT= "/api/v1/epic/";

    public PostEpic getCreateEpic(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateEpic())
                .post(url + EPIC_CREATE_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostEpic.class);
    }

    @SneakyThrows
    private EpicRequest initCreateEpic(Object[]... field) {
        return
                new EpicRequest("2021-10-13T21:00:00", "2021-10-13T21:00:00", "new epic2", List.of(23));
    }

    public PatchEpic getPatchEpic(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initPatchEpic())
                .patch(url + EPIC_PATCH_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PatchEpic.class);
    }

    @SneakyThrows
    private EpicRequestPatch initPatchEpic(Object[]... field) {
        return
                new EpicRequestPatch("2021-10-16");
    }

    public GetEpic getGetEpic(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(url + EPIC_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetEpic.class);
    }

    public PostEpic getCreateEpicForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initCreateEpicForProd())
                .post(url + EPIC_CREATE_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostEpic.class);
    }

    @SneakyThrows
    private EpicRequest initCreateEpicForProd(Object[]... field) {
        return
                new EpicRequest("2021-11-13T21:00:00", "2021-11-14T21:00:00", "new epic2", List.of(4));
    }

    public PatchEpic getPatchEpicForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initPatchEpicForProd())
                .patch(url + EPIC_PATCH_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PatchEpic.class);
    }

    @SneakyThrows
    private EpicRequestPatch initPatchEpicForProd(Object[]... field) {
        return
                new EpicRequestPatch("2021-11-12");
    }

    public GetEpic getGetEpicForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .get(url + EPIC_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetEpic.class);
    }
}
