package service.impl;

import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.token.Token;
import rest.objects.user.PojoProfile;
import rest.objects.user.PojoProfilePatch;
import rest.objects.user.UserRequest;
import rest.objects.user.get.GetUser;
import rest.objects.user.patch.Profile;
import rest.objects.user.post.CreateUser;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class UserService extends BaseService {

    private final static String USER_CREATE_ENDPOINT = "/api/v1/user/";
    private final static String USER_PATCH_ENDPOINT = "/api/v1/user/ce24c956-1ec6-4a27-a379-74de3655dc56/";
    private final static String USER_GET_ENDPOINT = "/api/v1/user/";

    /**
     * Static method which allows us to log request and response data
     * @see RestAssured#filters(Filter, Filter...)
     */
//    static {
//        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
//    }

    public CreateUser getCreateUser(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateUser())
                .post(BASE_URL + USER_CREATE_ENDPOINT)
                .then().assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(CreateUser.class);

    }

    @SneakyThrows
    private UserRequest initCreateUser(Object[]... field) {
        return
                new UserRequest("created99@gm.com", "Wimix1", new PojoProfile("User22", "Us"), List.of(2), 3);
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

    public Profile getPatchUser(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initPatchUser())
                .patch(BASE_URL + USER_PATCH_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(Profile.class);

    }

    @SneakyThrows
    private PojoProfilePatch initPatchUser(Object[]... field) {
        return
                new PojoProfilePatch("User22");
    }

//    private Map<String, Object> initPatchUser(String first_name) {
//
//        Map<String, Object> profile = new HashMap<>();
//        profile.put("first_name", first_name);
//        return profile;
//    }

    public GetUser getGetUser(Token token) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(BASE_URL + USER_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetUser.class);
    }
}