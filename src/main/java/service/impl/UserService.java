package service.impl;

import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
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

    private final static String USER_CREATE_ENDPOINT = "/api/v1/user/";
    private final static String USER_PATCH_ENDPOINT = "/api/v1/user/df6801e7-fd2a-4fd2-adc8-d94e2cc527e4/";
    private final static String USER_GET_ENDPOINT = "/api/v1/user/";

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
    private UserRequestPatch initPatchUser(Object[]... field) {
        return
                new UserRequestPatch(new PojoProfilePatch("Ji"));
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

    public CreateUser getCreateUserForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initCreateUserForProd())
                .post(BASE_URL_FOR_PROD + USER_CREATE_ENDPOINT)
                .then().assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(CreateUser.class);

    }

    @SneakyThrows
    private UserRequest initCreateUserForProd(Object[]... field) {
        return
                new UserRequest("created99@gm.com", "Wimix1", new PojoProfile("User22", "Us"), List.of(2), 3);
    }

    public Profile getPatchUserForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initPatchUserForProd())
                .patch(BASE_URL_FOR_PROD + USER_PATCH_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(Profile.class);

    }

    @SneakyThrows
    private UserRequestPatch initPatchUserForProd(Object[]... field) {
        return
                new UserRequestPatch(new PojoProfilePatch("user"));
    }

    public GetUser getGetUserForProd(Token tokenProd) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .get(BASE_URL_FOR_PROD + USER_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetUser.class);
    }
}