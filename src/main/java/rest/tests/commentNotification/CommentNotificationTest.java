package rest.tests.commentNotification;

import org.junit.jupiter.api.Test;
import service.BaseService;
import service.impl.CommentNotificationService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommentNotificationTest extends BaseService {

    CommentNotificationService service = new CommentNotificationService();

    @Test
    public void checkCreateCommentNotification(){
        assertEquals(service.getCreateCommentNotification(token).getComment(), 2,
                "Comment notification isn't created");
    }

    @Test
    public void checkGetCommentNotification(){
        assertEquals(service.getGetCommentNotification(token).getCount(), 2,
                "Quantity of CommentNotification aren't correct");
    }

    @Test
    public void checkCreateCommentNotificationForProd(){
        assertEquals(service.getCreateCommentNotificationForProd(token).getComment(), 1,
                "Comment notification isn't created");
    }

    @Test
    public void checkGetCommentNotificationForProd(){
        assertEquals(service.getGetCommentNotificationForProd(token).getCount(), 1,
                "Quantity of CommentNotification aren't correct");
    }
}
