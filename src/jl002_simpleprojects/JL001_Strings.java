package jl002_simpleprojects;

import java.util.ArrayList;
import java.util.Scanner;

public class JL001_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        // Prompt the user to enter the first name
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        // Prompt the user to enter the second name
        System.out.println("Enter second name: ");
        String secondName = scanner.nextLine();

        // Prompt the user to enter the third name
        System.out.println("Enter third name: ");
        String thirdName = scanner.nextLine();

        // Prompt the user to enter the fourth name
        System.out.println("Enter fourth name: ");
        String fourthName = scanner.nextLine();

        // Prompt the user to enter the fifth name
        System.out.println("Enter fifth name: ");
        String fifthName = scanner.nextLine();

        // Prompt the user to enter the sixth name
        System.out.println("Enter sixth name: ");
        String sixthName = scanner.nextLine();

        // Prompt the user to enter the seventh name
        System.out.println("Enter seventh name: ");
        String seventhName = scanner.nextLine();

        // Prompt the user to enter the eighth name
        System.out.println("Enter eighth name: ");
        String eighthName = scanner.nextLine();

        // Prompt the user to enter the ninth name
        System.out.println("Enter ninth name: ");
        String ninthName = scanner.nextLine();

        // Prompt the user to enter the tenth name
        System.out.println("Enter tenth name: ");
        String tenthName = scanner.nextLine();

        // Create an ArrayList to store the names
        ArrayList<String> names = new ArrayList<String>();

        // Add the names to the ArrayList
        names.add(firstName);
        names.add(secondName);
        names.add(thirdName);
        names.add(fourthName);
        names.add(fifthName);
        names.add(sixthName);
        names.add(seventhName);
        names.add(eighthName);
        names.add(ninthName);
        names.add(tenthName);

        // Print out all the names entered by the user
        names.forEach(System.out::println);
    }
}
