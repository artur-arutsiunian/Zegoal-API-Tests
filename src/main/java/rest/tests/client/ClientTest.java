package rest.tests.client;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import rest.tests.BaseTest;
import service.impl.ClientService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)

public class ClientTest extends BaseTest {

    private ClientService service;

    @BeforeAll
    void initService(){
        service = new ClientService();
    }

    @Test
    public void checkCreateClient(){
        assertEquals(service.getCreateClient().getName(), "client ou1",
                "Client name is incorrect");
    }

    @Test
    public void checkPatchClient(){
        assertEquals(service.getPatchClient().getName(),"client 5",
                "Client is not updated");
    }

    @Test
    public void checkGetClient(){
        assertEquals(service.getGetClient().getCount(), 20,
                "Quantity of clients are incorrect");
    }
}