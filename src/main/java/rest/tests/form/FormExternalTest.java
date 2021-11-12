package rest.tests.form;

import org.junit.jupiter.api.Test;
import service.BaseService;
import service.impl.FormExternalService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormExternalTest extends BaseService {

    FormExternalService service = new FormExternalService();

    @Test
    public void checkGetFormExternal(){
        assertEquals(service.getGetFormExternal(auth).getCount(), 40,
                "Quantity of form aren't correct");
    }

    @Test
    public void checkGetFormExternalForProd(){
        assertEquals(service.getGetFormExternalForProd(auth).getCount(), 2,
                "Quantity of form aren't correct");
    }
}
