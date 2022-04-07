package service.impl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.task.TaskRequest;
import rest.objects.task.TaskRequestPatch;
import rest.objects.task.get.GetTask;
import rest.objects.task.patch.PatchTask;
import rest.objects.task.post.CreateTask;
import rest.objects.taskRemark.RemarkPatchRequest;
import rest.objects.taskRemark.RemarkRequest;
import rest.objects.taskRemark.get.GetRemark;
import rest.objects.taskRemark.patch.PatchRemark;
import rest.objects.taskRemark.post.PostRemark;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class RemarkService extends BaseService {

    private final RemarkService.RequestBuilder requestBuilder = new RemarkService.RequestBuilder();

    public PostRemark CreateRemark() {
        return given(requestBuilder.requestSpec)
                .when()
                .body(initRemark())
                .post("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostRemark.class);
    }

    @SneakyThrows
    private RemarkRequest initRemark(Object[]... field) {
        return
                new RemarkRequest("remark", "70903f42-10e1-4878-ab3b-c4bfc11a1ef4", "2022-04-05T21:00:00", "2022-04-05T21:00:00", 1, 2, 23);
    }

    public PatchRemark UpdateRemark() {
        return given(requestBuilder.requestSpec)
                .when()
                .body(initPatchRemark())
                .patch("21/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PatchRemark.class);

    }

    @SneakyThrows
    private RemarkPatchRequest initPatchRemark(Object[]... field) {
        return
                new RemarkPatchRequest("777");
    }

    public GetRemark getGetRemark() {
        return given(requestBuilder.requestSpec)
                .when()
                .get("21/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetRemark.class);
    }

    public int DeleteRemark() {
        return given(requestBuilder.requestSpec)
                .when()
                .delete("21/")
                .then()
                .assertThat()
                .statusCode(204)
                .extract()
                .statusCode();
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder(){
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/task/")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}
