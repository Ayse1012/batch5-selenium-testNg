package com.eurotech.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class XpathLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.tr/");

        //1.formül ==> //tagName[@atribute='atributeValue']
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Apple");
        driver.findElement(By.xpath("//input[@class='nav-search-submit nav-sprite']")).click();
        Thread.sleep(2000);
        //2.formül ==>//tagName[text()='exact text'] a tagname içinde text i exact text olan elementi getir
        //veya ==> //tagName[.='exact text'] '.' text() anlamına gelir

        //3-formül ==> //input[contains(text(),'Dynamic')]
        //4.formül ==> //tagName[starts-with(@attibute,'value')]
        //4.formül ==> //tagName[ends-with(@attibute,'value')] not:ends with chrome da çalışmaz
        //4.formül ==> //
        driver.close();

    }
}
