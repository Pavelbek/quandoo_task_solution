package task.quandoo.steps;

import cucumber.api.java8.En;
import task.quandoo.utils.PropertyReader;

import static com.codeborne.selenide.Selenide.open;

public class CommonStepsDef implements En {
    private static final String login = "/login";
    private static final String hovers = "/hovers";
    private static final String tables = "/tables";
    public static final String BASE_URL = "baseUrl";

    //TODO create enum for pages
    public CommonStepsDef(){
        Given("I am on (.*) page", (String page) -> {
            switch (page){
                case "Login":
                    open(PropertyReader.getProperty(BASE_URL) + login);
                    break;
                case "Tables":
                    open(PropertyReader.getProperty(BASE_URL) + tables);
                    break;
                case "Hovers":
                    open(PropertyReader.getProperty(BASE_URL) + hovers);
                    break;
            }
        });
    }
}
