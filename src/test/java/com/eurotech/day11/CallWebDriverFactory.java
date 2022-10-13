package com.eurotech.day11;

import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class CallWebDriverFactory {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }
}
