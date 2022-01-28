package service.impl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.epic.EpicRequest;
import rest.objects.epic.EpicRequestPatch;
import rest.objects.epic.get.GetEpic;
import rest.objects.epic.patch.PatchEpic;
import rest.objects.epic.post.PostEpic;
import rest.objects.token.Token;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class EpicService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public PostEpic getCreateEpic() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initCreateEpic())
                .post("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostEpic.class);
    }

    @SneakyThrows
    private EpicRequest initCreateEpic(Object[]... field) {
        return
                new EpicRequest("2022-01-10T21:00:00", "2022-01-12T21:00:00", "any epic", List.of(16));
    }

    public PatchEpic getPatchEpic() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initPatchEpic())
                .patch("4/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PatchEpic.class);
    }

    @SneakyThrows
    private EpicRequestPatch initPatchEpic(Object[]... field) {
        return
                new EpicRequestPatch("2021-10-31");
    }

    public GetEpic getGetEpic() {

        return given(requestBuilder.requestSpec)
                .queryParam("limit", 20)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetEpic.class);
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder() {
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/epic")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}
