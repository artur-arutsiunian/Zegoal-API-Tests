package rest.tests.settings;

import org.junit.jupiter.api.Test;
import service.BaseService;
import service.impl.SettingsService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SettingsTest extends BaseService {

    private SettingsService service = new SettingsService();

    @Test
    public void checkPatchSettings(){
        assertEquals(service.getPatchSettings(token).get(0).getValue(), "2",
                "Settings aren't updated");
    }

    @Test
    public void checkGetSettings(){
        assertEquals(service.getGetSettings(token).getCount(), 22,
                "Quantity of settings aren't correct");
    }
}
