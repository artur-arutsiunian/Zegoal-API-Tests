package rest.tests.settings;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.SettingsService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SettingsTest extends BaseTest {

    private SettingsService service = new SettingsService();

    @Test
    public void checkPatchSettings(){
        assertEquals(service.getPatchSettings().get(0).getValue(), "2",
                "Settings aren't updated");
    }

    @Test
    public void checkGetSettings(){
        assertEquals(service.getGetSettings().getCount(), 22,
                "Quantity of settings aren't correct");
    }
}
