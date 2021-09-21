package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("0400000000"));
        System.out.println(isPhoneNumberValid("0200000000"));
        System.out.println(isPhoneNumberValid("040000000011"));
        System.out.println(isPhoneNumberValid("0412332323"));

        System.out.println("Testing Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("0404123132"));
        System.out.println(isPhoneNumberValidPredicate.test("1234124412"));

        // Chaining Predicates
        System.out.println(
                "Is phone number valid and contains number 3 " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("0404123132"));

        System.out.println(
                "Is phone number valid and contains number 3 " +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("04123312311"));

    }

    static boolean isPhoneNumberValid (String phoneNumber){
        return phoneNumber.startsWith("04") && phoneNumber.length() == 10;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("04") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
