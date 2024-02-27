package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue={"stepDefinition","java\\hooks"},
        features = "src/test/resurces/features",
        tags="@Run",
        plugin = {"pretty","html:target/HtmlReport.htm"})
public class TestRunner {
}
