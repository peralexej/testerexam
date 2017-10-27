package io.autotest.steps;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import static io.autotest.factory.WebDriverFactory.getCurrentDriver;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;


public class Hooks {
  @Autowired
  private WebDriver driver = getCurrentDriver();

  @Before
  public void beforeScenario(Scenario scenario) {
    driver.manage().window().maximize();
  }
}
