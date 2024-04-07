package jl003_projects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonRunner3 {
    public static void main(String[] args) {
        List<Person> people = Person.getPersons();

        List<String> maleNames = people.stream()
                .filter(person -> person.getGender() == Person.Sex.MALE)
                .map(Person::getName)  // Map each person to their name
                .collect(Collectors.toList());

        System.out.println(maleNames);  // This will print a list of male names



    }
}
