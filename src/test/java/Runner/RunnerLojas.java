package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features={"C:\\Users\\marilia.santos\\IdeaProjects\\TS\\src\\test\\resources\\features\\lojas.feature"},
        glue={"stepDefinitionsLojas"},
        tags = {"@automatizado"})
public class RunnerLojas {

}
