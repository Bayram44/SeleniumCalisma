package GunlukTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Tekrar03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");
        String otsikko= driver.getTitle();

        if(otsikko.contains("car")){
            System.out.println(otsikko +" : Otsikkossa on sana auto");
        }else{
            System.out.println(otsikko+" : Otsikossa ei ole sana autoa");
        }
        driver.quit();

        /*
         ---------------ÖDEV----------------

        driver.get("http://youtube.com");

        String otsikko= driver.getTitle();

        if(otsikko.contains("video")){
            System.out.println(otsikko+" : Otsikkossa on sana video");
        }else{
            System.out.println(otsikko+" : Otsikkossa ei ole sana video");
        }
        driver.quit();
        */
    }
}
