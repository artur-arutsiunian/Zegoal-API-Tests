package rest.tests.formResult;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.FormResultExternalService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormResultExternal extends BaseTest {

    FormResultExternalService service = new FormResultExternalService();

    @Test
    public void checkGetFormResultExternalService(){
        assertEquals(service.getGetFormResultExternal(auth).getCount(), 3,
                "Quantity of form result aren't correct ");
    }

    @Test
    public void checkGetFormResultExternalServiceForProd(){
        assertEquals(service.getGetFormResultExternalForProd(authProd).getCount(), 1,
                "Quantity of form result aren't correct ");
    }
}
