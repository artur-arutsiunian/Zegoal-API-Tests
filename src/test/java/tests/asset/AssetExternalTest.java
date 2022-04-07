package tests.asset;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import tests.BaseTest;
import service.impl.AssetExternalService;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AssetExternalTest extends BaseTest {

    private AssetExternalService service;

    @BeforeAll
    void initService(){
        service = new AssetExternalService();
    }

    @Order(1)
    @Test
    public void checkPatchAssetExternal(){ //тоже как и patch user есть проблема с репликой, если установить везде false - в админке меняет, а ответ приходит как будто не верный
        assertEquals(service.getPatchAssetExternal().get(0).getIsExist(), true,
                "Assets aren't updated");
    }

    @Order(2)
    @Test
    public void checkGetAssetExternal(){
        assertEquals(service.getGetAssetExternal().getCount(), 12,
                "Quantity of assets aren't correct");
    }
}
