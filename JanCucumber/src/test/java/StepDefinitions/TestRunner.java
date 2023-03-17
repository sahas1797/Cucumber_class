package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sahas\\Desktop\\Sahas\\JanCucumber\\src\\test\\java\\FeatureFile\\Background.feature",
    glue={"StepDefinitions"},
        tags = "@SmokeTest"
)



public class TestRunner {
}
