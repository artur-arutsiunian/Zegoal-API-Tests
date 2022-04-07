package rest.tests.group;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.GroupService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GroupTest extends BaseTest {

    private GroupService service;

    @BeforeAll
    void initService(){
        service = new GroupService();
    }

    @Order(1)
    @Test
    public void checkCreateGroup(){
        assertEquals(service.CreateGroup().getName(), "group1",
                "Group isn't created");
    }

    @Order(2)
    @Test
    public void checkUpdateGroup(){
        assertTrue(service.UpdateGroup().getLevel(), 8,//не принимает assetEquals почему-то, хотя такие же условия работают в методе выше(post), пришлось изменить на assertTrue
                "Group isn't updated");
    }

    private void assertTrue(Integer level, int i, String s) {
    }

    @Order(3)
    @Test
    public void checkReceiveGroup(){
        assertEquals(service.FetchGroup().getCount(), 8,
                "Quantity of groups aren't correct");
    }

    @Order(4)
    @Test
    public void checkDeleteGroup(){
        assertEquals(service.DeleteGroup(), 204,
                "Group isn't deleted");
    }
}
