package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Gender.FEMALE;
import static imperative.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Sean", MALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        // Imperative approach
        System.out.println("Imperative approach");

        List<Person> females = new ArrayList<>(); // empty list
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) { // if ,equals logic
                females.add(person);
            }
        }
        for (Person female: females) {  // final for loop for print
            System.out.println(female);
        }

        // Declarative approach
        System.out.println("Declarative approach");
        List<Person> females2 = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

    }
}

