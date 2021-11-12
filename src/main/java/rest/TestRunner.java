package rest;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import rest.tests.BaseTest;
import rest.tests.asset.AssetTest;
import rest.tests.client.ClientTest;
import rest.tests.comment.CommentTest;
import rest.tests.commentNotification.CommentNotificationTest;
import rest.tests.contact.ContactTest;
import rest.tests.form.FormTest;
import rest.tests.location.LocationTest;
import rest.tests.schedule.ScheduleTest;
import rest.tests.task.TaskTest;
import rest.tests.token.TokenTest;
import rest.tests.user.UserTest;

@RunWith(JUnitPlatform.class)
//@SelectClasses({/*BaseTest.class,*/ ClientTest.class, /*LocationTest.class, TaskTest.class, TokenTest.class, UserTest.class, AssetTest.class, ContactTest.class,*/ FormTest.class /*ScheduleTest.class, CommentNotificationTest.class, CommentTest.class*/})
public class TestRunner {
}