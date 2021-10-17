package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.task.TaskRequestExternal;
import rest.objects.task.get.external.GetTaskExternal;
import rest.objects.task.post.external.CreateTaskExternal;
import rest.objects.token.Auth;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class TaskExternalService extends BaseService {

    private final static String TASK_CREATE_ENDPOINT = "/api/external/task_bulk/";
    private final static String TASK_GET_ENDPOINT = "/api/external/task/";

    public CreateTaskExternal getCreateTaskExternal(Auth auth) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .body(initTask())
                .post(BASE_URL + TASK_CREATE_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(CreateTaskExternal.class);
    }

    @SneakyThrows
    private List<TaskRequestExternal> initTask(Object[]... field) {
        return ImmutableList.of(
                new TaskRequestExternal(6, "проспект Дзержинского, 73А", "2021-10-08 11:00", "mr.arutsiunian@mail.ru", "Sample Company"));
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


    public GetTaskExternal getGetTaskExternal(Auth auth) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                .when()
                .get(BASE_URL + TASK_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetTaskExternal.class);
    }
}
