package rest.tests.contact;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.ContactExternalService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactExternalTest extends BaseTest {

    private ContactExternalService service;

    @BeforeAll
    void initService(){
        service = new ContactExternalService();
    }

    @Test
    public void checkPatchContactExternal(){ //тоже как и patch user есть проблема с репликой, если установить везде false - в админке меняет, а ответ приходит как будто не верный
        assertEquals(service.getPatchContactExternal().get(0).getIsExist(), true,
                "Contact aren't updated");
    }

    @Test
    public void checkGetContactExternal(){
        assertEquals(service.getGetContactExternal().getCount(), 9,
                "Quantity of contacts aren't correct");
    }
}
