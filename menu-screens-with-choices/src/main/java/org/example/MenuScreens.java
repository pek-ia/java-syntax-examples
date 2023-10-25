package org.example;

import java.util.Scanner;

public class MenuScreens {
    public static Scanner scanner = null;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("here are some choices for you:");

        showAnimalsMenu();
    }

    public static void showAnimalsMenu(){
        String prompt = """
                ==================================
                          ANIMALS MENU
                ==================================
                Choose a type of animal by letter:
                
                A. Mammal
                B. Bird
                C. Lizard
                X. No, thank you; I'm done!
                
                your choice: """;

        boolean done = false;

        do {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();

            switch (input) {
                case "A", "a":
                    showMammalsMenu();
                    break;
                case "B", "b":
                    showBirdsMenu();
                    break;
                case "C", "c":
                    showLizardsMenu();
                    break;
                case "X", "x":
                    done = true;
                    break;
                default:
                    printErrorMessage();
                    break;
            }
        } while (!done);

    }

    private static void printErrorMessage() {
        System.out.println("I didn't understand you; please try again");
    }

    public static void showMammalsMenu() {
        String prompt = """
                ==================================
                          MAMMALS MENU
                ==================================
                Choose a type of mammal by number:
                
                1. Dog
                2. Cat
                3. Elephant
                0. No, thank you; I'm done with mammals!
                
                your choice: """;

        boolean done = false;
        do {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    System.out.println("Woof WOOF!");
                    break;
                case "2":
                    System.out.println("Prrrooot? Meowww!");
                    break;
                case "3":
                    System.out.println("Whoooooeeetttt!!!");
                    break;
                case "0":
                    done = true;
                    break;
                default:
                    printErrorMessage();
                    break;
            }
        } while (!done);
    }

    public static void showBirdsMenu(){
        String prompt = """
                ==================================
                          BIRDS MENU
                ==================================
                Choose a type of bird by letter (case-sensitive):
                
                a. Crow
                b. Robin
                c. Giant insane EMU
                x. No, thank you; I don't want any birds!
                
                your choice: """;

        boolean done = false;
        do {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();

            switch (input) {
                case "a":
                    System.out.println("Cawww, Cawwww!");
                    break;
                case "b":
                    showRobinsMenu();
                    break;
                case "c":
                    System.out.println("AWWWWKK!  GRACHHHK!");
                    break;
                case "x":
                    done = true;
                    break;
                default:
                    printErrorMessage();
                    break;
            }
        } while (!done);
    }


    public static void showRobinsMenu(){
        String prompt = """
                ==================================
                          ROBINS MENU
                ==================================
                Choose a type of Robin:
                
                a. American
                b. British
                x. Done with robins; Return to Birds menu
                
                your choice: """;

        boolean done = false;
        do {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();

            switch (input) {
                case "a":
                    System.out.println("Tweet, tweet, tweet!");
                    break;
                case "b":
                    System.out.println("twee chirp twee");
                    break;
                case "x":
                    done = true;
                    break;
                default:
                    printErrorMessage();
                    break;
            }
        } while (!done);
    }


    public static void showLizardsMenu(){
        System.out.println("Sorry!   NO LIZARDS here");

    }
}