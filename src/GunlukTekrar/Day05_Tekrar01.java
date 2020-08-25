package GunlukTekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Tekrar01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailKutusu= driver.findElement(By.xpath("//input[@type='email']"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement passwordKutusu= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordKutusu.sendKeys("Test1234!");

        WebElement signInButon= driver.findElement(By.xpath("//input[@type='submit']"));
        signInButon.click();

    }
}
