package rest.tests.task;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import rest.tests.BaseTest;
import service.impl.TaskService;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TaskTest extends BaseTest {

    private TaskService service = new TaskService();

    @Test
    public void checkCreateTask(){
        assertEquals(service.getCreateTask(token).getAssignedUser(), "faf8921b-ad1e-4232-9424-50108932fba1",
                "User id is incorrect");
    }

    @Test
    public void checkPatchTask() {
        assertEquals(service.getPatchTask(token).getAssignedUser(), "22592b96-a934-42c4-8479-b3ca4425e20c",
                "Task user is doesn't change");
    }

    @Test
    public void checkGetTask() {
        assertEquals(service.getGetTask(token).getCount(), 28,
                "Quantity of task is incorrect");
    }
}