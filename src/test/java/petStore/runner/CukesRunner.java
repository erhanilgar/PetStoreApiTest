package petStore.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
                },
        features = "src/test/resources/features",
        glue = "petStore/stepDef",
        dryRun = false,
        tags = "@getPet"
)
public class CukesRunner {
}
