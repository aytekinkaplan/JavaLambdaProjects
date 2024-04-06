package jl002_simpleprojects;

import java.util.ArrayList;
import java.util.Scanner;

public class JL002_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
        ArrayList<String> names = new ArrayList<String>(); // Create an ArrayList to store names

        // Loop to prompt the user to enter 10 names and add them to the list
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter your " + (i + 1) + "th name: "); // Prompt the user for input
            names.add(scanner.nextLine()); // Read the input name and add it to the list
        }

        names.forEach(System.out::println); // Print out all the names entered by the user
        scanner.close(); // Close the scanner to release system resources
    }
}
