package io.autotest.factory;

import com.codeborne.selenide.WebDriverRunner;
import io.autotest.utils.ConfigProperties;
import static io.autotest.utils.Context.getVariable;
import static io.autotest.utils.Context.putVariable;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

  private static final ConfigProperties CONFIG_PROPERTIES = ConfigProperties.getInstance();

  public static WebDriver getCurrentDriver() {
    return (WebDriver) getVariable("driver");
  }

  public WebDriver createDriver() {
    WebDriver driver;
    String driverName = CONFIG_PROPERTIES.getDriverName();
    switch (driverName) {
      case "chrome":
        driver = initChromeDriver();
        break;
      default:
        throw new IllegalStateException("Specification is not enough to choose driver");
    }
    return driver;
  }

  private WebDriver initChromeDriver() {
    ChromeDriverManager.getInstance().setup();
    System.setProperty("webdriver.chrome.driver", ChromeDriverManager.getInstance().getBinaryPath());
    ChromeDriver chromeDriver = new ChromeDriver();
    WebDriverRunner.setWebDriver(chromeDriver);
    putVariable("driver", WebDriverRunner.getWebDriver());
    return WebDriverRunner.getWebDriver();
  }
}
