package tests.contact;

import org.junit.jupiter.api.*;
import tests.BaseTest;
import service.impl.ContactService;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ContactTest extends BaseTest {

    private ContactService service;

    @BeforeAll
    void initService(){
        service = new ContactService();
    }

    @Order(1)
    @Test
    public void checkCreateContact(){
        assertEquals(service.getCreateContact().getFullName(), "lala",
                "Contact name is incorrect");
    }

    @Order(2)
    @Test
    public void checkPatchContact(){
        assertEquals(service.getPatchContact().getEmail(), "any@mail.com",
                "Contact isn't updated");
    }

    @Order(3)
    @Test
    public void checkGetContact(){
        assertEquals(service.getGetContact().getCount(), 11,
                "Quantity of contacts aren't correct");
    }
}
