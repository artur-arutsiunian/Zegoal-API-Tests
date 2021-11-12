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
        assertEquals(service.getCreateClient().getName(), "client name98",
                "Client name is incorrect");
    }

    @Test
    public void checkPatchClient(){
        assertEquals(service.getPatchClient().getName(),"client name",
                "Client is not updated");
    }

    @Test
    public void checkGetClient(){
        assertEquals(service.getGetClient().getCount(), 18,
                "Quantity of clients are incorrect");
    }

    @Test
    public void checkCreateClientForProd(){
        assertEquals(service.getCreateClientForProd().getName(), "client name98",
                "Client name is incorrect");
    }

    @Test
    public void checkPatchClientForProd(){
        assertEquals(service.getPatchClientForProd().getName(),"client name",
                "Client is not updated");
    }

    @Test
    public void checkGetClientForProd(){
        assertEquals(service.getGetClientForProd().getCount(), 3,
                "Quantity of clients are incorrect");
    }
}