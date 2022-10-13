package com.eurotech.day14TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertion {


    @BeforeMethod
    public void setup(){
        System.out.println("WebDriver open, browser setup");
    }
    @Test
    public void test1(){
        System.out.println("first assertion");
        Assert.assertEquals("bitle","Title");//fail
        //fail den sonraki kod çalışmaz , diğer teste geçer
        System.out.println("second assertion");
        Assert.assertEquals("URL","URL");//pass
    }
        @Test
        public void Test2(){
            System.out.println("test 2 passed");
        }

    @AfterMethod
    public void tearDown(){
        System.out.println("Close Driver");
    }

}
