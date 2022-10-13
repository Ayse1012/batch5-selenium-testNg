package com.eurotech.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class NameLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.browserstack.com/users/sign_up");

        driver.manage().window().maximize();
         //1.yol
        WebElement ınputName = driver.findElement(By.name("user_full_name"));
        ınputName.sendKeys("Jhon Smith");

        Thread.sleep(2000);

          //Lazy way (2.yol)
        driver.findElement(By.name("user_full_name")).sendKeys("Jhon smith");
         //soru, hangi yol daha mantıklı
        //cevap, silmeden yanına yazar,mantıken hep önce manuel düşünmek gerek
        //yukarıdaki iki yolu birden çalıştırırsak ne olur

        //doublicate name örnek
        driver.navigate().to("https://demo.aspnetawesome.com/");
        driver.findElement(By.name("itemParentCat")).click();
        driver.close();

    }
}
