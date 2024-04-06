package jl002_simpleprojects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JL006_Strings {
    public static void main(String[] args) {
        // Creating a list of 10 fruit names
        List<String> fruits = new ArrayList<>(Arrays.asList(
                "Apple", "Pear", "Banana", "Strawberry", "Cherry",
                "Kiwi", "Grape", "Orange", "Pineapple", "Mango"
        ));

        // Printing the content of the list
        System.out.println("Fruit List:");
        fruits.forEach(System.out::println);
        System.out.println();
        System.out.println("Fruit List Size: " + fruits.size());
        System.out.println();
        fruits.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
