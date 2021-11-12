package service.impl;

import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.asset.post.PostAsset;
import rest.objects.comment.post.PostComment;
import rest.objects.commentNotification.CommentNotificationRequest;
import rest.objects.commentNotification.get.GetCommentNotification;
import rest.objects.commentNotification.post.PostCommentNotification;
import rest.objects.form.FormRequest;
import rest.objects.form.get.GetForm;
import rest.objects.token.Token;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class CommentNotificationService extends BaseService {

    private final static String CREATE_COMMENT_NOTIFICATION_ENDPOINT = "/api/v1/task_comment_notification/";
    private final static String GET_COMMENT_NOTIFICATION_ENDPOINT = "/api/v1/task_comment_notification/";

    public PostCommentNotification getCreateCommentNotification(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCommentNotification())
                .post(BASE_URL + CREATE_COMMENT_NOTIFICATION_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostCommentNotification.class);
    }

    @SneakyThrows
    private CommentNotificationRequest initCommentNotification(Object[]... field) {
        return
                new CommentNotificationRequest(2);
    }

    public GetCommentNotification getGetCommentNotification(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(BASE_URL + GET_COMMENT_NOTIFICATION_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetCommentNotification.class);
    }

    public PostCommentNotification getCreateCommentNotificationForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initCommentNotificationForProd())
                .post(BASE_URL_FOR_PROD + CREATE_COMMENT_NOTIFICATION_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostCommentNotification.class);
    }

    @SneakyThrows
    private CommentNotificationRequest initCommentNotificationForProd(Object[]... field) {
        return
                new CommentNotificationRequest(1);
    }

    public GetCommentNotification getGetCommentNotificationForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .get(BASE_URL_FOR_PROD + GET_COMMENT_NOTIFICATION_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetCommentNotification.class);
    }
}
