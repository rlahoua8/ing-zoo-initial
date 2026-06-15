package com.ing.zoo;

public class Wolf {
    public String name;
    public String helloText;
    public String eatText;

    public Wolf()
    {
    }

    public void sayHello()
    {
        helloText = "awooo";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom, I want more!";
        System.out.println(eatText);
    }
}
