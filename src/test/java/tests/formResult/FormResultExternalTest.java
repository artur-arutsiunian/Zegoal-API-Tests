package tests.formResult;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tests.BaseTest;
import service.impl.FormResultExternalService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormResultExternalTest extends BaseTest {

    private FormResultExternalService service;

    @BeforeAll
    void initService(){
        service = new FormResultExternalService();
    }

    @Test
    public void checkGetFormResultExternalService(){
        assertEquals(service.getGetFormResultExternal().getCount(), 1,
                "Quantity of form result aren't correct ");
    }
}
