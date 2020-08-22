package GunlukTekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_Tekrar01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://a.testaddressbook.com");
        WebElement signInLinki=driver.findElement(By.id("sign-in"));
        signInLinki.click();

        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement passwordKutusu = driver.findElement(By.id("session_password"));
        passwordKutusu.sendKeys("Test1234!");

        WebElement signInButon= driver.findElement(By.name("commit"));
        signInButon.click();

        String otsikko= driver.getTitle();

        if (otsikko.equals("Address Book")){
            System.out.println("Giris basarili");
        }else{
            System.out.println("Giris basarisiz");
        }

    }
}
