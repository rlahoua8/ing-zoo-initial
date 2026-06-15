package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";
        commands[4] = "give banana";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Wolf rex = new Wolf();
        rex.name = "rex";
        Monkey george = new Monkey();
        george.name = "george";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Voer uw command in: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                System.out.println("Tot ziens!");
                return;
            }

            switch (input) {
                case "hello" -> {
                    henk.sayHello();
                    elsa.sayHello();
                    dora.sayHello();
                    wally.sayHello();
                    marty.sayHello();
                    rex.sayHello();
                    george.sayHello();
                }
                case "hello henk" -> henk.sayHello();
                case "hello elsa" -> elsa.sayHello();
                case "hello dora" -> dora.sayHello();
                case "hello wally" -> wally.sayHello();
                case "hello marty" -> marty.sayHello();
                case "hello rex" -> rex.sayHello();
                case "hello george" -> george.sayHello();
                case "give leaves" -> {
                    elsa.eatLeaves();
                    dora.eatLeaves();
                    marty.eatLeaves();
                }
                case "give banana" -> {
                    george.eatBanana();

                }
                case "give meat" -> {
                    henk.eatMeat();
                    wally.eatMeat();
                    dora.eatMeat();
                    rex.eatMeat();
                }
                case "perform trick" -> {
                    wally.performTrick();
                    dora.performTrick();
                    george.performTrick();
                    marty.performTrick();
                }
                default -> System.out.println("Unknown command: " + input);
            }
        }
    }
}
