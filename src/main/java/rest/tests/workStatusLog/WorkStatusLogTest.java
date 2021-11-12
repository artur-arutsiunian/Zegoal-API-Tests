package rest.tests.workStatusLog;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.WorkStatusLogService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkStatusLogTest extends BaseTest {

    WorkStatusLogService service = new WorkStatusLogService();

    @Test
    public void checkCreateWorkStatusLog(){
        assertEquals(service.getCreateWorkStatusLog(token).getUser(), "22592b96-a934-42c4-8479-b3ca4425e20c",
                "Work isn't created");
    }

    @Test
    public void checkGetWorkStatusLog(){
        assertEquals(service.getGetWorkStatusLog(token).getCount(), 11,
                "Quantity of work logs aren't correct");
    }

    @Test
    public void checkCreateWorkStatusLogForProd(){
        assertEquals(service.getCreateWorkStatusLogForProd(tokenProd).getUser(), "8f0690fd-5dd5-4789-9131-290a7caa2fb7",
                "Work isn't created");
    }

    @Test
    public void checkGetWorkStatusLogForProd(){
        assertEquals(service.getGetWorkStatusLogForProd(tokenProd).getCount(), 3,
                "Quantity of work logs aren't correct");
    }
}
