package rest.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import rest.TestRunner;
import rest.objects.apikey.ApiKey;
import rest.objects.token.Auth;
import rest.objects.token.Token;
import service.impl.AuthService;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //тестовый инстанс на один класс(без изолированной среды для каждого тестового метода)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public abstract class BaseTest extends TestRunner {

    protected Auth auth;
    protected Token token;
    protected ApiKey apiKey;

    @BeforeEach
    void setUp() {
        this.auth = new AuthService().getAuth();
        this.token = auth.getToken();
        this.apiKey = auth.getApiKey();
    }
}