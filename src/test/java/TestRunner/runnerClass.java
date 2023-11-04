package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resources/mouseFeatures"},
plugin = {"json:target/cucumber"},
glue = "StepDefinition")//tags = {""})

public class runnerClass extends AbstractTestNGCucumberTests {

}
