package GunlukTekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Tekrar01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://facebook.com");
        WebElement emailKutusu= driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

        WebElement passBox= driver.findElement(By.id("pass"));
        passBox.sendKeys("Test1234!");

        WebElement loginButon= driver.findElement(By.id("u_0_d"));
        loginButon.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //https://www.facebook.com/login/

        String url= driver.getCurrentUrl();

        if(url.contains("facebook.com/login/")){
            System.out.println("Giris basarisiz");
        }else{
            System.out.println("Giris basarili");
        }
        driver.quit();
    }
}
