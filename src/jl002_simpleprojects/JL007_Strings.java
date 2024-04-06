package jl002_simpleprojects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JL007_Strings {
    public static void main(String[] args) {
        // Creating a list of 10 fruit names
        List<String> fruits = new ArrayList<>(Arrays.asList(
                "Apple", "Pear", "Banana", "Strawberry", "Cherry",
                "Kiwi", "Grape", "Orange", "Pineapple", "Mango"
        ));

        // Printing the content of the list
        System.out.println("Fruit List:");
        fruits.forEach(System.out::println);

        // Filtering fruits that start with "P" and printing them
        List<String> pFruits = fruits.stream().filter(s -> s.startsWith("P")).toList();
        System.out.println("Fruit List starts with P: " + pFruits);

        // Filtering fruits that end with "a" and printing them
        List<String> aFruits = fruits.stream().filter(s -> s.endsWith("a")).toList();
        System.out.println("Fruit List ends with a: " + aFruits);

        // Filtering fruits that start with "P" and end with "a" and printing them
        List<String> paFruits = fruits.stream().filter(s -> s.startsWith("P") && s.endsWith("a")).toList();
        System.out.println("Fruit List starts with P and ends with a: " + paFruits);

        // Filtering fruits that start with "P" or "a" and print them
        List<String> paOrAFruits = fruits.stream().filter(s -> s.startsWith("P") || s.startsWith("a")).toList();

    }
}
