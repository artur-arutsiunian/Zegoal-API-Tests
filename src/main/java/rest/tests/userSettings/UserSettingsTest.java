package rest.tests.userSettings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.UserSettingsService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserSettingsTest extends BaseTest {

   private UserSettingsService service;

   @BeforeAll
   void initService(){
       service = new UserSettingsService();
   }

   @Order(1)
    @Test
    public void checkPatchUserSettings(){
        assertEquals(service.getPatchUserSettings().get(0).getValue(), "3",
                "UserSettings aren't updated");
    }

    @Order(2)
    @Test
    public void checkGetUserSettings(){
        assertEquals(service.getGetUserSettings().getCount(), 132,
                "Quantity of user settings aren't correct");
    }
}
