package rest.tests.contact;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import rest.tests.BaseTest;
import service.impl.ContactService;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ContactTest extends BaseTest {

    private ContactService service;

    @BeforeAll
    void initService(){
        service = new ContactService();
    }

    @Test
    public void checkCreateContact(){
        assertEquals(service.getCreateContact().getFullName(), "hi contact",
                "Contact name is incorrect");
    }

    @Test
    public void checkPatchContact(){
        assertEquals(service.getPatchContact().getEmail(), "br18@mail.com",
                "Contact isn't updated");
    }

    @Test
    public void checkGetContact(){
        assertEquals(service.getGetContact().getCount(), 6,
                "Quantity of contacts aren't correct");
    }
}
