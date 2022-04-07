package rest.tests.cluster;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import rest.objects.cluster.ClusterRequest;
import rest.tests.BaseTest;
import service.impl.ClusterService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClusterTest extends BaseTest {

    private ClusterService service;

    @BeforeAll
    void initService(){
        service = new ClusterService();
    }

    @Order(1)
    @Test
    public void checkCreateCluster(){
        assertEquals(service.getCreateCluster().getPk(), 13,
                "Cluster isn't created");
    }

    @Order(2)
    @Test
    public void checkPutCluster(){
        assertEquals(service.getPutCluster().getName(), "work wo",
                "Cluster isn't updated");
    }

    @Order(3)
    @Test
    public void checkGetCluster(){
        assertEquals(service.getGetCluster().getCount(), 13,
                "Quantity of clusters aren't correct");
    }
}
