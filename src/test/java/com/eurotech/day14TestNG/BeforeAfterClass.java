package com.eurotech.day14TestNG;

import org.testng.annotations.*;

public class BeforeAfterClass {
    // biz her testden önce
    //bir webdriver aç,(yani driverı setup et)
    //sonra bir browser open(aç) et
    //test case imi çalıştır ve bitince browserı kapat
    //diyeceğiz(kime :) testng ve selenyuma ye)
  //yukarıdaki işlemleri yapabilmemiz için testng bize bazı annotation lar veriyor
  //@BeforeMethod:her testden önce çalışacak olan method
 //bize webdriver setup edeceği için setup() methodu oluşturuyoruz

    //Not:ctr+N test methodu otamatik getirir ?

    //1-bir test caseimiz olsun
    @Test
    public void test1(){
        System.out.println("First test case");
    }

    @BeforeMethod //her test methodundan önce çalışır
    public void setup(){
        System.out.println("WebDriver setup, Opening Browser");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Closing  Browser");
    }

    //kodu çalıştır, konsolda methodların çalışma sırasına bak

    @Test
    public void Test2(){
        System.out.println("Test case 2");
    }

    @Test
    public void test3() {
        System.out.println("Test case 3");
    }
    //çalıştırmadan önce sor konsalda ne bekliyoruz
    //burada çalışma mantığı javadan biraz farklı satır sırasına göre değil
    //before ve after methodlarına göre


    @BeforeClass //classın başına yaz,bu clasın başında bir defa çalışır
    public void setupClass(){
        System.out.println("-----BEFORE CLASS-----");
        System.out.println("Her classtan önce bir defa çalışır");
    }

    //yazım sıralaması önemli değil önemli olan annotations

    @AfterClass
    public void tearDownClass(){
        System.out.println("-----AFTER CLASS-----");
        System.out.println("SOON Reporting Code HERE");
  //bu class ı ileride testlerimizin raporlarını almak için kullanacağız

    }

    // @Test in başına @ignore veya // bu methodun çalışmasını engeller
    @Test
    public void Test4(){
        System.out.println("İGNORE");
    }

    //not: her test method içerik olarak birbirinden bağimsız olabilir


}
