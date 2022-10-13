package com.eurotech.webElement_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class VerifyThatConfirmationMessage_3 {
    public static void main(String[] args) throws InterruptedException {
        //open chrome browser
        //go to http://eurotech.study/login
        // enter e mail as 'eurotech@gmail.com'
        //enter password as Test12345!
        //click login btn
        //verify that welcome message is "welcome Eurotech"

        //önce manuel test

        // ilk 5 step diğer classtan copyalanır

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://eurotech.study/login");

        WebElement emailInputBox = driver.findElement(By.id("loginpage-input-email"));
        emailInputBox.sendKeys("eurotech@gmail.com");

        String password="Test12345!";
        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.id("loginpage-form-btn"));
        loginBtn.click();

        Thread.sleep(2000);

        //sayfada göster bu message ı nasıl verify ederiz ?


      //web element lerin text ini alabilmek için iki yol var
       //1. getText() --->bu %99 çalışır ve bize sitring döner
        //2. getAttribute("value") --->2.yol input box özelliklerini getirir
        String expectedText="welcome Eurotech";
        //expected burada bize test case veya userStory den gelir
        WebElement welcameText  = driver.findElement(By.id("dashboard-p1"));//adını ne koyabiliriz (welcametext)
        //burada yeni method öğreneceğiz: önceki methodlardan örnek ver
        //önceki methodları nasıl çağırıyorduk

        System.out.println("welcameText.getText() = " + welcameText.getText());
        //bu aşamada kodu çalıştır ve message ı aldığımızı göster
        String actualText=welcameText.getText();

        if (expectedText.equals(actualText)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }





        driver.close();


    }
}
