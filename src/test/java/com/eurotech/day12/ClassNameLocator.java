package com.eurotech.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class ClassNameLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/automation-practice-form");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.className("header-text")).click();

    }
}
