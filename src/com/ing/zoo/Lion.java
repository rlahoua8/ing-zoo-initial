package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;

/**
 * This class extends the Animal superclass to inherit shared fields
 * and implements the Carnivore interface to define meat eating behavior.
 */
public class Lion extends Animal implements Carnivore {
    public String eatText;

    public Lion()
    {
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
