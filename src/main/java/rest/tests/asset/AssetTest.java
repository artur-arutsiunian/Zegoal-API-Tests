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
        assertEquals(service.PatchAsset().getLocation(), 3,
                "Asset isn't updated");
    }

    @Test
    public void checkGetAsset() {
        assertEquals(service.getAsset().getCount(), 4,
                "Quantity of assets aren't correct");
    }
}