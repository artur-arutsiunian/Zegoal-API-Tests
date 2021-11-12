package service.impl;

import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.apikey.ApiKey;
import rest.objects.token.Auth;
//import rest.objects.token.AuthProd;
import rest.objects.token.Token;
import rest.objects.token.TokenRequest;
import service.BaseService;

import static io.restassured.RestAssured.given;

public class AuthService extends BaseService {

    private final static String LOGIN_ENDPOINT = "/api/auth/token/";
    private final static String API_KEY_LOGIN_ENDPOINT = "/api/v1/api_key/";

    /**
     * Static method which allows us to log request and response data
     * @see RestAssured#filters(Filter, Filter...)
     */
//    static {
//        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
//    }

    public Auth getAuth() {

        Token token = given()
                .contentType(ContentType.JSON)
                .when()
                .body(initBody())
                .post(url + LOGIN_ENDPOINT)
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
                .post(url + API_KEY_LOGIN_ENDPOINT)
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
}