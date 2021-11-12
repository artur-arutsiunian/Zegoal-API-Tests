package rest.tests.epic;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.EpicService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EpicTest extends BaseTest {

    EpicService service = new EpicService();

    @Test
    public void checkCreateEpic(){
        assertEquals(service.getCreateEpic(token).getName(), "new epic2",
                "Epic isn't created");
    }

    @Test
    public void checkPatchEpic(){
        assertEquals(service.getPatchEpic(token).getPlannedStartAt(), "2021-10-16T00:00:00",
                "Epic isn't updated");
    }

    @Test
    public void checkGetEpic(){
        assertEquals(service.getGetEpic(token).getCount(), 4,
                "Quantity of epics aren't correct");
    }

    @Test
    public void checkCreateEpicForProd(){
        assertEquals(service.getCreateEpicForProd(tokenProd).getName(), "new epic3",
                "Epic isn't created");
    }

    @Test
    public void checkPatchEpicForProd(){
        assertEquals(service.getPatchEpicForProd(tokenProd).getPlannedStartAt(), "2021-11-12T00:00:00",
                "Epic isn't updated");
    }

    @Test
    public void checkGetEpicForProd(){
        assertEquals(service.getGetEpicForProd(tokenProd).getCount(), 6,
                "Quantity of epics aren't correct");
    }
}