package rozklad_pkp.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"
        },
        features ="src/test/resources/features",
        glue="rozklad_pkp/step_definitions",

        tags="@wip",
        dryRun = false
)
public class CukesRunner {
}
