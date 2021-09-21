package imperative;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(

        );
    }
        static class Person {
            private final String name;
            private final Gender gender;

            Person(String name, Gender gender) {
                this.name = name;
                this.gender = gender;
            }
        }

        enum Gender {
        MALE, FEMALE
        }
    }

