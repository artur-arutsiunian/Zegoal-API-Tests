package service;

import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import rest.objects.apikey.ApiKey;

public abstract class BaseService {

    protected final static String BASE_URL = "https://stagebaseautotest.zgtest.info/";
    protected final static String BASE_URL_FOR_PROD = "some5";

    /**
     * Static method which allows us to log request and response data
     * @see RestAssured#filters(Filter, Filter...)
     */
    static {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

}