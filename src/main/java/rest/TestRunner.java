package rest;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import rest.APITest;

@RunWith(JUnitPlatform.class)
@SelectClasses(APITest.class)
public class TestRunner {
}