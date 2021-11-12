package rest.tests.comment;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.CommentService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommentTest extends BaseTest {

    CommentService service = new CommentService();

    @Test
    public void checkCreateComment(){
        assertEquals(service.getCreateComment(token).getText(), "ppll",
                "Comment isn't created");
    }

    @Test
    public void checkGetComment(){
        assertEquals(service.getGetComment(token).getCount(), 2,
                "Quantity of comments aren't correct");
    }

    @Test
    public void checkCreateCommentForProd(){
        assertEquals(service.getCreateCommentForProd(token).getText(), "ppll",
                "Comment isn't created");
    }

    @Test
    public void checkGetCommentForProd(){
        assertEquals(service.getGetCommentForProd(token).getCount(), 2,
                "Quantity of comments aren't correct");
    }
}
