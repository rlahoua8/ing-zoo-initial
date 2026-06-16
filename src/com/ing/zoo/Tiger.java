package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.TrickPerformer;

import java.util.Random;

/**
 * This class extends the Animal superclass and implements the Carnivore
 * and TrickPerformer interfaces, allowing it to eat meat and
 * perform simple tricks.
 */
public class Tiger extends Animal implements Carnivore, TrickPerformer {
    // Constructor that forwards the given name to the Animal superclass
    public Tiger(String animalName)
    {
        super(animalName);
    }

    public void sayHello()
    {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        System.out.println("nomnomnom oink wubalubadubdub");
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            System.out.println("jumps in tree");
        }
        else
        {
            System.out.println("scratches ears");
        }
    }
}
