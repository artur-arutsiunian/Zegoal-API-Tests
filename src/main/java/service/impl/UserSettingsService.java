package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import lombok.SneakyThrows;
import rest.objects.settings.SettingsRequest;
import rest.objects.token.Token;
import rest.objects.userSettings.get.GetUserSettings;
import rest.objects.userSettings.patch.PatchUserSetting;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class UserSettingsService extends BaseService {

    private final static String PATCH_USER_SETTINGS_ENDPOINT = "/api/v1/user_settings/list_update/";
    private final static String GET_USER_SETTINGS_ENDPOINT = "/api/v1/user_settings/";

    public List<PatchUserSetting> getPatchUserSettings(Token token) {

        JsonPath jsonPath = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initPatchUserSetting())
                .patch(url + PATCH_USER_SETTINGS_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract().body().jsonPath();
        return jsonPath.getList("", PatchUserSetting.class);
    }

    @SneakyThrows
    private List<SettingsRequest> initPatchUserSetting(Object[]... field) {
        return ImmutableList.of(
                new SettingsRequest(6, "1"));
    }

    public GetUserSettings getGetUserSettings(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(url + GET_USER_SETTINGS_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetUserSettings.class);
    }
}
