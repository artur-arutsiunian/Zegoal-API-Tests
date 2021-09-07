package rest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class APITest extends TestRunner {

    private static final RestService REST_SERVICE = new RestService();
    private static String token;

    @BeforeAll
    static void setUp() {
        token = REST_SERVICE.getToken().getAccessToken(); }

    @Test
    public void checkReceiveToken() {
        assertEquals(REST_SERVICE.getToken().getScope(), "read write groups",
                "Token is incorrect");
    }
}