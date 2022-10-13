package com.eurotech.webElement_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class GetAttribute_4 {
    public static void main(String[] args) throws InterruptedException {
         //giğer sayfadan copyala
        // 2. getAttribute("value") -->2.yol Html deki Attribute ün value sini String olarak döner

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://eurotech.study/login");

        Thread.sleep(2000);
         //enter email
        String email="eurotech@gmail.com";
        WebElement emailInputBox = driver.findElement(By.id("loginpage-input-email"));
        emailInputBox.sendKeys(email);

        Thread.sleep(2000);
        String value = emailInputBox.getAttribute("value");
     //   String value = emailInputBox.getAttribute("name"); bize "email" döner
        System.out.println("value = " + value);

    //bazen getztext ten değerleri alamayız o durumlarda getAttribute kullanabiliriz


   //konu bitti;
   //1-canvasta page de html de passcode u kim gösterecek
   /* 2-
   Task1
   -open chrome browser
   -go to https://www.facebook.com/
   -enter real username
   -enter real password
   -click login button
   -verify that login successfully
   Task2
   -open chrome browser
   -go to https://www.facebook.com/
   -enter dummy username with using Faker class
   -enter dummy password with using Faker class
   -click login btn
   -veriify that login Failed

    */


    }

}
