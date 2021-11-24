package rest.tests.task;

import org.junit.jupiter.api.*;
import rest.tests.BaseTest;
import service.impl.TaskService;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TaskTest extends BaseTest {

    private TaskService service;

    @BeforeAll
    void initService(){
        service = new TaskService();}

    @Order(1)
    @Test
    public void checkCreateTask(){
        assertEquals(service.getCreateTask().getAssignedUser(), "8f0690fd-5dd5-4789-9131-290a7caa2fb7",
                "User id is incorrect");
    }

    @Order(2)
    @Test
    public void checkPatchTask() {
        assertEquals(service.getPatchTask().getAssignedUser(), "70903f42-10e1-4878-ab3b-c4bfc11a1ef4",
                "Task user is doesn't change");
    }

    @Order(3)
    @Test
    public void checkGetTask() {
        assertEquals(service.getGetTask().getCount(), 11,
                "Quantity of task is incorrect");
    }
}