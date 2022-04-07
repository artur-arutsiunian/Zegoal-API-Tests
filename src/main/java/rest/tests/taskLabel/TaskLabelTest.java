package rest.tests.taskLabel;

import org.junit.jupiter.api.*;
import rest.tests.BaseTest;
import service.impl.TaskLabelService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskLabelTest extends BaseTest {

    private TaskLabelService service;

    @BeforeAll
    void initService(){
        service = new TaskLabelService();
    }

    @Order(1)
    @Test
    public void checkCreateTaskLabel(){
        assertEquals(service.getCreateTaskLabel().getName(), "new5",
                "Task label isn't created");
    }

    @Order(2)
    @Test
    public void checkUpdateTaskLabel(){
        assertEquals(service.getUpdateTaskLabel().getName(), "mark1",
                "Task label isn't updated");
    }

    @Order(3)
    @Test
    public void checkReceiveListTaskLabel(){
        assertEquals(service.FetchTaskLabel().getCount(), 2,
                "List of task label isn't received");
    }

    @Order(4)
    @Test
    public void checkReceiveIdTaskLabel(){
        assertEquals(service.FetchIdTaskLabel().getName(), "mark1",
                "Task label pk doesn't received");
    }

    @Order(5)
    @Test
    public void checkDeleteTaskLabel(){
        assertEquals(service.DeleteTaskLabel(), 204,
                "Task label isn't deleted");
    }
}