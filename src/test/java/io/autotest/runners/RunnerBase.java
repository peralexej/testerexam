package io.autotest.runners;

import cucumber.api.junit.Cucumber;
import io.autotest.factory.WebDriverFactory;
import static io.autotest.factory.WebDriverFactory.getCurrentDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.notification.RunNotifier;

/**
 * The type Runner base.
 */
public class RunnerBase {

  /**
   * Test.
   *
   * @throws Throwable the throwable
   */
  @Test
  public void test() throws Throwable {
    Cucumber cucumber = new Cucumber(CalculatorRunner.class);
    cucumber.run(new CustomRunNotifier());
  }

  /**
   * Sets up.
   *
   * @throws Exception the exception
   */
  @Before
  public void setUp() throws Exception {
    WebDriverFactory factory = new WebDriverFactory();
    factory.createDriver();
  }

  /**
   * Tear down.
   *
   * @throws Exception the exception
   */
  @After
  public void tearDown() throws Exception {
    getCurrentDriver().close();
  }

  private class CustomRunNotifier extends RunNotifier {
  }
}
