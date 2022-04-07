package tests.client;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import rest.objects.client.ClientRequestForPatchExternal;
import tests.BaseTest;
import service.impl.ClientExternalService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientExternalTest extends BaseTest {

    ClientExternalService service;

    @BeforeAll
    void initService(){
        service = new ClientExternalService();
    }

    @Order(1)
    @Test
    public void checkPatchClientExternal(){ //тоже как и patch user есть проблема с репликой, если установить везде false - в админке меняет, а ответ приходит как будто не верный
        assertEquals(service.getPatchClientExternal().get(0).getIsExist(), true,
                "Clients aren't updated");
    }

    @Order(2)
    @Test
    public void checkGetClientExternal(){
        assertEquals(service.getGetTClientExternal().getCount(), 16,
                "Quantity of clients aren't correct");
    }
}
