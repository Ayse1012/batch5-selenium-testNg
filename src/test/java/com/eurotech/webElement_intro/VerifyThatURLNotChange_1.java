package com.eurotech.webElement_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class VerifyThatURLNotChange_1 {
    public static void main(String[] args) throws InterruptedException {
        //open chrome browser
        //go to http://eurotech.study/login
        //click login btn
        //verify not changed is URL

      //şimdi ilk olarak ne yapmalıyız
    // webDriverFactory classındaki getdriver methodumuzu çağıracağız

    //WebDriverManager chrome driveri ferameworkümüze yükledi(biz örneğin chrome u bilgisayarımıza nasıl yüklüyorsak o şekilde)
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //getDriver statik bir method olduğu için class adı ile çağırdik,obje create etmeye gerek yok
      //browser i neden bir methodla çağırarak kullanıyooruz

        //bizi istediğimiz sayfaya nasıl götürecek
        //driver objesi bize action sağlıyor(maus ve clavye ile yaptığımız işleri yapıyor)
       //
        driver.get("http://eurotech.study/login");
  //driver ile tıklama , veri gönderme gibi işlemleri yapabiliyoruz
   //driver. dediğimizde bize bir çok method sunuyor

   //genel olarak sorulan sorular cevaplandı, webdriverFactory clasının ve get driver
   //methodunun çalışma mantığından bahsedildi

   //test case imize gidelim
        //login butonuna tıklayalım
  // peki driver(selenium) login butonuna nasıl tıklayacak? sor
  // sayfaya git ve html yapısında locator için ne ve nasıl kullanacağımızı anlat
        //html nasıl açılır
  //(tagname,atribute-value,sol üst köşedeki karei.indeki ok işareti,ne işe yarar)
        //webelement nedir sayfada göstererek anlat
        //webElement bize selenium dan gelir

        //findElement methodunu elementleri bulmak için kullanırız
      //  WebElement loginBtn =driver.findElement(By.id("klkhfşgh"));

        //driver.findElement(By.id("kgjşhfghifd")yazdıktan sonra alt+enter tuşuna basarak webElemente assayn edebiliriz

      //  String name="mark";
       // int age=39;
        WebElement loginBtn = driver.findElement(By.id("loginpage-form-btn"));
        loginBtn.click();
       //çıkıyorsa understendbtn ını da tıklatabiliriz

        //Thread.sleep(): bazen web sayfaları int yaşlığından dolayı geç açılabilir

        //nasıl verify edebiliriz(java if ile)

        String expectedUrl=driver.getCurrentUrl();
        String actualUrl=driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }


      //  System.out.println(name);
        loginBtn.click();
        Thread.sleep(2000);


        driver.close();



    }
}
