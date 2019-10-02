package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features={"C:\\Users\\aneyz\\projects\\TS\\src\\test\\resources\\features\\contato.feature"},
        glue={"stepsDefinitionsContato"},
        tags = {"@quintoTeste"})
public class RunnerContato {

}
