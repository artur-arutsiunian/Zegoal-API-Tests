package service.impl;

import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.form.FormRequest;
import rest.objects.task.TaskRequest;
import rest.objects.task.TaskRequestPatch;
import rest.objects.task.get.GetTask;
import rest.objects.task.patch.PatchTask;
import rest.objects.task.post.CreateTask;
import rest.objects.token.Token;
import service.BaseService;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TaskService extends BaseService {

    private final static String TASK_CREATE_ENDPOINT = "/api/v1/task/";
    private final static String TASK_PATCH_ENDPOINT = "/api/v1/task/3/";
    private final static String TASK_GET_ENDPOINT = "/api/v1/task/";

    public CreateTask getCreateTask(Token token) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initTask())
                .post(BASE_URL + TASK_CREATE_ENDPOINT)
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
                new TaskRequest(3, 2, 1, "test", "2021-09-18", "13:01", "2021-09-19T14:30", "faf8921b-ad1e-4232-9424-50108932fba1");
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

    public PatchTask getPatchTask(Token token) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initPatchTask())
                .patch(BASE_URL + TASK_PATCH_ENDPOINT)
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
                new TaskRequestPatch("22592b96-a934-42c4-8479-b3ca4425e20c");
    }

//    private Map<String, Object> initPatchTask(String assigned_user) {
//        Map<String, Object> body = new HashMap<>();
//
//        body.put("assigned_user", assigned_user);
//        return body;
//    }

    public GetTask getGetTask(Token token) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(BASE_URL + TASK_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetTask.class);
    }

    public CreateTask getCreateTaskForProd(Token tokenProd) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initTaskForProd())
                .post(BASE_URL_FOR_PROD + TASK_CREATE_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(CreateTask.class);
    }

    @SneakyThrows
    private TaskRequest initTaskForProd(Object[]... field) {
        return
                new TaskRequest(3, 2, 1, "test", "2021-09-18", "13:01", "2021-09-19T14:30", "8f0690fd-5dd5-4789-9131-290a7caa2fb7");
    }

    public PatchTask getPatchTaskForProd(Token tokenProd) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initPatchTaskForProd())
                .patch(BASE_URL_FOR_PROD + TASK_PATCH_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PatchTask.class);

    }

    @SneakyThrows
    private TaskRequestPatch initPatchTaskForProd(Object[]... field) {
        return
                new TaskRequestPatch("8f0690fd-5dd5-4789-9131-290a7caa2fb7");
    }

    public GetTask getGetTaskForProd(Token tokenProd) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .get(BASE_URL_FOR_PROD + TASK_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetTask.class);
    }
}
