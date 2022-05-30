package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\yadav\\eclipse-workspace\\LoginCucumber\\src\\main\\java\\Features\\LoginFeature.feature", //the path of the feature files
			glue={"StepDefinations"}, //the path of the step definition files
			monochrome = true, //display the console output in a proper readable format
			//strict = true, //it will check if any step is not defined in step definition file
			dryRun = false //to check the mapping is proper between feature file and step def file
					
			)
	 
	public class TestRunner {
	 
	}

