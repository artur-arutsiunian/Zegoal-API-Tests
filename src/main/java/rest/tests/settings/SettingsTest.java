package rest.tests.settings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.SettingsService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SettingsTest extends BaseTest {

    private SettingsService service;

    @BeforeAll
    void initService(){
        service = new SettingsService();
    }

    @Order(1)
    @Test
    public void checkPatchSettings(){
        assertEquals(service.getPatchSettings().get(0).getValue(), "dd-mm-yy",
                "Settings aren't updated");
    }

    @Order(2)
    @Test
    public void checkGetSettings(){
        assertEquals(service.getGetSettings().getCount(), 22,
                "Quantity of settings aren't correct");
    }
}
