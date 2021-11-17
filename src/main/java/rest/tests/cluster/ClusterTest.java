package rest.tests.cluster;

import org.junit.jupiter.api.BeforeAll;
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

    @Test
    public void checkCreateCluster(){
        assertEquals(service.getCreateCluster().getPk(), 6,
                "Cluster isn't created");
    }

    @Test
    public void checkPutCluster(){
        assertEquals(service.getPutCluster().getName(), "cluster6",
                "Cluster isn't updated");
    }

    @Test
    public void checkGetCluster(){
        assertEquals(service.getGetCluster().getCount(), 6,
                "Quantity of clusters aren't correct");
    }
}
