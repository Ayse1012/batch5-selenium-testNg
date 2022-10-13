package com.eurotech.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class openBrowser {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromiumdriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.close();
    }
}
