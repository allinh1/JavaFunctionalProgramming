package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice",
                "test@test.com",
                "+61404123123",
                LocalDate.of(2000,1,1)
        );

        System.out.println(new CustomerValidatorService().isValid(customer));

        // valid customer = true , store customer in db.


    }
}
