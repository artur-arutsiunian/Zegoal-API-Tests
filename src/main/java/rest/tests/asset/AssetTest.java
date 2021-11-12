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

    @Test
    public void checkCreateAssetForProd(){
        assertEquals(service.getCreateAssetForProd(tokenProd).getName(), "qwer107",
                "Asset isn't created");
    }

    @Test
    public void checkPatchAssetForProd(){
        assertEquals(service.getPatchAssetForProd(tokenProd).getLocation(), 8,
                "Asset isn't updated");
    }

    @Test
    public void checkGetAssetForProd(){
        assertEquals(service.getGetAssetForProd(tokenProd).getCount(), 3,
                "Quantity of assets aren't correct");
    }
}
