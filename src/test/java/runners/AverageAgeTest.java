package runners;

import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/AverageAge/AverageAge.feature"
        , glue = "src/test/java/step_definitions",
        plugin = {"pretty", "html:test-output", "json:json_output/cucumber.json"},
        monochrome = true,
        strict = true,
        dryRun = false
)
public class AverageAgeTest {
    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/extent-config.xml"));
    }

}

