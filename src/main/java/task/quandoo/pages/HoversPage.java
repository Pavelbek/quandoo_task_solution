package task.quandoo.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class HoversPage extends BasePage {

    public HoversPage(WebDriver driver) {super(driver);}

    public static void hoverAvatarByNum(String avatar_num){
        $(By.xpath("(//img[@alt='User Avatar'])[" + avatar_num + "]")).hover();
    }

    public static void validateUsername(String username){
        switch (username){
            case "user1":
                Assert.assertTrue($(By.xpath("//h5[contains(text(), '" + username + "')]")).getText().contains(username));
                break;
            case "user2":
                Assert.assertTrue( $(By.xpath("//h5[contains(text(), '"+ username +"')]")).getText().contains(username));
                break;
            case "user3":
                Assert.assertTrue( $(By.xpath("//h5[contains(text(), '"+ username +"')]")).getText().contains(username));
                break;
        }
    }
}
