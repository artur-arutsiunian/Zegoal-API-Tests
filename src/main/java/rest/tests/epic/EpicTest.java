package rest.tests.epic;

import org.junit.jupiter.api.BeforeAll;
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

    @Test
    public void checkCreateEpic(){
        assertEquals(service.getCreateEpic().getName(), "new epic18",
                "Epic isn't created");
    }

    @Test
    public void checkPatchEpic(){
        assertEquals(service.getPatchEpic().getPlannedStartAt(), "2021-10-20T00:00:00",
                "Epic isn't updated");
    }

    @Test
    public void checkGetEpic(){
        assertEquals(service.getGetEpic().getCount(), 7,
                "Quantity of epics aren't correct");
    }
}