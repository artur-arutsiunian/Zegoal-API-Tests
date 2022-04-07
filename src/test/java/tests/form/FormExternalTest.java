package tests.form;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tests.BaseTest;
import service.impl.FormExternalService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormExternalTest extends BaseTest {

    private FormExternalService service;

    @BeforeAll
    void initService(){
        service = new FormExternalService();
    }

    @Test
    public void checkGetFormExternal(){
        assertEquals(service.getGetFormExternal().getCount(), 34,
                "Quantity of form aren't correct");
    }
}
