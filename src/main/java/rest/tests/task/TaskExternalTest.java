package rest.tests.task;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.TaskExternalService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskExternalTest extends BaseTest {

    private TaskExternalService service;

    @BeforeAll
    void initService(){
        service = new TaskExternalService();
    }

    @Test
    public void checkCreateExternalTask(){
        assertEquals(service.getCreateTaskExternal().getTaskCount(), 1,
                "User id is incorrect");
    }

    @Test
    public void checkGetExternalTask(){
        assertEquals(service.getGetTaskExternal().getCount(), 9,
                "Quantity of tasks are incorrect");
    }
}
