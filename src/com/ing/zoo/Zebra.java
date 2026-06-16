package com.ing.zoo;

import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.TrickPerformer;

import java.util.Random;

/**
 * The Zebra class represents a zebra in the zoo.
 * It extends the Animal superclass and implements the Herbivore
 * and TrickPerformer interfaces, allowing it to eat plants and
 * perform simple tricks.
 */
public class Zebra extends Animal implements Herbivore, TrickPerformer {

    // Constructor that forwards the given name to the Animal superclass
    public Zebra(String animalName)
    {
        super(animalName);
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        System.out.println("munch munch zank yee bra");
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            System.out.println("jumps over a river");
        }
        else
        {
            System.out.println("runs in circles");
        }
    }
}
