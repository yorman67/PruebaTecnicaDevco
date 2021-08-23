package runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/vuelos.feature",
        glue = {"stepdefinitions"},
        strict = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE)

@RunWith(CucumberWithSerenity.class)
public class BusquedaVueloRunner {
}
