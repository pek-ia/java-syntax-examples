package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LocalDate today = LocalDate.now();
        System.out.println(today);


        System.out.printf("Day of the week: %s\n", today.getDayOfWeek());

        DateTimeFormatter dateFormat = DateTimeFormatter.ISO_ORDINAL_DATE;

        System.out.println(dateFormat.format(today));

        // Watch out for dragons!
        // LocalDate doesn't know what time it is
        // LocalTime doesn't know the date
        // LocalDateTime knows both


        // Let's find the date/time and print to the terminal
        // Exactly 4 pattern letters uses the full form of the week day?
        LocalDateTime rightNow = LocalDateTime.now();
        DateTimeFormatter hourOfDayAndDayOfWeek = DateTimeFormatter.ofPattern("HH:mm 'on' EEEE");
        // println() outputs a newline at the end
        System.out.println(hourOfDayAndDayOfWeek.format(rightNow));

        // write() does not add a newline, so I'll add it myself
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("today.txt"));
            writer.write(hourOfDayAndDayOfWeek.format(rightNow) + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
            }
            catch (Exception ignored){}
        }

        // try-with-resources automatically closes streams
        // and anything else that is AutoCloseable
        // try ( things that need closing ){
        //     things that might throw exceptions
        // }
        LocalDateTime birthday = LocalDateTime.of(1956, 3, 4, 6, 45);
        try (BufferedWriter writer1 = new BufferedWriter(new FileWriter("birthday.txt"));
             FileWriter f = new FileWriter("another_file.txt")){
            writer1.write(hourOfDayAndDayOfWeek.format(birthday) + "\n");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }





    }
}