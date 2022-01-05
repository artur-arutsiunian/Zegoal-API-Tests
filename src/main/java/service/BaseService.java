package service;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import rest.objects.apikey.ApiKey;
import rest.objects.token.Auth;
import rest.objects.token.Token;
import service.impl.AuthService;

public abstract class BaseService {

    public static String url;
    protected Auth auth;
    protected Token token;
    protected ApiKey apiKey;

    public BaseService() {
        switch (System.getenv("env")) {
            case "stage" -> url = "https://fortest.zgtest.info";
            case "prod" -> url = "https://prodbaseautotest.zegoal.com";
        }
        this.auth = new AuthService(url).getAuth();
        this.token = auth.getToken();
        this.apiKey = auth.getApiKey();
    }

//    static {
//        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
//        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
//    }
}