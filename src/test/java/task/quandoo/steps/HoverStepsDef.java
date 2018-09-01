package task.quandoo.steps;

import cucumber.api.java8.En;
import task.quandoo.pages.HoversPage;
import task.quandoo.utils.WebDriverManager;

import static task.quandoo.pages.HoversPage.hoverAvatarByNum;
import static task.quandoo.pages.HoversPage.validateUsername;

public class HoverStepsDef implements En{
    private static HoversPage hoversPage;

    static { hoversPage = new HoversPage(WebDriverManager.getDriver());}

    public HoverStepsDef(){
        When("I hover (.+) avatar", (String avatar_num) -> {
            hoverAvatarByNum(avatar_num);
        });

        Then("I can see user (.+)", (String username) -> {
            validateUsername(username);
        });
    }
}
