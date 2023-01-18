package orange.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
            features = "C:\\Selenium_Workspace\\BDD_POM_OrangeHRMF\\src\\main\\java\\orange\\features\\orangelogin.feature",
            glue = "orange.stepDefinations",
            plugin = "pretty",
            monochrome = true,
            dryRun = false
        )

public class OrangeRunner 
{
	
}
