package org.testRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\niti.feature"},glue={"org.stepdef"}, plugin= {"pretty","html:C:\\Users\\ragul\\eclipse-workspace\\MmavenCucumber\\target\\"}, monochrome=true)
public class Runner {
	
	
	
	

}
