package com.eurotech.day14TestNG;

import org.testng.annotations.Test;

public class FirstClassTestNG {
/*
önce Biraz testNG den bahsedilim
-TestNG bir fraimwork çeşidi, bizim cv lerimizde yazacağımız skillerden biri
-interview; hangi fraimwork leri biliyorsun
   -testNG,Cucumber
   TestNG Nedir ?
JUnit ve NUnit test frameworklerinin zayıf yönlerinin ortadan kaldırılması
amaçlanarak geliştirilmiş açık kaynaklı bir test frameworküdür.
TestNG Avantajlı Özellikleri :
1-Annotationlar(before,after, assertion vb
2-Raporlama:
   Örneğin 6 tane mevcut bir test senaryomuz bulunmaktadır.
Bu test senaryolarını koşturmaya başladığımızda 4 senaryonun başarılı olduğunu 5. Senaryoda hata verip durduğunu düşünelim.
5.Senaryoda ki mevcut hataları düzeltip yalnızca 5.senaryodan testimizi koşturmaya başlayalım çünkü ilk dört senaryonun zaten başarılı olduğunu görmüştük.
En baştan testlerimizi koşturmaya gerek yoktur.
2-Çoklu Akış test desteği,
3-Esnek test konfigürasyonu,
4-Test senaryoları kolay bir şekilde gruplandırılabilir,
5-Paralel test yapılması mümkündür

NOt: main method yok


testNG nın bir dependency var ve bu dependency in bize vermiş olduğu çeşitli anatoyşinlar var
-bu annotationslar bize birden fazla testimizi aynı class içerisinde çalıştırmamızı sağlıyor
- öncelikle fraimwork ümüzde testng yi kurabilmemiz için testng dipendysiyi indirmemiz gerekiyor
 -mvn reposıtory den arama da 'testng' yazıp ilk çıkan TestNG ye tıklıyoruz
7.4.0 ı kopyalayabiliriz
 - testNG dependency bize ne(anateyşıns) sağlıyor ? ona bakalım
 -main methodunu unutuyoruz ve @ e tıkladığımız da ve Te yazdığımız bize 'Test org.testng.annotations' a tıklıyoruz ve
bize testng yi import ediyor
-@Test
  public void test1(){
Sysytem.out.println("first test Case");
}
-şimdi kod yazmıyoruz sadece çalışma mantığını anlamaya çalışacağız
ilk testi yaptık; konsolu anlat
 */
   @Test
    public void Test1(){
       System.out.println("Web driver setup, Browser opining");
       System.out.println("first testng Case");//1-yaz ve çalıştır konsolu anlat
       System.out.println("Closing browser,quıt");

   }
   @Test
    public void Test2(){
       System.out.println("test case 2");
   }

}
