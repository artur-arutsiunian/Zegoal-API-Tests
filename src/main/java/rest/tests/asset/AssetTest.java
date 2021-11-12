package rest.tests.asset;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import rest.tests.BaseTest;
import service.BaseService;
import service.impl.AssetService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssetTest extends BaseService {

    private AssetService service;

    @BeforeAll
    void setUp(){
        service = new AssetService();
    }

    @Test
    public void checkCreateAsset(){
        assertEquals(service.getCreateAsset(token).getName(), "qwer107",
                "Asset isn't created");
    }

    @Test
    public void checkPatchAsset(){
        assertEquals(service.getPatchAsset(token).getLocation(), 8,
                "Asset isn't updated");
    }

    @Test
    public void checkGetAsset(){
        assertEquals(service.getGetAsset(token).getCount(), 9,
                "Quantity of assets aren't correct");
    }
}
