package com.eurotech.webElement_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class VerifyUrlChanged_2 {
    public static void main(String[] args) {
   // bir önceki dersi kısaca tekrar et

        //open chrome browser
        //go to http://eurotech.study/login
        // enter e mail as 'eurotech@gmail.com'
        //enter password as 'Test12345!'
        //click login btn
        //verify that url has changed

        //ilk ne yapmalıyız ?
        //önce manuel test yapmalıyız (sen yap)
        //url deki değişiklik ne ?
        //open browser ve adresi diğer sayfadan kopyala

        //open chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://eurotech.study/login");

        //enter e mail

        String email="eurotech@gmail.com";
        WebElement emailInputBox = driver.findElement(By.id("loginpage-input-email"));

        //adlandırmanın öneminden bahset
        //şimdi selenyumdan ne isteyeceğiz(selenyum benim emailimi emailınputbox a yaz,gönder
        //nereye(hangi adrese)yazacak ? emailInputBox a

        emailInputBox.sendKeys("eurotech@gmail.com");
        emailInputBox.sendKeys(email);
        //sendKeys methodunu anlat:String olarak karakter,rakam değerler kabul eder
        //veya bu şekilde de yapabiliriz String email="eurotech@gmail.com" -->sendKeys(email)

        //enter password
        String password="Test12345!";
        WebElement passwordInputBox = driver.findElement(By.name("password"));
//soru:email i ıd, password ü name ile locat ettik aradakı fark ne?(hiç fark yok sadece yöntem farkı )
//önemli olan elementi doğru bir şekilde bulması),

        passwordInputBox.sendKeys(password);
        //locatorlarda harfleri büyük yap ve 'no such Element Exception' anlat (interview sorusu)
        // 'no such Element Exception' hatası aldığımız da ilk bakmamız gereken şeyler nelerdir ?
        //ilk olarak locatorumun doğru olup olmadığına bakarım (bazen locator doğru olsada, zorlamak gerekir)
        //keysencitiv olmalı
        //sonra wweitleri kontrol ederim

        //click login btn
        //tekrar locat etmeye gerek varmı ? -yok çünkü bu btn u zaten locat etmiştik
        WebElement loginBtn = driver.findElement(By.id("loginpage-form-btn"));
        loginBtn.click();
        //soru: daha önce kullandığımız ve tekrar tekrar kullanacağımız özellikleri(locator gibi) nasıl saklayacak ve kullanacağız
       //zor soru ?
       //

     //verify that url has changed
        String expectedUrl="http://eurotech.study/dashboard"; //manuel uygulayarak göster ve sor sayfadan aldığımız url expected mi actual mı
        //cevap expected çünki login btn a tıkladığımızda url ın sayfadaki gibi değişmesini bekliyoruz(dashboard farkı)
        //fakat actual url henuz bilmiyoruz test nasıl çalışacak driver(selenıum) bize ne getirecek
        String actualUrl=driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        //wait leri koymadan çalıştır ve fail olmasını sağla
        //neden çalışmadığını anlat:selenyum sayfanın yüklenmesini beklemeden kodları okuyor ve çalıştırıyor
        //web sayfaları bazen internet bazen de bilgisayarın hızından dolayı yavaş çalışabiliyor
        //logine tıklamadan verify etmeye başlıyor ve dashboard henüz açılmadığı için test fail oluyor

        //login click den sonra wait koy ve tekrar çalıştır








    }
}
