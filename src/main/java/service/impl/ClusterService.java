package service.impl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.cluster.ClusterRequest;
import rest.objects.cluster.ClusterRequestPut;
import rest.objects.cluster.get.GetCluster;
import rest.objects.cluster.post.PostCluster;
import rest.objects.cluster.put.PutCluster;
import rest.objects.token.Token;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ClusterService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public PostCluster getCreateCluster() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initCreateCluster())
                .post("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostCluster.class);
    }

    @SneakyThrows
    private ClusterRequest initCreateCluster(Object[]... field) {
        return
                new ClusterRequest("working any", List.of("8f0690fd-5dd5-4789-9131-290a7caa2fb7"));
    }

    public PutCluster getPutCluster() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initPutCluster())
                .patch("1/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PutCluster.class);
    }

    @SneakyThrows
    private ClusterRequestPut initPutCluster(Object[]... field) {
        return
                new ClusterRequestPut("work wo", List.of("8f0690fd-5dd5-4789-9131-290a7caa2fb7"));
    }

    public GetCluster getGetCluster() {

        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetCluster.class);
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder() {
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/cluster")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}
