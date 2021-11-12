package rest.tests.asset;

import org.junit.jupiter.api.BeforeAll;
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

    @Test
    public void checkCreateAsset() {
        assertEquals(service.createAsset().getName(), "qwer107",
                "Asset isn't created");
    }

    @Test
    public void checkPatchAsset() {
        assertEquals(service.getPatchAsset().getLocation(), 8,
                "Asset isn't updated");
    }

    @Test
    public void checkGetAsset() {
        assertEquals(service.getAsset().getCount(), 9,
                "Quantity of assets aren't correct");
    }
}