package rest.tests.location;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import service.BaseService;
import service.impl.LocationService;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LocationTest extends BaseService {

    private LocationService service = new LocationService();

    @Test
    public void checkCreateLocation() {
        assertEquals(service.getCreateLocation(token).getRawAddress(), "проспект Дзержинского, 73А",
                "Location raw address is incorrect");
    }

    @Test
    public void checkPatchLocation() {
        assertEquals(service.getPatchLocation(token).getRawAddress(), "mm1",
                "Location isn't update");
    }

    @Test
    public void checkGetLocation() {
        assertEquals(service.getGetLocation(token).getCount(), 33,
                "Quantity of locations aren't correct");
    }

    @Test
    public void checkCreateLocationForProd() {
        assertEquals(service.getCreateLocationForProd(token).getRawAddress(), "проспект Дзержинского, 73А",
                "Location raw address is incorrect");
    }

    @Test
    public void checkPatchLocationForProd() {
        assertEquals(service.getPatchLocationForProd(token).getRawAddress(), "mm1",
                "Location isn't update");
    }

    @Test
    public void checkGetLocationForProd() {
        assertEquals(service.getGetLocationForProd(token).getCount(), 8,
                "Quantity of locations aren't correct");
    }
}