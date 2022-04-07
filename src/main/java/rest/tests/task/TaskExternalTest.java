package rest.tests.task;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
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

    @Order(1)
    @Test
    public void checkCreateExternalTask(){
        assertEquals(service.getCreateTaskExternal().getTaskCount(), 1,
                "User id is incorrect");
    }

    @Order(2)
    @Test
    public void checkGetExternalTask(){
        assertEquals(service.getGetTaskExternal().getCount(), 20,
                "Quantity of tasks are incorrect");
    }
}
