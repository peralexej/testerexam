package io.autotest.pages;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;


public class GoogleCalcPageContainer {
  @FindBy(id = "cwbt33")
  public SelenideElement btn1;
  @FindBy(id = "cwbt34")
  public SelenideElement btn2;
  @FindBy(id = "cwbt35")
  public SelenideElement btn3;
  @FindBy(id = "cwbt46")
  public SelenideElement plus;
  @FindBy(id = "cwfleb")
  public SelenideElement result;
  @FindBy(id = "cwbt45")
  public SelenideElement equal;

  public static SelenideElement getByNumber(int number) {
    return $(By.id("cwbt" + number));
  }
}
