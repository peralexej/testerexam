package io.autotest.runners;

import cucumber.api.CucumberOptions;


/**
 * The type Calculator runner.
 */
@CucumberOptions(
        features = "classpath:cucumber-feature/google-calc.feature",
        glue = "io.autotest.steps",
        plugin = "json:target/calc.json",
        format = {"pretty", "html:target/cucumber1"}
        )
public class CalculatorRunner {

}
