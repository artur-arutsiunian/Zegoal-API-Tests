package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.task.TaskRequestExternal;
import rest.objects.task.get.external.GetTaskExternal;
import rest.objects.task.post.external.CreateTaskExternal;
import rest.objects.token.Auth;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class TaskExternalService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public CreateTaskExternal getCreateTaskExternal() {
        return given(requestBuilder.requestSpec)
                .when()
                .body(initTask())
                .post("task_bulk/")
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
                new TaskRequestExternal(18, "проспект Дзержинского, 73А", "2021-11-19 11:00", "mr.arutsiunian@mail.ru", "Sample Company"));
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

    public GetTaskExternal getGetTaskExternal() {
        return given(requestBuilder.requestSpec)
                .when()
                .get("task/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetTaskExternal.class);
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder() {
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/external")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Api-Key " + auth.getApiKey().getApiKey())
                    .build();
        }
    }
}
