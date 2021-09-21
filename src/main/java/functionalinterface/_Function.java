package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        // Function Example - Takes 1 argument and produces 1 result.
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));


        // BiFunction takes 2 arguments and produces 1 result

        // Normal Function
        System.out.println(incrementByOneAndMultipy(4,100));

        // BiFunction
        System.out.println(incrementByOneAndMultipyFunction.apply(4,100));

    }

    static Function<Integer, Integer> incrementByOneFunction
            = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;


    static int incrementByOne(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultipyFunction =
            (numberToIncrement, numberToMultiplyBy)
                    -> (numberToIncrement + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultipy(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
