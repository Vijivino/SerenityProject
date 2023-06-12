package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "Features/LoginOrange.feature", glue = "stepdefinitions",monochrome=true,
                 plugin= {"pretty"})
                 //tags="@ValidCredentials")

public class SerenityRunner {
	
	

}
