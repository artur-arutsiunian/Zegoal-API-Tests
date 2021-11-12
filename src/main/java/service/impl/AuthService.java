package service.impl;

import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.apikey.ApiKey;
import rest.objects.form.FormRequest;
import rest.objects.token.Auth;
import rest.objects.token.AuthProd;
import rest.objects.token.Token;
import rest.objects.token.TokenRequest;
import service.BaseService;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthService extends BaseService {

    private final static String LOGIN_ENDPOINT = "/api/auth/token/";
    private final static String API_KEY_LOGIN_ENDPOINT = "/api/v1/api_key/";

    public Auth getAuth() {

        Token token = given()
                .contentType(ContentType.JSON)
                .when()
                .body(initBody())
                .post(BASE_URL + LOGIN_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(Token.class);

        ApiKey apiKey = given()
                .header("Authorization", "Bearer " + token.getAccessToken())
                .contentType(ContentType.JSON)
                .when()
                .post(BASE_URL + API_KEY_LOGIN_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(ApiKey.class);

        return new Auth(token, apiKey);
    }

    @SneakyThrows
    private TokenRequest initBody(Object[]... field) {
        return
                new TokenRequest("UdT5Nmlm9x42vq3CvQ4H7S7VOcQVJzCVIKeeIDer", "Ncptw156EextrVGNxuTslUSM1etS2JBoPYbRn1W2GGj87eJ96aXQJ85HZziIhOtTTUsMgaDeRTNo1rmydglfJMYo8tp4Cxz4WHm7stKyIucVW3gMLdwWg5XHKqo3Uszb","password", "mr.arutsiunian@mail.ru", "Wimix1", "990000862471854", "2.10");
    }

//    private Map<String, Object> initBody(String client_id, String client_secret, String grant_type, String username, String password, String device_id, String client_app_version) {
//        Map<String, Object> body = new HashMap<>();
//
//
//        body.put("client_id", client_id);
//        body.put("client_secret", client_secret);
//        body.put("grant_type", grant_type);
//        body.put("username", username);
//        body.put("password", password);
//        body.put("device_id", device_id);
//        body.put("client_app_version", client_app_version);
//        return body;
//    }

    public AuthProd getAuthForProd() {

        Token tokenProd = given()
                .contentType(ContentType.JSON)
                .when()
                .body(initBodyForProd())
                .post(BASE_URL_FOR_PROD + LOGIN_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(Token.class);

        ApiKey apiKeyProd = given()
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .contentType(ContentType.JSON)
                .when()
                .post(BASE_URL_FOR_PROD + API_KEY_LOGIN_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(ApiKey.class);

        return new AuthProd(tokenProd, apiKeyProd);
    }

    @SneakyThrows
    private TokenRequest initBodyForProd(Object[]... field) {
        return
                new TokenRequest("UdT5Nmlm9x42vq3CvQ4H7S7VOcQVJzCVIKeeIDer", "Ncptw156EextrVGNxuTslUSM1etS2JBoPYbRn1W2GGj87eJ96aXQJ85HZziIhOtTTUsMgaDeRTNo1rmydglfJMYo8tp4Cxz4WHm7stKyIucVW3gMLdwWg5XHKqo3Uszb","password", "mr.arutsiunian@mail.ru", "Wimix1", "990000862471854", "2.10");
    }
}