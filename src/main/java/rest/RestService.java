package rest;

import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import io.restassured.http.ContentType;
import rest.objects.token.Token;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestService {

    private final static String BASE_URL = "https://testing7.zgdev.info";
    private final static String LOGIN_ENDPOINT = "/api/auth/token/";
    private final static String CLIENT_ENDPOINT = "/api/v1/client/";
    private final static String TASK_ENDPOINT = "/api/v1/task/";

    /**
     * Static method which allows us to log request and response data
     * @see RestAssured#filters(Filter, Filter...)
     */
    static {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
    public Token getToken() {

        return given()
                .contentType(ContentType.JSON)
                .when()
                .body(initBody("UdT5Nmlm9x42vq3CvQ4H7S7VOcQVJzCVIKeeIDer","Ncptw156EextrVGNxuTslUSM1etS2JBoPYbRn1W2GGj87eJ96aXQJ85HZziIhOtTTUsMgaDeRTNo1rmydglfJMYo8tp4Cxz4WHm7stKyIucVW3gMLdwWg5XHKqo3Uszb", "password", "test@mail.com", "Wimix1", "990000862471854", "2.10"))
                .post(BASE_URL + LOGIN_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(Token.class);
    }

    private Map<String, Object> initBody(String client_id, String client_secret, String grant_type, String username, String password, String device_id, String client_app_version) {
        Map<String, Object> body = new HashMap<>();


        body.put("client_id", "UdT5Nmlm9x42vq3CvQ4H7S7VOcQVJzCVIKeeIDer");
        body.put("client_secret", "Ncptw156EextrVGNxuTslUSM1etS2JBoPYbRn1W2GGj87eJ96aXQJ85HZziIhOtTTUsMgaDeRTNo1rmydglfJMYo8tp4Cxz4WHm7stKyIucVW3gMLdwWg5XHKqo3Uszb");
        body.put("grant_type", "password");
        body.put("username", "test@mail.com");
        body.put("password", "Wimix1");
        body.put("device_id", "990000862471854");
        body.put("client_app_version", "2.10");
        return body;
    }
}