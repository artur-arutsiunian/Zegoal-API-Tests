package rest.tests.contact;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.ContactExternalService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactExternalTest extends BaseTest {

    ContactExternalService service = new ContactExternalService();

    @Test
    public void checkPatchContactExternal(){ //тоже как и patch user есть проблема с репликой, если установить везде false - в админке меняет, а ответ приходит как будто не верный
        assertEquals(service.getPatchContactExternal(auth).get(0).getIsExist(), true,
                "Contact aren't updated");
    }

    @Test
    public void checkGetContactExternal(){
        assertEquals(service.getGetContactExternal(auth).getCount(), 5,
                "Quantity of contacts aren't correct");
    }

    @Test
    public void checkPatchContactExternalForProd(){ //тоже как и patch user есть проблема с репликой, если установить везде false - в админке меняет, а ответ приходит как будто не верный
        assertEquals(service.getPatchContactExternalForProd(auth).get(0).getIsExist(), true,
                "Contact aren't updated");
    }

    @Test
    public void checkGetContactExternalForProd(){
        assertEquals(service.getGetContactExternalForProd(auth).getCount(), 2,
                "Quantity of contacts aren't correct");
    }
}
