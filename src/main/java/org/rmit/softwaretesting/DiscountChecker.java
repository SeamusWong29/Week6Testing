package org.rmit.softwaretesting;

public class DiscountChecker {
    public static boolean isEligibleForDiscount(int age, boolean isStudent, boolean isMember) {
        boolean eligible = false;
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (age >= 65 || isStudent || isMember) {
            eligible = true;
        }
        return eligible;
    }
}
