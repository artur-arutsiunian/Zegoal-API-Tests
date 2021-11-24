package rest.tests.form;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import rest.tests.BaseTest;
import service.impl.FormService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Execution(ExecutionMode.CONCURRENT)
public class FormTest extends BaseTest {

    private FormService service;

    private boolean isCheckCreateForm;
    private boolean isCheckPutForm;

    @BeforeAll
    void initService(){
        service = new FormService();
    }


    @BeforeEach
    public void BeforeEach() {
        System.out.println(this.hashCode());
    }

    @Order(1)
    @Test
    public void checkCreateForm() {
        assertEquals(service.getCreateForm().getName(), "formWed02",
                "Form isn't created");
        isCheckCreateForm = true;
    }

    @Order(2)
    @Test
    public void checkPutForm() {
//        assumeTrue(isCheckCreateForm);
        assertEquals(service.getPutForm().getName(), "ttt",
                "Form isn't updated");
        isCheckPutForm = true;
    }

    @Order(3)
    @Test
    public void checkGetForm() {
//        assumeTrue(isCheckPutForm);
        assertEquals(service.getGetForm().getCount(), 28,
                "Quantity of forms aren't correct");
    }
}