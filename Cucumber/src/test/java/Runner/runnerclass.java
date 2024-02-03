package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/main/java/feature/login.feature",
		glue="stepdefination",
        dryRun=true)
public class runnerclass {

}
