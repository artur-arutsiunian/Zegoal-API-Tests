package rest.tests.location;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import rest.tests.BaseTest;
import service.impl.LocationService;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LocationTest extends BaseTest {

    private LocationService service = new LocationService();

    @Test
    public void checkCreateLocation() {
        assertEquals(service.getCreateLocation().getRawAddress(), "проспект Дзержинского, 73А",
                "Location raw address is incorrect");
    }

    @Test
    public void checkPatchLocation() {
        assertEquals(service.getPatchLocation().getRawAddress(), "mm1",
                "Location isn't update");
    }

    @Test
    public void checkGetLocation() {
        assertEquals(service.getGetLocation().getCount(), 33,
                "Quantity of locations aren't correct");
    }

    @Test
    public void checkCreateLocationForProd() {
        assertEquals(service.getCreateLocationForProd().getRawAddress(), "проспект Дзержинского, 73А",
                "Location raw address is incorrect");
    }

    @Test
    public void checkPatchLocationForProd() {
        assertEquals(service.getPatchLocationForProd().getRawAddress(), "mm1",
                "Location isn't update");
    }

    @Test
    public void checkGetLocationForProd() {
        assertEquals(service.getGetLocationForProd().getCount(), 8,
                "Quantity of locations aren't correct");
    }
}