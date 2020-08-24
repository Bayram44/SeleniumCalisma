package GunlukTekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_Tekrar05 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com/");

        WebElement google= driver.findElement(By.name("q"));
        google.sendKeys("city bike");
        google.submit();

        WebElement sonuc= driver.findElement(By.id("result-stats"));
        System.out.println(sonuc.getText());

        WebElement alisveris= driver.findElement(By.partialLinkText("Ostokset"));
        alisveris.click();

    }
}
