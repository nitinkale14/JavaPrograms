package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		    monochrome = true,
            features= "C:\\RESTAutomation1\\nitin-cuc\\src\\test\\resources\\featureResources",
            glue = "runner"
		)

public class TestRunner {

}
