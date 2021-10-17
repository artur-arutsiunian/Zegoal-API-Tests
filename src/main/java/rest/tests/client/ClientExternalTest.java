package rest.tests.client;

import org.junit.jupiter.api.Test;
import rest.objects.client.ClientRequestForPatchExternal;
import rest.tests.BaseTest;
import service.impl.ClientExternalService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientExternalTest extends BaseTest {

    ClientExternalService service = new ClientExternalService();

    @Test
    public void checkPatchClientExternal(){ //тоже как и patch user есть проблема с репликой, если установить везде false - в админке меняет, а ответ приходит как будто не верный
        assertEquals(service.getPatchClientExternal(auth).get(0).getIsExist(), true,
                "Clients aren't updated");
    }

    @Test
    public void checkGetClientExternal(){
        assertEquals(service.getGetTClientExternal(auth).getCount(), 19,
                "Quantity of clients aren't correct");
    }
}
