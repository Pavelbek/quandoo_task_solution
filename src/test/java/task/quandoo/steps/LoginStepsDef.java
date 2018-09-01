package task.quandoo.steps;

import cucumber.api.java8.En;
import task.quandoo.pages.LoginPage;
import task.quandoo.utils.WebDriverManager;

import static task.quandoo.pages.LoginPage.*;

public class LoginStepsDef implements En{
    private static LoginPage loginPage;

    static {loginPage = new LoginPage(WebDriverManager.getDriver());}

    public LoginStepsDef(){
        When("I login with (.*)", (String credentials) -> {
            setCredentials(credentials);
            clickLoginButton();
        });

        Then("I see (.*)", (String message) -> {
            validateMessage(message);
        });
    }
}
