package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.settings.SettingsRequest;
import rest.objects.token.Token;
import rest.objects.userSettings.get.GetUserSettings;
import rest.objects.userSettings.patch.PatchUserSetting;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class UserSettingsService extends BaseService {

    private final UserSettingsService.RequestBuilder requestBuilder = new UserSettingsService.RequestBuilder();

    public List<PatchUserSetting> getPatchUserSettings() {

        JsonPath jsonPath = given(requestBuilder.requestSpec)
                .when()
                .body(initPatchUserSetting())
                .patch("list_update/")
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
                new SettingsRequest(6, "2"));
    }

    public GetUserSettings getGetUserSettings() {

        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetUserSettings.class);
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder(){
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/user_settings/")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}
