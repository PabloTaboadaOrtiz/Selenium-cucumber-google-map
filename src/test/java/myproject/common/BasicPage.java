package myproject.common;

import myproject.common.Utils;
import io.github.sukgu.Shadow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.By;




public class BasicPage {

  protected WebDriver driver;
  protected Shadow shadow;

  public BasicPage() {
    this.driver = Utils.getDriver();

    shadow= new Shadow(driver);
  }
}
