package com.ing.zoo;

import java.util.Random;

public class Monkey {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Monkey()
    {
    }

    public void sayHello()
    {
        helloText = "oe oe aah aah";
        System.out.println(helloText);
    }

    public void eatBanana()
    {
        eatText = "nomnomnom, I love bananas!";
        System.out.println(eatText);
    }

    public void performTrick(){
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0) {
            trick = "swings from tree to tree";
        }
        else
        {
            trick = "does a backflip";
        }
        System.out.println(trick);

    }
}
