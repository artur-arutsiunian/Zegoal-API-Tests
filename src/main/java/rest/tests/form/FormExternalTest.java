package rest.tests.form;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.FormExternalService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormExternalTest extends BaseTest {

    FormExternalService service = new FormExternalService();

    @Test
    public void checkGetFormExternal(){
        assertEquals(service.getGetFormExternal().getCount(), 40,
                "Quantity of form aren't correct");
    }

    @Test
    public void checkGetFormExternalForProd(){
        assertEquals(service.getGetFormExternalForProd().getCount(), 2,
                "Quantity of form aren't correct");
    }
}
