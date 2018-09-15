package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


    @RunWith(Cucumber.class)
    @CucumberOptions(
	features="E:\\Eclipse\\cucutest\\src\\main\\java\\Features\\indexpage.feature",
	glue= {"stepdefinition"}
	
	
		
		)


public class TestRunner {

	
	
}
