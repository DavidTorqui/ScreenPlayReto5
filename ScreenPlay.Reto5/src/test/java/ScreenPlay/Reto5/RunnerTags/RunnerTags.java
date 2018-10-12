package ScreenPlay.Reto5.RunnerTags;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/Bancos.feature",
		tags= "@tag1",
		glue="ScreenPlay.Reto5.StepDefinitions",
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {
}

