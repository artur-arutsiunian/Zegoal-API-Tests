package tests.user;

import org.junit.jupiter.api.*;
import tests.BaseTest;
import service.impl.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserTest extends BaseTest {

    private UserService service;

    @BeforeAll
    void initService(){
        service = new UserService();
    }

    @Order(1)
    @Test
    public void checkCreateUser(){
        assertEquals(service.getCreateUser().getEmail(), "new@gm.com",
                "User email is incorrect");
    }

    @Order(2)
    @Test //сервер отдает null в ответе хотя по факту в админку кладет изменившееся значение
    public void checkPatchUser(){
        assertEquals(service.getPatchUser().getFirstName(), "just",
                "User is not updated");
    }

    @Order(3)
    @Test
    public void checkGetUser(){
        assertEquals(service.getGetUser().getCount(), 7,
                "Quantity of users is incorrect");
    }
}