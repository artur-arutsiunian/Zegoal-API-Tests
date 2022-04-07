package rest.tests.remark;

import org.junit.jupiter.api.*;
import rest.tests.BaseTest;
import service.impl.RemarkService;
import service.impl.TaskService;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RemarkTest extends BaseTest {

    private RemarkService service;

    @BeforeAll
    void initService() {
        service = new RemarkService();
    }

    @Order(1)
    @Test
    public void checkCreateRemark() {
        assertEquals(service.CreateRemark().getName(), "remark",
                "Remark isn't created");
    }

    @Order(2)
    @Test
    public void checkPatchRemark() {
        assertEquals(service.UpdateRemark().getName(), "777",
                "Remark isn't updated");
    }

    @Order(3)
    @Test
    public void checkReceiveRemark() {
        assertEquals(service.getGetRemark().getName(), "777",
                "Remark isn't received");
    }

    @Order(4)
    @Test
    public void checkDeleteRemark() {
        assertEquals(service.DeleteRemark(), 204,
                "Remark isn't deleted");
    }
}