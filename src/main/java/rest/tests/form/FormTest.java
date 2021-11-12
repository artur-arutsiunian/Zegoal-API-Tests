package rest.tests.form;

import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import rest.objects.asset.post.PostAsset;
import rest.objects.form.FormRequest;
import rest.objects.token.Token;
import rest.tests.BaseTest;
import service.impl.FormService;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)


public class FormTest extends BaseTest {

    private FormService service = new FormService();
    private boolean isCheckCreateForm = false;
    private boolean isCheckPutForm = false;

    @BeforeEach
    public void BeforeEach() {
        System.out.println(this.hashCode());
    }

    @Order(1)
    @Test
    public void checkCreateForm() {
        assertEquals(service.getCreateForm().getName(), "loi9",
                "Form isn't created");
        isCheckCreateForm = true;
    }

    @Order(2)
    @Test
    public void checkPutForm() {
        Assumptions.assumeTrue(isCheckCreateForm);
        assertEquals(service.getPutForm().getName(), "qwer86",
                "Form isn't updated");
        isCheckPutForm = true;
    }

    @Order(3)
    @Test
    public void checkGetForm() {
        Assumptions.assumeTrue(isCheckPutForm);
        assertEquals(service.getGetForm().getCount(), 40,
                "Quantity of forms aren't correct");
    }

    @Test
    public void checkCreateFormForProd() {
        assertEquals(service.getCreateFormForProd().getName(), "loi9",
                "Form isn't created");
    }

    @Test
    public void checkPutFormForProd() {
        assertEquals(service.getPutFormForProd().getName(), "qwer86",
                "Form isn't updated");

    }

    @Test
    public void checkGetFormForProd() {
        assertEquals(service.getGetFormForProd().getCount(), 3,
                "Quantity of forms aren't correct");
    }
}