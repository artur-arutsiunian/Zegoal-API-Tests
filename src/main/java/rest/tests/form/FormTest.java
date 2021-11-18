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

    private FormService service;

    @BeforeAll
    void initService(){
        service = new FormService();
    }

    private boolean isCheckCreateForm = false;
    private boolean isCheckPutForm = false;

    @BeforeEach
    public void BeforeEach() {
        System.out.println(this.hashCode());
    }

    @Order(1)
    @Test
    public void checkCreateForm() {
        assertEquals(service.getCreateForm().getName(), "form18",
                "Form isn't created");
        isCheckCreateForm = true;
    }

    @Order(2)
    @Test
    public void checkPutForm() {
        Assumptions.assumeTrue(isCheckCreateForm);
        assertEquals(service.getPutForm().getName(), "rrr",
                "Form isn't updated");
        isCheckPutForm = true;
    }

    @Order(3)
    @Test
    public void checkGetForm() {
        Assumptions.assumeTrue(isCheckPutForm);
        assertEquals(service.getGetForm().getCount(), 5,
                "Quantity of forms aren't correct");
    }
}