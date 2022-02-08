package Web;

import Helper.Misc;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UseDriver {

    static WebDriver driver;

    @Before
    public static void openUrl(String url) {
        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.hotels.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Misc.sleep(2);
    }


    public static WebDriver getDriver() {
        return driver;
    }


    @After
    public static void quitWebPages() {
        driver.quit();
    }



}
