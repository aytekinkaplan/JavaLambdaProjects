package jl003_projects;

import java.util.ArrayList;
import java.util.List;

public class PersonRunner2 {
    public static void main(String[] args) {
        List<Person> person = Person.getPersons();
        person.forEach(p -> System.out.println(
                "Person`s name is " + p.getName() +
                        " and age is " + p.getBirthDate() +
                        " and gender is " + p.getGender() +
                        " and email is " + p.getEmailAddress())
        );

    }
}
