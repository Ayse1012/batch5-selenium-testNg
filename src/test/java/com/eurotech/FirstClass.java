package com.eurotech;

import com.github.javafaker.Faker;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("hello selenium");
        Faker faker =new Faker();
        String name=faker.name().firstName();
        System.out.println(name);
        String name1=faker.harryPotter().character();
        String password=faker.internet().password();
        System.out.println(name1);
        System.out.println(password);
        String cart=faker.finance().creditCard();
        System.out.println(cart);

    }
}
