package rest.tests.schedule;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.ScheduleService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScheduleTest extends BaseTest {

    private ScheduleService service;

    @BeforeAll
    void initService(){
        service = new ScheduleService();
    }

    @Test
    public void checkCreateSchedule(){
        assertEquals(service.getCreateSchedule().getCount(), 2,
                "Schedule isn't created");
    }

    @Test
    public void checkPutSchedule(){
        assertEquals(service.getPutSchedule().getStartDatetime(), "2021-11-17T11:10:00",
                "Schedule isn't updated");
    }

    @Test
    public void checkGetSchedule(){
        assertEquals(service.getGetSchedule().getCount(), 7,
                "Quantity of schedule aren't correct");
    }
}
