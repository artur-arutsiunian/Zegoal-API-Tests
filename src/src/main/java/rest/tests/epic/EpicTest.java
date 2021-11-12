package rest.tests.epic;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.EpicService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EpicTest extends BaseTest {

    EpicService service = new EpicService();

    @Test
    public void checkCreateEpic(){
        assertEquals(service.getCreateEpic().getName(), "new epic2",
                "Epic isn't created");
    }

    @Test
    public void checkPatchEpic(){
        assertEquals(service.getPatchEpic().getPlannedStartAt(), "2021-10-16T00:00:00",
                "Epic isn't updated");
    }

    @Test
    public void checkGetEpic(){
        assertEquals(service.getGetEpic().getCount(), 4,
                "Quantity of epics aren't correct");
    }

    @Test
    public void checkCreateEpicForProd(){
        assertEquals(service.getCreateEpicForProd().getName(), "new epic2",
                "Epic isn't created");
    }

    @Test
    public void checkPatchEpicForProd(){
        assertEquals(service.getPatchEpicForProd().getPlannedStartAt(), "2021-11-12T00:00:00",
                "Epic isn't updated");
    }

    @Test
    public void checkGetEpicForProd(){
        assertEquals(service.getGetEpicForProd().getCount(), 5,
                "Quantity of epics aren't correct");
    }
}