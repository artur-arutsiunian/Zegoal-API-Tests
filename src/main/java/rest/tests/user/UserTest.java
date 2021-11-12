package rest.tests.user;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import rest.tests.BaseTest;
import service.impl.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserTest extends BaseTest {

    private UserService service = new UserService();

    @Test
    public void checkCreateUser(){
        assertEquals(service.getCreateUser().getEmail(), "created99@gm.com",
                "User email is incorrect");
    }

    @Test //сервер отдает null в ответе хотя по факту в админку кладет изменившееся значение
    public void checkPatchUser(){
        assertEquals(service.getPatchUser().getFirstName(), "User22",
                "User is not updated");
    }

    @Test
    public void checkGetUser(){
        assertEquals(service.getGetUser().getCount(), 14,
                "Quantity of users is incorrect");
    }
}