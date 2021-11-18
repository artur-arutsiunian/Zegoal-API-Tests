package rest.tests.commentNotification;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import rest.tests.BaseTest;
import service.impl.CommentNotificationService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommentNotificationTest extends BaseTest {

    private CommentNotificationService service;

    @BeforeAll
    void initService(){
        service = new CommentNotificationService();
    }

    @Test
    public void checkCreateCommentNotification(){
        assertEquals(service.getCreateCommentNotification().getComment(), 2,
                "Comment notification isn't created");
    }

    @Test
    public void checkGetCommentNotification(){
        assertEquals(service.getGetCommentNotification().getCount(), 1,
                "Quantity of CommentNotification aren't correct");
    }
}
