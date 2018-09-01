package task.quandoo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = {"src/test/resources/task/quandoo/"}, tags = {"@tables, @hovers, @login"})
public class TestsRunner {
}
