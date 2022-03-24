package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RationalTest {

    @Test
    @DisplayName("Test rational12 equals another Rational(1,2)")
    void testEquals() {
        Rational rational12 = new Rational(1, 2);
        assertTrue(rational12.equals(new Rational(1, 2)));
    }

    @Test
    void testNotEquals(){
        Rational rational12 = new Rational(1, 2);
        Rational rational23 = new Rational(2, 3);
        assertFalse(rational12.equals(rational23));
    }


    @Test
    @DisplayName("Rational(2,3) is equal to approximately 0.666667")
    void doubleValue() {
        Rational rational23 = new Rational(2, 3);
        assertEquals(0.666667, rational23.doubleValue(), 0.0001);
    }

    @Test
    @DisplayName("checking to see of object is not comparable")
    void cantCompareNull() {
        Rational rational12 = new Rational(1, 2);
        assertThrows(NullPointerException.class, () -> rational12.equals(null));
    }

    @Test
    @DisplayName("Checking to see if denominator is equal to zero")
    void zeroDenominatorIsIllegal(){
        assertThrows(IllegalArgumentException.class, () -> new Rational(1,0));
    }
}