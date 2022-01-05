package rest.tests.user;

import org.junit.jupiter.api.*;
import rest.tests.BaseTest;
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
        assertEquals(service.getCreateUser().getEmail(), "someUser@gm.com",
                "User email is incorrect");
    }

    @Order(2)
    @Test //сервер отдает null в ответе хотя по факту в админку кладет изменившееся значение
    public void checkPatchUser(){
        assertEquals(service.getPatchUser().getFirstName(), "lpp1",
                "User is not updated");
    }

    @Order(3)
    @Test
    public void checkGetUser(){
        assertEquals(service.getGetUser().getCount(), 6,
                "Quantity of users is incorrect");
    }
}