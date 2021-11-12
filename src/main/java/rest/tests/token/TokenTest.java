package rest.tests.token;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import service.BaseService;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TokenTest extends BaseService {


    @Test
    public void checkReceiveToken() {
        assertEquals(token.getScope(), "read write groups",
                "Token is incorrect");
    }

    @Test
    public void checkReceiveTokenForProd(){
        assertEquals(token.getScope(), "read write groups",
                "Token is incorrect");
    }
}