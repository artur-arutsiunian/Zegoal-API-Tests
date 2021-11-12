package rest.tests.schedule;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.ScheduleService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScheduleTest extends BaseTest {

    private ScheduleService service = new ScheduleService();

    @Test
    public void checkCreateSchedule(){
        assertEquals(service.getCreateSchedule().getCount(), 2,
                "Schedule isn't created");
    }

    @Test
    public void checkPutSchedule(){
        assertEquals(service.getPutSchedule().getStartDatetime(), "2021-10-06T11:10:00",
                "Schedule isn't updated");
    }

    @Test
    public void checkGetSchedule(){
        assertEquals(service.getGetSchedule().getCount(), 6,
                "Quantity of schedule aren't correct");
    }

    @Order(1)
    @Test
    public void checkCreateScheduleForProd(){
        assertEquals(service.getCreateScheduleForProd().getCount(), 2,
                "Schedule isn't created");
    }

    @Order(2)
    @Test
    public void checkPutScheduleFprProd(){
        assertEquals(service.getPutScheduleForProd().getStartDatetime(), "2021-11-14T11:10:00",
                "Schedule isn't updated");
    }

    @Order(3)
    @Test
    public void checkGetScheduleForProd(){
        assertEquals(service.getGetScheduleForProd().getCount(), 3,
                "Quantity of schedule aren't correct");
    }
}
