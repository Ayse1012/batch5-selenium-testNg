package com.eurotech.day14TestNG;

import org.testng.annotations.*;

public class BeforeAfterClass {
    //bir test caseimiz olsun,biz önce her testden önce
    //bir webdriver aç,(yani driverı setup et)
    //sonra bir browser open et
    //test case imi çalıştır ve bitince browserı kapat
    //diyeceğiz(kime :) testng ve selenyuma ye)
  //yukarıdaki işlemleri yapabilmemiz için testng bize bazı annotation lar veriyor
  //@BeforeMethod:her testden önce çalışacak olan method
 //bize webdriver setup edeceği için setup() methodu oluşturuyoruz

    @BeforeClass
    public void setupClass(){
        System.out.println("-----BEFORE CLASS-----");
        System.out.println("Her classtan önce bir defa çalışır");
    }

    @Test
    public void testName(){
        System.out.println("First test case");
    }
    @BeforeMethod
    public void setup(){

    }
    @AfterMethod
    public void tearDown(){

    }
    @Test
    public void Test1(){
    }
    @Test
    public void Test2(){
    }
    //@ignore veya // bu methodun çalışmasını engeller
    @Test
    public void Test3(){
        System.out.println("İGNORE");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("-----AFTER CLASS-----");

    }



}
