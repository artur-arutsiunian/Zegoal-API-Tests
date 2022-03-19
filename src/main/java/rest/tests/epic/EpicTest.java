package rest.tests.epic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.EpicService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EpicTest extends BaseTest {

    private EpicService service;

    @BeforeAll
    void initService(){
        service = new EpicService();
    }

    @Order(1)
    @Test
    public void checkCreateEpic(){
        assertEquals(service.getCreateEpic().getName(), "any epic",
                "Epic isn't created");
        System.out.println("");
    }

    @Order(2)
    @Test
    public void checkPatchEpic(){
        assertEquals(service.getPatchEpic().getPlannedStartAt(), "2021-10-31T00:00:00",
                "Epic isn't updated");
    }

    @Order(3)
    @Test
    public void checkGetEpic(){
        assertEquals(service.getGetEpic().getCount(), 12,
                "Quantity of epics aren't correct");
    }
}