package rest.tests.form;

import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import rest.objects.asset.post.PostAsset;
import rest.objects.form.FormRequest;
import rest.objects.token.Token;
import service.BaseService;
import service.impl.FormService;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)


public class FormTest extends BaseService {

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
        assertEquals(service.getCreateForm(token).getName(), "loi9",
                "Form isn't created");
        isCheckCreateForm = true;
    }

    @Order(2)
    @Test
    public void checkPutForm() {
        Assumptions.assumeTrue(isCheckCreateForm);
        assertEquals(service.getPutForm(token).getName(), "qwer86",
                "Form isn't updated");
        isCheckPutForm = true;
    }

    @Order(3)
    @Test
    public void checkGetForm() {
        Assumptions.assumeTrue(isCheckPutForm);
        assertEquals(service.getGetForm(token).getCount(), 40,
                "Quantity of forms aren't correct");
    }

    @Test
    public void checkCreateFormForProd() {
        assertEquals(service.getCreateFormForProd(token).getName(), "loi9",
                "Form isn't created");
    }

    @Test
    public void checkPutFormForProd() {
        assertEquals(service.getPutFormForProd(token).getName(), "qwer86",
                "Form isn't updated");

    }

    @Test
    public void checkGetFormForProd() {
        assertEquals(service.getGetFormForProd(token).getCount(), 3,
                "Quantity of forms aren't correct");
    }
}