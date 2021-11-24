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

    @Order(1)
    @Test
    public void checkCreateSchedule(){
        assertEquals(service.getCreateSchedule().getCount(), 2,
                "Schedule isn't created");
    }

    @Order(2)
    @Test
    public void checkPutSchedule(){
        assertEquals(service.getPutSchedule().getStartDatetime(), "2021-11-04T11:10:00",
                "Schedule isn't updated");
    }

    @Order(3)
    @Test
    public void checkGetSchedule(){
        assertEquals(service.getGetSchedule().getCount(), 11,
                "Quantity of schedule aren't correct");
    }
}
