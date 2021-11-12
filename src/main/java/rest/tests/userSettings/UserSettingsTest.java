package rest.tests.userSettings;

import org.junit.jupiter.api.Test;
import service.BaseService;
import service.impl.UserSettingsService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserSettingsTest extends BaseService {

    UserSettingsService service = new UserSettingsService();

    @Test
    public void checkPatchUserSettings(){
        assertEquals(service.getPatchUserSettings(token).get(0).getValue(), "1",
                "UserSettings aren't updated");
    }

    @Test
    public void checkGetUserSettings(){
        assertEquals(service.getGetUserSettings(token).getCount(), 308,
                "Quantity of user settings aren't correct");
    }
}
