package rest.tests.client;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import rest.tests.BaseTest;
import service.impl.ClientService;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@Execution(ExecutionMode.CONCURRENT) (этот поток нужно убрать, чтобы тесты шли в нужном порядке)

public class ClientTest extends BaseTest {

    private ClientService service;

    @BeforeAll
    void initService(){
        service = new ClientService();
    }

    @Order(1)
    @Test
    public void checkCreateClient(){
        assertEquals(service.getCreateClient().getName(), "client6w",
                "Client name is incorrect");
    }

    @Order(2)
    @Test
    public void checkPatchClient(){
        assertEquals(service.getPatchClient().getName(),"any",
                "Client is not updated");
    }

    @Order(3)
    @Test
    public void checkGetClient(){
        assertEquals(service.getGetClient().getCount(), 20,
                "Quantity of clients are incorrect");
    }
}