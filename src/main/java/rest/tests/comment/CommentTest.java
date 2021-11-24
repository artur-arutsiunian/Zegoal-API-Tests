package rest.tests.comment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.CommentService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommentTest extends BaseTest {

    private CommentService service;

    @BeforeAll
    void initService(){
        service = new CommentService();
    }

    @Order(1)
    @Test
    public void checkCreateComment(){
        assertEquals(service.getCreateComment().getText(), "some text2",
                "Comment isn't created");
    }

    @Order(2)
    @Test
    public void checkGetComment(){
        assertEquals(service.getGetComment().getCount(), 6,
                "Quantity of comments aren't correct");
    }
}
