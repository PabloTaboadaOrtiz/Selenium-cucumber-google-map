package myproject;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.Assert;


@RunWith(Cucumber.class)

// Default:
@CucumberOptions(plugin = {"pretty", "json:target/cucumber-report/Cucumber.json"})
//@Cucumber.Options(tags={"@now"},format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class MyProjectTest {

  // @AfterClass 
  // public static void tearDownClass() {
  //   // Close web driver
  //   BaseScenario.quitDriver();
  // }
}
