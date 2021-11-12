package rest.tests.workStatusLog;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.WorkStatusLogService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkStatusLogTest extends BaseTest {

    WorkStatusLogService service = new WorkStatusLogService();

    @Test
    public void checkCreateWorkStatusLog(){
        assertEquals(service.getCreateWorkStatusLog().getUser(), "22592b96-a934-42c4-8479-b3ca4425e20c",
                "Work isn't created");
    }

    @Test
    public void checkGetWorkStatusLog(){
        assertEquals(service.getGetWorkStatusLog().getCount(), 11,
                "Quantity of work logs aren't correct");
    }
}
