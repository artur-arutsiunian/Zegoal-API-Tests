package rest.tests.workStatusLog;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.WorkStatusLogService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkStatusLogTest extends BaseTest {

    private WorkStatusLogService service;

    @BeforeAll
    void initService(){
        service = new WorkStatusLogService();
    }

    @Test
    public void checkCreateWorkStatusLog(){
        assertEquals(service.getCreateWorkStatusLog().getUser(), "8f0690fd-5dd5-4789-9131-290a7caa2fb7",
                "Work isn't created");
    }

    @Test
    public void checkGetWorkStatusLog(){
        assertEquals(service.getGetWorkStatusLog().getCount(), 4,
                "Quantity of work logs aren't correct");
    }
}
