package org.testleaf.leaftaps.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/org/testleaf/leaftaps/features", 
                   glue = "org/testleaf/leaftaps/stepdefinition"      )
public class TestRunner extends AbstractTestNGCucumberTests{

}
