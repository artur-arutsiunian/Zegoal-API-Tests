package service;

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
            case "stage" -> url = "https://stagebaseautotest.zgtest.info";
            case "prod" -> url = "https://prodbaseautotest.zegoal.com";
        }
        this.auth = new AuthService(url).getAuth();
        this.token = auth.getToken();
        this.apiKey = auth.getApiKey();
    }
}