package rest.tests.userSettings;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.UserSettingsService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserSettingsTest extends BaseTest {

    UserSettingsService service = new UserSettingsService();

    @Test
    public void checkPatchUserSettings(){
        assertEquals(service.getPatchUserSettings().get(0).getValue(), "1",
                "UserSettings aren't updated");
    }

    @Test
    public void checkGetUserSettings(){
        assertEquals(service.getGetUserSettings().getCount(), 308,
                "Quantity of user settings aren't correct");
    }
}
