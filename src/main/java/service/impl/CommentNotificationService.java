package service.impl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.commentNotification.CommentNotificationRequest;
import rest.objects.commentNotification.get.GetCommentNotification;
import rest.objects.commentNotification.post.PostCommentNotification;
import rest.objects.token.Token;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class CommentNotificationService extends BaseService {

    private final RequestBuilder requestBuilder= new RequestBuilder();

    public PostCommentNotification getCreateCommentNotification() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initCommentNotification())
                .post("/")
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

    public GetCommentNotification getGetCommentNotification() {

        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetCommentNotification.class);
    }

    private class RequestBuilder{

        private final RequestSpecification requestSpec;

        public RequestBuilder(){
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/task_comment_notification")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}
