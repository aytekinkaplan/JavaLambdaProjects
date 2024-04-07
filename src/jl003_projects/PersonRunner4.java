package jl003_projects;

import java.time.LocalDate;
import java.util.List;

public class PersonRunner4 {
    public static void main(String[] args) {
        List<Person> persons = Person.getPersons();
        for (Person person : persons) {
            System.out.println("Person`s name is " + person.getName() + " and age is " + person.getBirthDate() + " and gender is " + person.getGender() + " and email is " + person.getEmailAddress());
        }

        persons.stream()
                .filter(person -> person.getBirthDate() >= 1980) // More precise for >=
                .forEach(System.out::println);
    }
}
