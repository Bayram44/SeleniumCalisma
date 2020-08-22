package GunlukTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Tekrar01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        /*
        ---------------ÖDEV----------------

        driver.get("http:google.com");
        driver.navigate().to("http:youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();

         */
    }
}
