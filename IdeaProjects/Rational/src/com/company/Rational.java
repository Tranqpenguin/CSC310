package com.company;

import java.util.Objects;

public class Rational {

    private float numerator;
    private float denominator;

    // constructor
    public Rational(float numerator, float denominator) {
        if (denominator == 0) {

            throw new IllegalArgumentException("Denominator cannot be zero");

        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // getters
    public float getNumerator() {
        return numerator;
    }

    public float getDenominator() {
        return denominator;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * The equals method implements an equivalence relation on non-null object references
     *
     * @param an object
     * @return true if numerators and denominators are the same
     */

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return Float.compare(rational.numerator, numerator) == 0 && Float.compare(rational.denominator, denominator) == 0;
    }

    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    // doubleValue() method to return of the getter
    public double doubleValue(){
        return getNumerator();
    }

    // Driver code
    public static void main(String[] args) {
        Rational rational12 = new Rational(1, 2);
        Rational rational23 = new Rational(2, 3);

        System.out.println("Test rational12 equals another Rational(1,2): " +
                (rational12.equals(new Rational(1, 2)) ? "passed" : "failed"));

        System.out.println("Test rational12 not equals rational23: " +
                (! rational12.equals(rational23) ? "passed" : "failed"));

        System.out.println("Test rational12 < rational23 as doubles: " +
                (rational12.doubleValue() < rational23.doubleValue() ?
                        "passed" : "failed"));
    }
}