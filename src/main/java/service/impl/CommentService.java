package service.impl;

import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.asset.post.PostAsset;
import rest.objects.comment.CommentRequest;
import rest.objects.comment.get.GetComment;
import rest.objects.comment.post.PostComment;
import rest.objects.form.FormRequest;
import rest.objects.form.get.GetForm;
import rest.objects.token.Token;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class CommentService extends BaseService {

    private final static String COMMENT_CREATE_ENDPOINT = "/api/v1/task_comment/";
    private final static String COMMENT_GET_ENDPOINT = "/api/v1/task_comment/";

    public PostComment getCreateComment(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateComment())
                .post(BASE_URL + COMMENT_CREATE_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostComment.class);
    }

    @SneakyThrows
    private CommentRequest initCreateComment(Object[]... field) {
        return
                new CommentRequest("ppll", 1);
    }

    public GetComment getGetComment(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(BASE_URL + COMMENT_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetComment.class);
    }

    public PostComment getCreateCommentForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initCreateCommentForProd())
                .post(BASE_URL_FOR_PROD + COMMENT_CREATE_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostComment.class);
    }

    @SneakyThrows
    private CommentRequest initCreateCommentForProd(Object[]... field) {
        return
                new CommentRequest("HI", 1);
    }

    public GetComment getGetCommentForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .get(BASE_URL_FOR_PROD + COMMENT_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetComment.class);
    }
}
