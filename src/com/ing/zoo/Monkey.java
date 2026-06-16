package com.ing.zoo;

import com.ing.zoo.interfaces.TrickPerformer;

import java.util.Random;

/**
 * I added this new class. It extends the Animal superclass and implements the TrickPerformer
 * interface to provide trick behavior. The monkey also has its own
 * banana‑eating method unique to this species.
 */
public class Monkey extends Animal implements TrickPerformer {
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
