package task.quandoo.steps;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import task.quandoo.utils.WebDriverManager;

public class BaseStepDef {
    protected WebDriver driver;

    @Before
    public void setUp(){
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
    }

    @After
    public void tearDown(){
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
