package rest.tests.task;

import org.junit.jupiter.api.Test;
import service.BaseService;
import service.impl.TaskExternalService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskExternalTest extends BaseService {

    TaskExternalService service = new TaskExternalService();

    @Test
    public void checkCreateExternalTask(){
        assertEquals(service.getCreateTaskExternal(auth).getTaskCount(), 1,
                "User id is incorrect");
    }

    @Test
    public void checkGetExternalTask(){
        assertEquals(service.getGetTaskExternal(auth).getCount(), 27,
                "Quantity of tasks are incorrect");
    }
}
