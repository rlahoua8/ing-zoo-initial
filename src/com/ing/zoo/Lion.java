package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;

/**
 * This class extends the Animal superclass to inherit shared fields
 * and implements the Carnivore interface to define meat eating behavior.
 */
public class Lion extends Animal implements Carnivore {
    // Constructor that forwards the given name to the Animal superclass
    public Lion(String animalName)
    {
        super(animalName);
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        System.out.println("nomnomnom thx mate");
    }
}
