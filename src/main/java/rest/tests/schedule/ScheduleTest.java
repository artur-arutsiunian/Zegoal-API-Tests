package rest.tests.schedule;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.ScheduleService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScheduleTest extends BaseTest {

    private ScheduleService service = new ScheduleService();

    @Test
    public void checkCreateSchedule(){
        assertEquals(service.getCreateSchedule(token).getCount(), 2,
                "Schedule isn't created");
    }

    @Test
    public void checkPutSchedule(){
        assertEquals(service.getPutSchedule(token).getStartDatetime(), "2021-10-06T11:10:00",
                "Schedule isn't updated");
    }

    @Test
    public void checkGetSchedule(){
        assertEquals(service.getGetSchedule(token).getCount(), 6,
                "Quantity of schedule aren't correct");
    }


}
