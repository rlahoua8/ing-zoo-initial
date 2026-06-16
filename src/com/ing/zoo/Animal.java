package com.ing.zoo;

public class Animal {
    public String name;
    public String helloText;

    public Animal()
    {
    }

    public void sayHello()
    {
        helloText = "Hello, I am an animal";
        System.out.println(helloText);
    }
}
