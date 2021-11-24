package rest.tests.location;

import org.junit.jupiter.api.*;
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

    @Order(1)
    @Test
    public void checkCreateLocation() {
        assertEquals(service.getCreateLocation().getRawAddress(), "проспект улица 10",
                "Location raw address is incorrect");
    }

    @Order(2)
    @Test
    public void checkPatchLocation() {
        assertEquals(service.getPatchLocation().getRawAddress(), "ps9",
                "Location isn't update");
    }

    @Order(3)
    @Test
    public void checkGetLocation() {
        assertEquals(service.getGetLocation().getCount(), 26,
                "Quantity of locations aren't correct");
    }
}