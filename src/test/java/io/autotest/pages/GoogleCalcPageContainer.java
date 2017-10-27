package io.autotest.pages;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;


/**
 * The type Google calc page container.
 */
public class GoogleCalcPageContainer {
  /**
   * The Btn 1.
   */
  @FindBy(id = "cwbt33")
  public SelenideElement btn1;
  /**
   * The Btn 2.
   */
  @FindBy(id = "cwbt34")
  public SelenideElement btn2;
  /**
   * The Btn 3.
   */
  @FindBy(id = "cwbt35")
  public SelenideElement btn3;
  /**
   * The Plus.
   */
  @FindBy(id = "cwbt46")
  public SelenideElement plus;
  /**
   * The Result.
   */
  @FindBy(id = "cwfleb")
  public SelenideElement result;
  /**
   * The Equal.
   */
  @FindBy(id = "cwbt45")
  public SelenideElement equal;

  /**
   * Gets by number.
   *
   * @param number the number
   * @return the by number
   */
  public static SelenideElement getByNumber(int number) {
    return $(By.id("cwbt" + number));
  }
}
