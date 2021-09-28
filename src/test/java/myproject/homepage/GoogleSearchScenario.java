package myproject.homepage;

import myproject.common.BasicPage;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class GoogleSearchScenario extends BasicPage {
  
  public GoogleSearchScenario() {
    super();
  }

  public void mapIsVisible() {
    shadow.findElement(".map").isDisplayed();
  }

  public void fillInputSearch() {
    WebElement input = shadow.findElement("[data-testid='input']");
    input.sendKeys("Paseo Castellana Madrid");
    input.sendKeys(Keys.ENTER);
  }

  public void markersInMap() {
    List<WebElement> markers = shadow.findElements("div[aria-label='Geolocation']");
    assertEquals(markers.size(), 2);
  }


}
