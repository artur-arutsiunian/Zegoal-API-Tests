package rest.tests.schedule;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import service.BaseService;
import service.impl.ScheduleService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScheduleTest extends BaseService {

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

    @Order(1)
    @Test
    public void checkCreateScheduleForProd(){
        assertEquals(service.getCreateScheduleForProd(token).getCount(), 2,
                "Schedule isn't created");
    }

    @Order(2)
    @Test
    public void checkPutScheduleFprProd(){
        assertEquals(service.getPutScheduleForProd(token).getStartDatetime(), "2021-11-14T11:10:00",
                "Schedule isn't updated");
    }

    @Order(3)
    @Test
    public void checkGetScheduleForProd(){
        assertEquals(service.getGetScheduleForProd(token).getCount(), 3,
                "Quantity of schedule aren't correct");
    }
}
