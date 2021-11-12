package service.impl;

import io.restassured.http.ContentType;
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

    private final static String CREATE_CLUSTER_ENDPOINT = "/api/v1/cluster/";
    private final static String PUT_CLUSTER_ENDPOINT = "/api/v1/cluster/1/";
    private final static String GET_CLUSTER_ENDPOINT = "/api/v1/cluster/";

    public PostCluster getCreateCluster(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateCluster())
                .post(url + CREATE_CLUSTER_ENDPOINT)
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
                new ClusterRequest("clus1", List.of("3b96a356-e7f6-41e8-abab-b47793236dc0"));
    }

    public PutCluster getPutCluster(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initPutCluster())
                .patch(url + PUT_CLUSTER_ENDPOINT)
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
                new ClusterRequestPut("new", List.of("3b96a356-e7f6-41e8-abab-b47793236dc0"));
    }

    public GetCluster getGetCluster(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(url + GET_CLUSTER_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetCluster.class);
    }

    public PostCluster getCreateClusterForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initCreateClusterForProd())
                .post(url + CREATE_CLUSTER_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostCluster.class);
    }

    @SneakyThrows
    private ClusterRequest initCreateClusterForProd(Object[]... field) {
        return
                new ClusterRequest("clus1", List.of("8f0690fd-5dd5-4789-9131-290a7caa2fb7"));
    }

    public PutCluster getPutClusterForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initPutClusterForProd())
                .patch(url + PUT_CLUSTER_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PutCluster.class);
    }

    @SneakyThrows
    private ClusterRequestPut initPutClusterForProd(Object[]... field) {
        return
                new ClusterRequestPut("new", List.of("8f0690fd-5dd5-4789-9131-290a7caa2fb7"));
    }

    public GetCluster getGetClusterForProd(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(url + GET_CLUSTER_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetCluster.class);
    }
}
