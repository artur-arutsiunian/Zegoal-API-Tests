package rest.tests.client;

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

    private ClientService service = new ClientService();

    @Test
    public void checkCreateClient(){
        assertEquals(service.getCreateClient(token).getName(), "client name98",
                "Client name is incorrect");
    }

    @Test
    public void checkPatchClient(){
        assertEquals(service.getPatchClient(token).getName(),"client name",
                "Client is not updated");
    }

    @Test
    public void checkGetClient(){
        assertEquals(service.getGetClient(token).getCount(), 18,
                "Quantity of clients are incorrect");
    }
}