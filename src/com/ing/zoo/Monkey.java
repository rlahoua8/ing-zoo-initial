package com.ing.zoo;

import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.TrickPerformer;

import java.util.Random;

/**
 * I added this new class. It extends the Animal superclass and implements the TrickPerformer
 * interface to provide trick behavior. The monkey also has its own
 * banana‑eating method unique to this species.
 */
public class Monkey extends Animal implements TrickPerformer, Herbivore {
    // Constructor that forwards the given name to the Animal superclass
    public Monkey(String animalName)
    {
        super(animalName);
    }

    public void sayHello()
    {
        helloText = "oe oe aah aah";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        System.out.println("No thanks, I want bananas!");
    }

    public void performTrick(){
        Random random = new Random();
        int rnd = random.nextInt(2);

        if(rnd == 0) {
            System.out.println("Swings from tree to tree");
        }
        else
        {
            System.out.println("Does a backflip");
        }

    }
}
