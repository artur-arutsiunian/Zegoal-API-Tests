package service.impl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
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

    private final WorkStatusLogService.RequestBuilder requestBuilder= new WorkStatusLogService.RequestBuilder();

    public PostWorkStatusLog getCreateWorkStatusLog() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initCreateWorkStatusLog())
                .post("/")
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
                new WorkStatusLogRequest(1, "990000862471854", 7 , 1, 2, 1634837053, new PointPojoForLog("Point", List.of(53, 27)));
    }

    public GetWorkStatusLog getGetWorkStatusLog() {

        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetWorkStatusLog.class);
    }

    private class RequestBuilder{

        private final RequestSpecification requestSpec;

        public RequestBuilder(){
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/log/work_status/")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}
