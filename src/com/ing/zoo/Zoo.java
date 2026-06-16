package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.TrickPerformer;

import java.util.Scanner;

/**
 * Main class of the zoo application.
 * Creates animals, groups them by behavior, and handles user commands from the console.
 */
public class Zoo {
    public static void main(String[] args) {

        // Animals are created with their name through the constructor.
        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Wolf rex = new Wolf("rex");
        Monkey george = new Monkey("george");

        // Interface arrays group animals by behavior instead of by animal type.
        Carnivore[] carnivores = {
                henk,
                wally,
                dora,
                rex
        };

        Herbivore[] herbivores = {
                elsa,
                dora,
                marty,
                george
        };

        TrickPerformer[] trickPerformers = {
                wally,
                dora,
                george,
                marty
        };

        // Polymorphism: different animal types can be stored as Animal objects.
        Animal[] animals = {
                henk,
                elsa,
                dora,
                wally,
                marty,
                rex,
                george
        };

        Scanner scanner = new Scanner(System.in);

        printMenu();

        // Main loop that continuously prompts the user for commands until "stop" is entered.
        while (true) {
            System.out.print("Voer uw command in: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                System.out.println("See you next time!");
                break;
            }

            // Handles commands like "hello henk" by searching for the animal name.
            if (input.startsWith("hello ")) {
                String name = input.substring(6);
                boolean found = false;

                // Loop through all animals to find the one with the specified name.
                for (Animal dier : animals) {
                    // Encapsulation: getName() is used because name is private in Animal.
                    if (dier.getName().equalsIgnoreCase(name)) {
                        dier.sayHello();
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("No animal named " + name + " found in the zoo.");
                }

                continue;
            }

            // switch statement handles the main commands for the zoo application.
            switch (input) {
                case "help" -> printMenu();

                case "hello" -> {
                    for (Animal dier : animals) {
                        dier.sayHello();
                    }
                }

                case "give leaves" -> {
                    for (Herbivore dier : herbivores) {
                        dier.eatLeaves();
                    }
                }

                case "give meat" -> {
                    for (Carnivore dier : carnivores) {
                        dier.eatMeat();
                    }
                }

                case "perform trick" -> {
                    for (TrickPerformer dier : trickPerformers) {
                        dier.performTrick();
                    }
                }

                default -> System.out.println("Unknown command: " + input);
            }
        }

        scanner.close();
    }

    // Prints the available commands for the user.
    private static void printMenu() {
        System.out.println("Welcome to the zoo! Here are the available commands:");
        System.out.println("- hello");
        System.out.println("- hello [animal name]");
        System.out.println("- give leaves");
        System.out.println("- give meat");
        System.out.println("- perform trick");
        System.out.println("- stop");
        System.out.println("- help");
    }
}