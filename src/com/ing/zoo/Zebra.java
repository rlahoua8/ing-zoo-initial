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
    public String eatText;
    public String trick;

    public Zebra()
    {
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps over a river";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
