package automationpageutes.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/PageUtes.feature",
        tags = "@story",
        glue = "automationpageutes.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class FormRegistrationRunner {
}
