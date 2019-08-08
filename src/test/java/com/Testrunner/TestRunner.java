package com.Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"Feature"},
		glue = {"com.StepDef"},
		tags = {"@Hardware"}
		)
	
public class TestRunner extends AbstractTestNGCucumberTests {
	
}