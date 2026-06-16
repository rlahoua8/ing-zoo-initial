package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;

/**
 * I added this new class. It extends the Animal superclass and implements the Carnivore
 * interface to define meat‑eating behavior.
 */
public class Wolf extends Animal implements Carnivore {
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
