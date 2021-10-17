package rest.tests.asset;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.AssetExternalService;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AssetExternalTest extends BaseTest {

    AssetExternalService service = new AssetExternalService();

    @Test
    public void checkPatchAssetExternal(){ //тоже как и patch user есть проблема с репликой, если установить везде false - в админке меняет, а ответ приходит как будто не верный
        assertEquals(service.getPatchAssetExternal(auth).get(0).getIsExist(), true,
                "Assets aren't updated");
    }

    @Test
    public void checkGetAssetExternal(){
        assertEquals(service.getGetAssetExternal(auth).getCount(), 5,
                "Quantity of assets aren't correct");
    }
}
