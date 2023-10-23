package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		
		features="C:\\Users\\Vanak\\eclipse-workspace\\AmazonPhase2cucumber\\src\\test\\java\\amazonfeatureproject\\createaccount.feature",
		glue = {"stepsAmazon"},
				dryRun=false,
		plugin = { "html:target/Amazonreport.html",
				"pretty"  ,
				
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"	
				},	
				
				tags ="@all"
		
		
		
		
		)
	

public class Amazonrunner {

}
