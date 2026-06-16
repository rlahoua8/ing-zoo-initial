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
    public String eatText;
    public String trick;

    public Pig()
    {
    }

    public void sayHello()
    {
        helloText = "oink oink";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
