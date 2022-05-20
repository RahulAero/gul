package org.testrun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\cucumber.feature"}, glue= {"org.stepdef"})


public class MareeshTestRunner {
	
	
	
	

}
