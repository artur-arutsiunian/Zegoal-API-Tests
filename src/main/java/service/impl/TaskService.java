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
import rest.objects.token.Token;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class TaskService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public CreateTask getCreateTask() {
        return given(requestBuilder.requestSpec)
                .when()
                .body(initTask())
                .post("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(CreateTask.class);
    }

    @SneakyThrows
    private TaskRequest initTask(Object[]... field) {
        return
                new TaskRequest(14, 1, 1, "test", "2022-03-18", "13:01", "2022-03-20T14:30", "8f0690fd-5dd5-4789-9131-290a7caa2fb7");
    }

//    private Map<String, Object> initTask(int main_report_form, int location, int type, String description, String planned_start_at_date, String planned_start_at_time, String planned_end_at, String assigned_user) {
//        Map<String, Object> body = new HashMap<>();
//
//
//        body.put("main_report_form", main_report_form);
//        body.put("location", location);
//        body.put("type", type);
//        body.put("description", description);
//        body.put("planned_start_at_date", planned_start_at_date);
//        body.put("planned_start_at_time", planned_start_at_time);
//        body.put("planned_end_at", planned_end_at);
//        body.put("assigned_user", assigned_user);
//        return body;
//    }

    public PatchTask getPatchTask() {
        return given(requestBuilder.requestSpec)
                .when()
                .body(initPatchTask())
                .patch("3/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PatchTask.class);

    }

    @SneakyThrows
    private TaskRequestPatch initPatchTask(Object[]... field) {
        return
                new TaskRequestPatch("8f0690fd-5dd5-4789-9131-290a7caa2fb7");
    }

//    private Map<String, Object> initPatchTask(String assigned_user) {
//        Map<String, Object> body = new HashMap<>();
//
//        body.put("assigned_user", assigned_user);
//        return body;
//    }

    public GetTask getGetTask() {
        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetTask.class);
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
