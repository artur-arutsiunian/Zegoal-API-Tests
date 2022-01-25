package service.impl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.comment.CommentRequest;
import rest.objects.comment.get.GetComment;
import rest.objects.comment.post.PostComment;
import rest.objects.token.Token;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class CommentService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public PostComment getCreateComment() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initCreateComment())
                .post("/")
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
                new CommentRequest("test again2", 3);
    }

    public GetComment getGetComment() {

        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetComment.class);
    }

    private class RequestBuilder{

        private final RequestSpecification requestSpec;

        public RequestBuilder(){
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/task_comment")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}
