package service.impl;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.token.Token;
import rest.objects.user.PojoProfile;
import rest.objects.user.PojoProfilePatch;
import rest.objects.user.UserRequest;
import rest.objects.user.UserRequestPatch;
import rest.objects.user.get.GetUser;
import rest.objects.user.patch.Profile;
import rest.objects.user.post.CreateUser;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class UserService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public CreateUser getCreateUser() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initCreateUser())
                .post("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(CreateUser.class);

    }

    @SneakyThrows
    private UserRequest initCreateUser(Object[]... field) {
        return
                new UserRequest("someUser3@gm.com", "Wimix1", new PojoProfile("nov", "18"), List.of(2), 3);
    }

//    private Map<String, Object> initCreateUser(String email, String password, String first_name, String last_name, List<Integer> groups, int manager) {
//        Map<String, Object> body = new HashMap<>();
//
//        Map<String, Object> profile = new HashMap<>();
//        profile.put("first_name", first_name);
//        profile.put("last_name", last_name);
//
//        body.put("email", email);
//        body.put("password", password);
//        body.put("profile", profile);
//        body.put("groups", groups);
//        body.put("manager", manager);
//        return body;
//    }

    public Profile getPatchUser() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initPatchUser())
                .patch("70903f42-10e1-4878-ab3b-c4bfc11a1ef4/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(Profile.class);

    }

    @SneakyThrows
    private UserRequestPatch initPatchUser(Object[]... field) {
        return
                new UserRequestPatch( new PojoProfilePatch("just"));
    }

//    private Map<String, Object> initPatchUser(String first_name) {
//
//        Map<String, Object> profile = new HashMap<>();
//        profile.put("first_name", first_name);
//        return profile;
//    }

    public GetUser getGetUser() {
        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetUser.class);
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder(){
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/user/")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}