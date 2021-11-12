package rest.tests.task;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.TaskExternalService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskExternalTest extends BaseTest {

    TaskExternalService service = new TaskExternalService();

    @Test
    public void checkCreateExternalTask(){
        assertEquals(service.getCreateTaskExternal(auth).getTaskCount(), 7,
                "User id is incorrect");
    }

    @Test
    public void checkGetExternalTask(){
        assertEquals(service.getGetTaskExternal(auth).getCount(), 27,
                "Quantity of tasks are incorrect");
    }

    @Test
    public void checkCreateExternalTaskForProd(){
        assertEquals(service.getCreateTaskExternalForProd(authProd).getTaskCount(), 1,
                "User id is incorrect");
    }

    @Test
    public void checkGetExternalTaskForProd(){
        assertEquals(service.getGetTaskExternalForProd(authProd).getCount(), 7,
                "Quantity of tasks are incorrect");
    }
}
