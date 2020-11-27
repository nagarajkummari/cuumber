package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/feature",
		glue="stepDefination")
public class TestRunner extends AbstractTestNGCucumberTests {
	
}