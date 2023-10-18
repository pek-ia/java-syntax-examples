package org.example;

import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        /*
         * The while loop repeats as long as the test is true
         */

        // initialize a variable
        int index = 0;

        // test the variable BEFORE each loop
        while (index < numbers.length) {
            System.out.println(numbers[index]);

            // modify the variable
            ++index;
        }



        /*
         * The for loop tests BEFORE each loop, and modifies AFTER each loop
         */

        // initializer, test, and modifier are all in the same parens
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        /*
         * The for-each loop or "enhanced for loop"
         */

        // Automatically goes through all elements in an array or collection
        for (int i : numbers) {
            System.out.println(i);
        }


        /*
         * The do-while loop
         */

        scanner = new Scanner(System.in);


        boolean inputIsGood;

        // Goes through loop AT LEAST ONCE
        do {
            System.out.println("""
                    1. yes
                    2. no
                    3. maybe
                    """);
            System.out.print("Pick one:  ");

            String input = scanner.nextLine();

            // Assume input is good unless proved otherwise
            inputIsGood = true;

            switch (input) {
                case "1":
                    System.out.println("yessssss!");
                    break;
                case "2":
                    System.out.println("nuh uh");
                    break;
                case "3":
                    System.out.println("mmmmmm ");
                    break;
                default:
                    System.out.println("I didn't get that....");
                    inputIsGood = false;
            }

        } while (!inputIsGood);


        /*
         * LOOPS and SWITCHES - the final solution !!
         *
         * Separate the loop and the switch into different
         * methods to make it easier to understand
         *
         * The loop repeats the prompt
         * The switch deals with the input
         *
         *
         */
        // do-while loop with method to test whether we are done
        do {
            System.out.println("""
                    1. yes
                    2. no
                    3. maybe
                    """);
            System.out.print("Pick one:  ");

        } while (!inputIsGood());


    }



    static boolean inputIsGood() {
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                System.out.println("yessssss!");
                break;
            case "2":
                System.out.println("nuh uh");
                break;
            case "3":
                System.out.println("mmmmmm ");
                break;
            default:
                System.out.println("I didn't get that....");
                return false;
        }
        return true;
    }



}