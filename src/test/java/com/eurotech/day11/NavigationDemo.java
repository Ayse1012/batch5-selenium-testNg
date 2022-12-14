package com.eurotech.day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        //selenium facebook sayfasına git
        driver.navigate().to("https://www.facebook.com/");
         //geri gel
        driver.navigate().back();
        Thread.sleep(1000);
        //ileri git
        driver.navigate().forward();
        Thread.sleep(1000);
        //sayfayı yenile
        driver.navigate().refresh();
    }
}
