package runner;

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Funcionalidades.feature",
        glue = "stepdefinitions",
        tags = "@AllTest",
        snippets = SnippetType.CAMELCASE
)
public class FuncionalidadesRunner {

}
