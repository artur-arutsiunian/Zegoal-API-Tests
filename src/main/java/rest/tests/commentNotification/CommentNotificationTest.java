package rest.tests.commentNotification;

import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.CommentNotificationService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommentNotificationTest extends BaseTest {

    CommentNotificationService service = new CommentNotificationService();

    @Test
    public void checkCreateCommentNotification(){
        assertEquals(service.getCreateCommentNotification(token).getComment(), 2,
                "Comment notification isn't created");
    }

    @Test
    public void checkGetCommentNotification(){
        assertEquals(service.getGetCommentNotification(token).getCount(), 1,
                "Quantity of CommentNotification aren't correct");
    }

    @Test
    public void checkCreateCommentNotificationForProd(){
        assertEquals(service.getCreateCommentNotificationForProd(tokenProd).getComment(), 1,
                "Comment notification isn't created");
    }

    @Test
    public void checkGetCommentNotificationForProd(){
        assertEquals(service.getGetCommentNotificationForProd(tokenProd).getCount(), 1,
                "Quantity of CommentNotification aren't correct");
    }
}
