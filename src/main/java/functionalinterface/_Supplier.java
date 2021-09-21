package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrlSupplier.get());
    }


    // Return a value , suppliers return any type of value type.
    static String getDBConnectionUrl () {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> getDBConnectionUrlSupplier = ()
            -> List.of(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/customers",
            "jdbc://localhost:5432/contact");
}
