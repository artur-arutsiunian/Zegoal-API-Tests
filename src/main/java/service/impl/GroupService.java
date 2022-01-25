package service.impl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.epic.post.PostEpic;
import rest.objects.group.GroupRequest;
import rest.objects.group.GroupRequestPatch;
import rest.objects.group.ProfilePojo;
import rest.objects.group.get.GetGroup;
import rest.objects.group.patch.PatchGroup;
import rest.objects.group.patch.Profile;
import rest.objects.group.post.PostGroup;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GroupService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public PostGroup CreateGroup(){

        return given(requestBuilder.requestSpec)
                .when()
                .body(initCreateGroup())
                .post("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostGroup.class);
    }

    @SneakyThrows
    private GroupRequest initCreateGroup(Object[]... field){
        return
                new GroupRequest("any", List.of(527,528), new ProfilePojo(5));

    }

    public Profile UpdateGroup(){
        return given(requestBuilder.requestSpec)
                .when()
                .body(initPatchGroup())
                .patch("8/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(Profile.class);
    }

    @SneakyThrows
    private GroupRequestPatch initPatchGroup(Object[]... field){
        return
                new GroupRequestPatch("any", new ProfilePojo(8));

    }

    public GetGroup FetchGroup(){
        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetGroup.class);
    }

    public int DeleteGroup(){
        return given(requestBuilder.requestSpec)
                .when()
                .delete("8/")
                .then()
                .assertThat()
                .statusCode(204)
                .extract()
                .statusCode();
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder() {
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/group")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}
