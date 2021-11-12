package service.impl;

import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.token.Token;
import rest.objects.workStatusLog.PointPojoForLog;
import rest.objects.workStatusLog.WorkStatusLogRequest;
import rest.objects.workStatusLog.get.GetWorkStatusLog;
import rest.objects.workStatusLog.post.PostWorkStatusLog;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class WorkStatusLogService extends BaseService {

    private final static String WORK_STATUS_LOG_CREATE_ENDPOINT= "/api/v1/log/work_status/";
    private final static String WORK_STATUS_LOG_GET_ENDPOINT= "/api/v1/log/work_status/";

    public PostWorkStatusLog getCreateWorkStatusLog() {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateWorkStatusLog())
                .post(url + WORK_STATUS_LOG_CREATE_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostWorkStatusLog.class);
    }

    @SneakyThrows
    private WorkStatusLogRequest initCreateWorkStatusLog(Object[]... field) {
        return
                new WorkStatusLogRequest(1, "990000862471854", 28 , 1, 2, 1634837053, new PointPojoForLog("Point", List.of(53, 27)));
    }

    public GetWorkStatusLog getGetWorkStatusLog() {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(url + WORK_STATUS_LOG_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetWorkStatusLog.class);
    }
}
