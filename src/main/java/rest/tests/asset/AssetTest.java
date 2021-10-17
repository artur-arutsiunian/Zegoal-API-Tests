package rest.tests.asset;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import rest.tests.BaseTest;
import service.impl.AssetService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssetTest extends BaseTest {

    private AssetService service = new AssetService();

    @Test
    public void checkCreateAsset(){
        assertEquals(service.getCreateAsset(token).getName(), "qwer102",
                "Asset isn't created");
    }

    @Test
    public void checkPatchAsset(){
        assertEquals(service.getPatchAsset(token).getLocation(), 6,
                "Asset isn't updated");
    }

    @Test
    public void checkGetAsset(){
        assertEquals(service.getGetAsset(token).getCount(), 7,
                "Quantity of assets aren't correct");
    }
}
