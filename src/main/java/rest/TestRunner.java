package rest;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import rest.tests.client.ClientTest;
import rest.tests.form.FormTest;

@RunWith(JUnitPlatform.class)
@SelectClasses({/*BaseTest.class,*/ ClientTest.class, /*LocationTest.class, TaskTest.class, TokenTest.class, UserTest.class, AssetTest.class, ContactTest.class,*/ FormTest.class /*ScheduleTest.class, CommentNotificationTest.class, CommentTest.class*/})
public class TestRunner {
}