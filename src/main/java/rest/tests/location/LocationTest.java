package rest.tests.location;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import rest.tests.BaseTest;
import service.impl.LocationService;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LocationTest extends BaseTest {

    private LocationService service;

    @BeforeAll
    void initService(){
        service = new LocationService();
    }

    @Test
    public void checkCreateLocation() {
        assertEquals(service.getCreateLocation().getRawAddress(), "проспект улица 8",
                "Location raw address is incorrect");
    }

    @Test
    public void checkPatchLocation() {
        assertEquals(service.getPatchLocation().getRawAddress(), "ps8",
                "Location isn't update");
    }

    @Test
    public void checkGetLocation() {
        assertEquals(service.getGetLocation().getCount(), 18,
                "Quantity of locations aren't correct");
    }
}