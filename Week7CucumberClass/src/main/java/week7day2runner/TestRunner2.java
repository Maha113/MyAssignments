package week7day2runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/week7day2features", 
                   glue = "week7day2stepdefinition", 
                   monochrome = true,
                   publish = true)
public class TestRunner2 extends AbstractTestNGCucumberTests{

}

