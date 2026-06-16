package com.ing.zoo;

import com.ing.zoo.interfaces.Herbivore;

/**
 * The class Hippo extends the Animal superclass to inherit shared behavior
 * such as the helloText field, and implements the Herbivore
 * interface to define plant-eating behavior.
 */
public class Hippo extends Animal implements Herbivore {
    // Constructor that forwards the given name to the Animal superclass
    public Hippo(String animalName)
    {
        super(animalName);
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        System.out.println("munch munch lovely");
    }
}
