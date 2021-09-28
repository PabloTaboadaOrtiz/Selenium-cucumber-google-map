package myproject.common;

import myproject.common.BasicPage;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.sql.SQLException;

public class Utils{

    private static WebDriver driver;


    @Before
    public static void initDriver() throws SQLException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    public static WebDriver getDriver() {
        return driver;
    }

    @After
    public static void closeBrowser() {
        driver.close();
    }
}