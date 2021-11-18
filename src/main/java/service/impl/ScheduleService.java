package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
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

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public PostSchedule getCreateSchedule() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initCreateSchedule())
                .post("/")
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
                new ScheduleRequest("8f0690fd-5dd5-4789-9131-290a7caa2fb7", 0, "2021-11-08 11:10", "2021-11-09 18:10", false),
        new ScheduleRequest("8f0690fd-5dd5-4789-9131-290a7caa2fb7", 0, "2021-11-10 8:10", "2021-11-11 17:10", false));
    }

    public PutSchedule getPutSchedule() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initPutSchedule())
                .put("1/")
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
                new ScheduleRequest("70903f42-10e1-4878-ab3b-c4bfc11a1ef4", 0, "2021-11-17 11:10", "2021-11-18 18:10", false));
}

    public GetSchedule getGetSchedule() {

        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetSchedule.class);
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder() {
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/user_schedule/")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}

