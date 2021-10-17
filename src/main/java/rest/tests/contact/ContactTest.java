package rest.tests.contact;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import rest.tests.BaseTest;
import service.impl.ContactService;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ContactTest extends BaseTest {

    private ContactService service = new ContactService();

    @Test
    public void checkCreateContact(){
        assertEquals(service.getCreateContact(token).getFullName(), "BRAD7",
                "Contact name is incorrect");
    }

    @Test
    public void checkPatchContact(){
        assertEquals(service.getPatchContact(token).getEmail(), "br9@mail.com",
                "Contact isn't updated");
    }

    @Test
    public void checkGetContact(){
        assertEquals(service.getGetContact(token).getCount(), 4,
                "Quantity of contacts aren't correct");
    }
}
