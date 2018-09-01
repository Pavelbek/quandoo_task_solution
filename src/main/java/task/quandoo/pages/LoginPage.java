package task.quandoo.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import task.quandoo.utils.PropertyReader;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage{
    /* PAGE LOCATORS */
    private static final By usernameField = By.cssSelector("#username");
    private static final By passwordField = By.cssSelector("#password");
    private static final By loginBtn = By.cssSelector("button.radius");
    private static final By messageText = By.cssSelector("#flash");
    /* END OF LOCATORS SECTION */

    /* We need to get some properties for the tests. All properties are kept in the config.properties file. */
    private static final String correctUsername = PropertyReader.getProperty("correct.username");
    private static final String correctPassword = PropertyReader.getProperty("correct.password");
    private static final String incorrectPassword = PropertyReader.getProperty("incorrect.password");
    private static final String incorrectUsername = PropertyReader.getProperty("incorrect.username");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static void setCredentials(String credentials){
        switch (credentials){
            case "correct.credentials":
                $(usernameField).setValue(correctUsername);
                $(passwordField).setValue(correctPassword);
                break;
            case "incorrect.password":
                $(usernameField).setValue(correctUsername);
                $(passwordField).setValue(incorrectPassword);
                break;
            case "incorrect.username":
                $(usernameField).setValue(incorrectUsername);
                $(passwordField).setValue(correctPassword);
                break;
        }
    }

    public static void clickLoginButton(){
        $(loginBtn).click();
    }

    public static void validateMessage(String message){
        String actualMessage = $(messageText).getText();
        Assert.assertTrue(actualMessage.contains(PropertyReader.getProperty(message)));
    }
}
