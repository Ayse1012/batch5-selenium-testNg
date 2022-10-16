package com.eurotech.day14TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertion {

    @Test
    public void test1(){
        //assertion nedir daha önce duyan varmi?
        //Ass yazdığımızda en yukarda testng görürüz

        Assert.assertEquals("Title","Title");

   //1. olarak bunu yaz ve anlat,çalıştır,assertler düzgün çalıştığında bize hiçbirşey vermez,sadece test pass der
   //ancak assertler keysencitive dir,bozarak göster
   //her testimizin sonunda mutlaka assertler olacak yoksa test in mantığı olmaz

   //2.olarak before ve after metodlarını yazarak çalıştır
   //assertion dan önce java da nasıl yapıyorduk - ifle
   //3.adım- test1_1 i ekle , test2 yi ekle ve hatasız çalıştır (çıktıları verdi ama assertle ilgili bilgi vermedi)
   //4. adım - first assertion a keysensitive uygula ve çalıştırmadan sor ne olur?
        // (kod hata aldığı anda bir sonraki teste geçer)
        //test mantığı şöyle çalışır:bir test yapıyorsunuz,amazona girdiniz bir ürün seçtiniz,sepete attınız
        //ödeme yapıyorsunuz kartbilgilerini giriyorsunuz, fakat ürün sepete girmedi
        //ne olur o andan itibaren test faildir ve sonraki kodlar çalışmaz çünki ürün yok
    }
    @Test
    public void test1_1(){
        System.out.println("first assertion");
        Assert.assertEquals("Title","Title");//fail
        //fail den sonraki kod çalışmaz , diğer teste geçer
        System.out.println("second assertion");
        Assert.assertEquals("URL","URL");
    }
        @Test
        public void Test2(){

            Assert.assertEquals("test2","test2");
        }

    @BeforeMethod
    public void setup(){
        System.out.println("WebDriver open, browser setup");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Close Driver");
    }

}
