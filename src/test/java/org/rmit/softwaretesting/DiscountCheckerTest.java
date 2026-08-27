package org.rmit.softwaretesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCheckerTest {
    @Test
    void seniorGetsDiscount() {
        assertTrue(
                DiscountChecker.isEligibleForDiscount(70, false, false)
        );
    }

    @Test
    void regularCustomerDoesNotGetDiscount() {
        assertFalse(
                DiscountChecker.isEligibleForDiscount(30, false, false)
        );
    }
    @Test
    void negativeAgeThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> DiscountChecker.isEligibleForDiscount(-10, false, false)
        );
    }


    //Improve your test suite to attain 100% branch coverage.
    //Do you know about short circuit evaluation?

//    @Test
//    void studentGetsDiscount() {
//        assertTrue(
//                DiscountChecker.isEligibleForDiscount(25, true, false)
//        );
//    }
//
//    @Test
//    void memberGetsDiscount() {
//        assertTrue(
//                DiscountChecker.isEligibleForDiscount(25, false, true)
//        );
//    }
}