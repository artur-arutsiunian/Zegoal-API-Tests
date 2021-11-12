package rest.tests.cluster;

import org.junit.jupiter.api.Test;
import rest.objects.cluster.ClusterRequest;
import rest.tests.BaseTest;
import service.impl.ClusterService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClusterTest extends BaseTest {

    ClusterService service = new ClusterService();

    @Test
    public void checkCreateCluster(){
        assertEquals(service.getCreateCluster(token).getPk(), 2,
                "Cluster isn't created");
    }

    @Test
    public void checkPutCluster(){
        assertEquals(service.getPutCluster(token).getName(), "new",
                "Cluster isn't updated");
    }

    @Test
    public void checkGetCluster(){
        assertEquals(service.getGetCluster(token).getCount(), 2,
                "Quantity of clusters aren't correct");
    }

    @Test
    public void checkCreateClusterForProd(){
        assertEquals(service.getCreateClusterForProd(tokenProd).getPk(), 4,
                "Cluster isn't created");
    }

    @Test
    public void checkPutClusterForProd(){
        assertEquals(service.getPutClusterForProd(tokenProd).getName(), "new2",
                "Cluster isn't updated");
    }

    @Test
    public void checkGetClusterForProd(){
        assertEquals(service.getGetClusterForProd(tokenProd).getCount(), 4,
                "Quantity of clusters aren't correct");
    }
}
