package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;

/**
 * I added this new class. It extends the Animal superclass and implements the Carnivore
 * interface to define meat‑eating behavior.
 */
public class Wolf extends Animal implements Carnivore {
    public String eatText;

    // Constructor that forwards the given name to the Animal superclass
    public Wolf(String animalName)
    {
        super(animalName);
    }

    public void sayHello()
    {
        helloText = "awooo";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        System.out.println("nomnomnom, I want more!");
    }
}
