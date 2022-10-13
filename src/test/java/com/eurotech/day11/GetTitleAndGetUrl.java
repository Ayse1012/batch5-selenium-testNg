package com.eurotech.day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndGetUrl {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        String title=driver.getTitle();
        //alt+enter tuşuna basarak otomatik string variablea atama yapar
        String title1 = driver.getTitle();
        Thread.sleep(2000);
        System.out.println(title);
        driver.close();
        //URL getCurrentUrl ile alırız
        String currentUrl = driver.getCurrentUrl();
        // getPageSource methodu bütün sayfanın html yapısını getirir
        String pageSource = driver.getPageSource();

        driver=new ChromeDriver();

        driver.get("");
        driver.close();//çalıştığımız, üzerinde olduğumuz sayfayı çağırır
       // driver.quit(); bütün browserı kapatır


    }
}
