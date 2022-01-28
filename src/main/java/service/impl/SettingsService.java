package service.impl;

import com.google.common.collect.ImmutableList;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import rest.objects.settings.SettingsRequest;
import rest.objects.settings.get.GetSettings;
import rest.objects.settings.patch.PatchSetting;
import rest.objects.token.Token;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class SettingsService extends BaseService {

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public List<PatchSetting> getPatchSettings() {

        JsonPath jsonPath = given(requestBuilder.requestSpec)
                .when()
                .body(initPatchSetting())
                .patch("list_update/")
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
                new SettingsRequest(2, "dd-mm-yy"),
                new SettingsRequest(1, "UTC+02"));
    }

    public GetSettings getGetSettings() {

        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetSettings.class);
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder() {
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/settings/")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}
