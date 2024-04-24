package org.pluralsight.searchenginelogger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // log a message since the program just started
        //    Use the file named "log.txt" --> in the resources directory
        //      Open file
        String fileName = "./src/main/resources/log.txt";
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


        FileWriter fileWriter = null;
        BufferedWriter writer = null;
        Scanner scanner = new Scanner(System.in);


        try {
            fileWriter = new FileWriter(fileName, true);
            writer = new BufferedWriter(fileWriter);
            writer.write("App started at " + LocalDateTime.now().format(dateFormat) + "\n");

        } catch (IOException e) {
            System.out.println("File did not open!");
            throw new RuntimeException(e);
        }


        while (true){
            //
            // loop to ask for user input
            //   Prompt the user to enter a term (or X)
            //   Read the user's input one line at a time using Scanner
            //   On each input, log a message reporting the "search term"
            //   If they enter "X" as the search term, break out of loop
            //
            System.out.print("Enter a word: ");
            String input;
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("X")){
                break;
            }
        }

        // log a message since program about to exit


        try {
            writer.write("App exited at " + LocalDateTime.now().format(dateFormat) + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
