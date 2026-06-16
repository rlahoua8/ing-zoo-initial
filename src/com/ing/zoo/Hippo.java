package com.ing.zoo;

import com.ing.zoo.interfaces.Herbivore;

/**
 * The class Hippo extends the Animal superclass to inherit shared behavior
 * such as the helloText field, and implements the Herbivore
 * interface to define plant-eating behavior.
 */
public class Hippo extends Animal implements Herbivore {
    public String eatText;

    public Hippo()
    {
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
