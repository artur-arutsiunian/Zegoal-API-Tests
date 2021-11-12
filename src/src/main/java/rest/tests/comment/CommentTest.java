package rest.tests.comment;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.CommentService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommentTest extends BaseTest {

    CommentService service = new CommentService();

    @Test
    public void checkCreateComment(){
        assertEquals(service.getCreateComment().getText(), "ppll",
                "Comment isn't created");
    }

    @Test
    public void checkGetComment(){
        assertEquals(service.getGetComment().getCount(), 2,
                "Quantity of comments aren't correct");
    }

    @Test
    public void checkCreateCommentForProd(){
        assertEquals(service.getCreateCommentForProd().getText(), "ppll",
                "Comment isn't created");
    }

    @Test
    public void checkGetCommentForProd(){
        assertEquals(service.getGetCommentForProd().getCount(), 2,
                "Quantity of comments aren't correct");
    }
}
