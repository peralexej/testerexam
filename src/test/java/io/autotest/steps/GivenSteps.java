package io.autotest.steps;

import static com.codeborne.selenide.Selenide.page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static io.autotest.factory.WebDriverFactory.getCurrentDriver;
import io.autotest.pages.GoogleCalcPageContainer;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;


/**
 * The type Given steps.
 */
public class GivenSteps {
  private Logger LOGGER = Logger.getAnonymousLogger();
  private GoogleCalcPageContainer container;
  private String result;

  /**
   * Instantiates a new Given steps.
   */
  public GivenSteps() {
    container = page(GoogleCalcPageContainer.class);
  }

  /**
   * Open page.
   *
   * @param url the url
   * @throws Throwable the throwable
   */
  @Given("^Open \"([^\"]*)\" page$")
  public void openPage(final String url) throws Throwable {
    LOGGER.info("Open - " + url + " page");
    getCurrentDriver().get(url);
  }


  /**
   * Number plus.
   *
   * @param value1 the value 1
   * @param value2 the value 2
   * @throws Throwable the throwable
   */
  @When("^Number (\\d+) plus (\\d+)$")
  public void numberPlus(int value1, int value2) throws Throwable {
    container.btn1.click();
    container.plus.click();
    container.btn2.click();
    container.equal.click();
    result = container.result.getText();
  }


  /**
   * Result equal to.
   *
   * @param expectedValue the expected value
   * @throws Throwable the throwable
   */
  @Then("^Result equal to \"([^\"]*)\"$")
  public void resultEqualTo(String expectedValue) throws Throwable {
    assertTrue(result.equalsIgnoreCase(expectedValue));
  }
}
