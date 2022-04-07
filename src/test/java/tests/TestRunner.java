package tests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import tests.client.ClientTest;

@RunWith(JUnitPlatform.class)
@SelectClasses({/*BaseTest.class,*/ /*ClientTest.class*/ /*LocationTest.class, TaskTest.class, TokenTest.class, UserTest.class, AssetTest.class, ContactTest.class,*/ /*FormTest.class*/, /*ScheduleTest.class, CommentNotificationTest.class, CommentTest.class*/})
public class TestRunner {
}