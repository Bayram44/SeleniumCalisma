package GunlukTekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_Tekrar03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        WebElement homeTagName= driver.findElement(By.tagName("a"));
        String homeIsim= homeTagName.getText();
        System.out.println(homeIsim);
        // yada System.out.println(homeTagName.getText());

    }
}
