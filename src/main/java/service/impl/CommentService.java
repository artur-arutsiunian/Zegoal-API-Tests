package service.impl;

import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.comment.CommentRequest;
import rest.objects.comment.get.GetComment;
import rest.objects.comment.post.PostComment;
import rest.objects.token.Token;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class CommentService extends BaseService {

    private final static String COMMENT_CREATE_ENDPOINT = "/api/v1/task_comment/";
    private final static String COMMENT_GET_ENDPOINT = "/api/v1/task_comment/";

    public PostComment getCreateComment() {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateComment())
                .post(url + COMMENT_CREATE_ENDPOINT)
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

    public GetComment getGetComment() {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(url + COMMENT_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetComment.class);
    }

    public PostComment getCreateCommentForProd() {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateCommentForProd())
                .post(url + COMMENT_CREATE_ENDPOINT)
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
                new CommentRequest("ppll", 1);
    }

    public GetComment getGetCommentForProd() {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(url + COMMENT_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetComment.class);
    }
}
