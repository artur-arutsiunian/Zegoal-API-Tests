package rest.tests.location;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.LocationExternalService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationExternalTest extends BaseTest {

    LocationExternalService service = new LocationExternalService();

    @Test
    public void checkCreateLocationExternal(){
        assertEquals(service.getCreateLocationExternal().getLocationCount(), 2,
                "Location count aren't correct");
    }

    @Test
    public void checkPatchLocationExternal(){ //тоже как и patch user есть проблема с репликой, если установить везде false - в админке меняет, а ответ приходит как будто не верный
        assertEquals(service.getPatchLocationExternal().get(0).getIsExist(), true,
                "Locations aren't updated");
    }

    @Test
    public void checkGetLocationExternal(){
        assertEquals(service.getGetTLocationExternal().getCount(), 31,
                "Quantity of locations aren't correct");
    }

    @Test
    public void checkCreateLocationExternalForProd(){
        assertEquals(service.getCreateLocationExternalForProd().getLocationCount(), 2,
                "Location count aren't correct");
    }

    @Test
    public void checkPatchLocationExternalForProd(){ //тоже как и patch user есть проблема с репликой, если установить везде false - в админке меняет, а ответ приходит как будто не верный
        assertEquals(service.getPatchLocationExternalForProd().get(0).getIsExist(), true,
                "Locations aren't updated");
    }

    @Test
    public void checkGetLocationExternalForProd(){
        assertEquals(service.getGetTLocationExternalForProd().getCount(), 7,
                "Quantity of locations aren't correct");
    }
}
