package service.impl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.task.TaskRequest;
import rest.objects.task.TaskRequestPatch;
import rest.objects.task.post.CreateTask;
import rest.objects.taskLabel.TaskLabelRequest;
import rest.objects.taskLabel.TaskLabelRequestPut;
import rest.objects.taskLabel.get.getList.GetListTaskLabel;
import rest.objects.taskLabel.get.getPk.GetPkTaskLabel;
import rest.objects.taskLabel.post.CreateTaskLabel;
import rest.objects.taskLabel.put.PutTaskLabel;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class TaskLabelService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public CreateTaskLabel getCreateTaskLabel(){
        return given(requestBuilder.requestSpec)
                .when()
                .body(initTaskLabel())
                .post("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(CreateTaskLabel.class);
    }

    @SneakyThrows
    private TaskLabelRequest initTaskLabel(Object[]... field) {
        return
                new TaskLabelRequest("new5", "#4f98fc");
    }

    public PutTaskLabel getUpdateTaskLabel(){
        return given(requestBuilder.requestSpec)
                .when()
                .body(initPutTaskLabel())
                .patch("5/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PutTaskLabel.class);
    }

    @SneakyThrows
    private TaskLabelRequestPut initPutTaskLabel(Object[]... field) {
        return
                new TaskLabelRequestPut("mark1", "#4f98fc");
    }

    public GetListTaskLabel FetchTaskLabel(){
        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetListTaskLabel.class);
    }

    public GetPkTaskLabel FetchIdTaskLabel(){
        return given(requestBuilder.requestSpec)
                .when()
                .get("5/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetPkTaskLabel.class);
    }

    public int DeleteTaskLabel(){
        return given(requestBuilder.requestSpec)
                .when()
                .delete("5/")
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
                    .setBasePath("/api/v1/task_label/")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}
