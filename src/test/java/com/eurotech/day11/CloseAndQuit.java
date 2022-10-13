package com.eurotech.day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        String title=driver.getTitle();
        driver=new ChromeDriver();

        driver.get("");
        driver.close();//çalıştığımız, üzerinde olduğumuz sayfayı çağırır
        // driver.quit(); bütün browserı kapatır

    }
}
