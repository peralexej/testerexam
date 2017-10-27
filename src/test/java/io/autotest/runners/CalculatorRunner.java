package io.autotest.runners;

import cucumber.api.CucumberOptions;


@CucumberOptions(
        features = "classpath:cucumber-feature/google-calc.feature",
        glue = "io.autotest.steps",
        plugin = "json:target/calc.json")
public class CalculatorRunner {

}
