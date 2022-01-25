package rest.tests.location;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.LocationExternalService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationExternalTest extends BaseTest {

    private LocationExternalService service;

    @BeforeAll
    void initService(){
        service = new LocationExternalService();
    }

    @Order(1)
    @Test
    public void checkCreateLocationExternal(){
        assertEquals(service.getCreateLocationExternal().getLocationCount(), 2,
                "Location count aren't correct");
    }

    @Order(2)
    @Test
    public void checkPatchLocationExternal(){ //тоже как и patch user есть проблема с репликой, если установить везде false - в админке меняет, а ответ приходит как будто не верный
        assertEquals(service.getPatchLocationExternal().get(0).getIsExist(), true,
                "Locations aren't updated");
    }

    @Order(3)
    @Test
    public void checkGetLocationExternal(){
        assertEquals(service.getGetTLocationExternal().getCount(), 39,
                "Quantity of locations aren't correct");
    }
}
