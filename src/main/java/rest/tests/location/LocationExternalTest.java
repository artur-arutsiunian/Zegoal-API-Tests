package rest.tests.location;

import org.junit.jupiter.api.Test;
import service.BaseService;
import service.impl.LocationExternalService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationExternalTest extends BaseService {

    LocationExternalService service = new LocationExternalService();

    @Test
    public void checkCreateLocationExternal(){
        assertEquals(service.getCreateLocationExternal(auth).getLocationCount(), 2,
                "Location count aren't correct");
    }

    @Test
    public void checkPatchLocationExternal(){ //тоже как и patch user есть проблема с репликой, если установить везде false - в админке меняет, а ответ приходит как будто не верный
        assertEquals(service.getPatchLocationExternal(auth).get(0).getIsExist(), true,
                "Locations aren't updated");
    }

    @Test
    public void checkGetLocationExternal(){
        assertEquals(service.getGetTLocationExternal(auth).getCount(), 31,
                "Quantity of locations aren't correct");
    }

    @Test
    public void checkCreateLocationExternalForProd(){
        assertEquals(service.getCreateLocationExternalForProd(auth).getLocationCount(), 2,
                "Location count aren't correct");
    }

    @Test
    public void checkPatchLocationExternalForProd(){ //тоже как и patch user есть проблема с репликой, если установить везде false - в админке меняет, а ответ приходит как будто не верный
        assertEquals(service.getPatchLocationExternalForProd(auth).get(0).getIsExist(), true,
                "Locations aren't updated");
    }

    @Test
    public void checkGetLocationExternalForProd(){
        assertEquals(service.getGetTLocationExternalForProd(auth).getCount(), 7,
                "Quantity of locations aren't correct");
    }
}
