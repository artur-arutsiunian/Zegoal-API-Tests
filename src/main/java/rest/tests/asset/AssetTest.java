package rest.tests.asset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.AssetService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssetTest extends BaseTest {

    private AssetService service;

    @BeforeAll
    void initService() {
        service = new AssetService();
    }

    @Order(1)
    @Test
    public void checkCreateAsset() {
        assertEquals(service.createAsset().getName(), "item",
                "Asset isn't created");
    }

    @Order(2)
    @Test
    public void checkPatchAsset() {
        assertEquals(service.PatchAsset().getLocation(), 3,
                "Asset isn't updated");
    }

    @Order(3)
    @Test
    public void checkGetAsset() {
        assertEquals(service.getAsset().getCount(), 7,
                "Quantity of assets aren't correct");
    }

    @Order(4)
    @Test
    public void checkDeleteAsset(){
       assertEquals(service.DeleteAsset(), 204,
        "Asset isn't deleted");
    }
}