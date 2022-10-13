package com.eurotech.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class TagNameLocator {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.browserstack.com/users/sign_up");

        driver.manage().window().maximize();
        WebElement errorMessage = driver.findElement(By.tagName("hı"));
        String messageText = errorMessage.getText();
        System.out.println(messageText);


        driver.close();
    }
}
