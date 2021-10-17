package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import lombok.SneakyThrows;
import rest.objects.settings.SettingsRequest;
import rest.objects.settings.get.GetSettings;
import rest.objects.settings.patch.PatchSetting;
import rest.objects.token.Token;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class SettingsService extends BaseService {

    private final static String PATCH_SETTINGS_ENDPOINT = "/api/v1/settings/list_update/";
    private final static String GET_SETTINGS_ENDPOINT = "/api/v1/settings";

    public List<PatchSetting> getPatchSettings(Token token) {

        JsonPath jsonPath = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initPatchSetting())
                .patch(BASE_URL + PATCH_SETTINGS_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract().body().jsonPath();
        return jsonPath.getList("", PatchSetting.class);
    }

    @SneakyThrows
    private List<SettingsRequest> initPatchSetting(Object[]... field) {
        return ImmutableList.of(
                new SettingsRequest(1, "2"),
                new SettingsRequest(2, "UTC+10000"));
    }

    public GetSettings getGetSettings(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(BASE_URL + GET_SETTINGS_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetSettings.class);
    }
}
