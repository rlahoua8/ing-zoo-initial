package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.TrickPerformer;

import java.util.Random;

/**
 * This class extends the Animal superclass and implements Carnivore,
 * Herbivore, and TrickPerformer, meaning pigs can eat both plants
 * and meat, and can perform simple tricks.
 */
public class Pig extends Animal implements Carnivore, Herbivore, TrickPerformer {
    // Constructor that forwards the given name to the Animal superclass
    public Pig(String animalName)
    {
        super(animalName);
    }

    public void sayHello()
    {
        System.out.println("oink oink");
    }

    public void eatLeaves()
    {
        System.out.println("munch munch oink");
    }

    public void eatMeat()
    {
        System.out.println("nomnomnom oink thx");
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            System.out.println("rolls in the mud");
        }
        else
        {
            System.out.println("runs in circles");
        }
    }
}
