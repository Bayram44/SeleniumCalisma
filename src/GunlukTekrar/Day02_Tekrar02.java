package GunlukTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Tekrar02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");

        String otsikko= driver.getTitle();
        System.out.println(otsikko);

        String osoite= driver.getCurrentUrl();
        System.out.println(osoite);

         /*
        ---------------ÖDEV----------------

        driver.get("http://google.com");

        String otsikko= driver.getTitle();
        System.out.println("Otsikko on : "+otsikko);

        driver.navigate().to("http://youtube.com");
        String otsikkoYutube= driver.getTitle();
        System.out.println("Otsikko on : "+otsikkoYutube);
        String osoite= driver.getCurrentUrl();
        System.out.println("Osoite on : "+osoite);

        driver.navigate().back();
        String osoiteGoogle= driver.getCurrentUrl();
        System.out.println("Osoite on : "+osoiteGoogle);

        driver.quit();
        */
    }
}
