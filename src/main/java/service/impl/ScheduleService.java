package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.schedule.get.GetSchedule;
import rest.objects.schedule.post.PostSchedule;
import rest.objects.schedule.ScheduleRequest;
import rest.objects.schedule.put.PutSchedule;
import rest.objects.token.Token;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ScheduleService extends BaseService {

    private final static String SCHEDULE_CREATE_ENDPOINT = "/api/v1/user_schedule/";
    private final static String SCHEDULE_PUT_ENDPOINT = "/api/v1/user_schedule/1/";
    private final static String SCHEDULE_GET_ENDPOINT = "/api/v1/user_schedule/";

    public PostSchedule getCreateSchedule(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateSchedule())
                .post(BASE_URL + SCHEDULE_CREATE_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostSchedule.class);
    }

    @SneakyThrows
    private List<ScheduleRequest> initCreateSchedule(Object[]... field) {
        return ImmutableList.of(
                new ScheduleRequest("567238c2-eab1-4ced-b401-fe33ab5112cd", 0, "2021-10-01 11:10", "2021-10-02 18:10", false),
        new ScheduleRequest("567238c2-eab1-4ced-b401-fe33ab5112cd", 0, "2021-09-29 8:10", "2021-09-30 17:10", false));
    }

    public PutSchedule getPutSchedule(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initPutSchedule())
                .put(BASE_URL + SCHEDULE_PUT_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PutSchedule.class);
    }

    @SneakyThrows
    private ScheduleRequest initPutSchedule(Object[]... field) {
        return (
                new ScheduleRequest("b3653c02-440a-452b-a362-f86237ca8701", 0, "2021-10-06 11:10", "2021-10-07 18:10", false));
}

    public GetSchedule getGetSchedule(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(BASE_URL + SCHEDULE_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetSchedule.class);
    }
}
