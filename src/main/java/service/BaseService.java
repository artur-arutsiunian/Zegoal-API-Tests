package service;

import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import rest.TestRunner;
import rest.objects.apikey.ApiKey;
import rest.objects.token.Auth;
import rest.objects.token.Token;
import service.impl.AuthService;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseService extends TestRunner {

    protected Auth auth;
    protected Token token;
    protected ApiKey apiKey;

    public String url;


    @BeforeAll
    void setUp() {

        switch (System.getenv("env")){
            case "stage":
                url = "https://stagebaseautotest.zgtest.info/";
                break;
            case "prod":
                url = "https://prodbaseautotest.zegoal.com/";
                break;
        }

        this.auth = new AuthService().getAuth();
        this.token = auth.getToken();
        this.apiKey = auth.getApiKey();
    }

    /**
     * Static method which allows us to log request and response data
     * @see RestAssured#filters(Filter, Filter...)
     */
    static {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}