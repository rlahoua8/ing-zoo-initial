package com.ing.zoo;

/**
 * Superclass for all zoo animals.
 * Defines shared properties and behavior, such as the name and a default hello message.
 * Uses encapsulation for the name field, which is exposed through a public getter.
 */
public class Animal {
    private final String name;
    protected String helloText;

    public Animal(String animalName)
    {
        this.name = animalName;
    }

    public void sayHello()
    {
        helloText = "Hello, I am an animal";
        System.out.println(helloText);
    }

    // Getter method for accessing the animal's name
    public String getName() {
        return name;
    }
}
