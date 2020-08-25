package GunlukTekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Tekrar03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailKutusu= driver.findElement(By.cssSelector(".form-control"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement sifreKutusu= driver.findElement(By.cssSelector("#session_password"));
        sifreKutusu.sendKeys("Test1234!");
        sifreKutusu.submit();
    }
}
