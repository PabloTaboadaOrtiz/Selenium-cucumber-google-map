package myproject.common;

// import myproject.common.BaseScenario;

import myproject.common.Utils;
import myproject.homepage.GoogleSearchScenario;
// import base.BaseScenario;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
// import 
// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.By;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.Dimension;
// import org.openqa.selenium.Point;

// import cucumber.api.java.en.When;
// import cucumber.api.java.en.Given;
// import cucumber.api.java.en.Then;

// import static org.junit.Assert.assertTrue;

public class CommonStepDef {

  // private myproject.common.BaseScenario BaseScenario;

  private GoogleSearchScenario googleSearchScenario = new GoogleSearchScenario();


  @When("I navigate to technical test URL")
  public void i_navigate_to_technical_test_URL() {
    WebDriver driver = Utils.getDriver();
    driver.get("http://localhost:3000");
  }

  @And("I see map instanciated")
  public void i_see_map_instanciated() {
    googleSearchScenario.mapIsVisible();
  }

  @When("I fill up search input")
  public void i_fill_up_search_input() {
    System.out.println("juannnnnnnnnn");
    googleSearchScenario.fillInputSearch();
  }

  @Then("I see 2 markers in map")
  public void i_see_2_markers_in_map() {
    googleSearchScenario.markersInMap();
  }
}