package com.company;

import java.util.Objects;

public class Rational {
    private final float numerator;
    private final float denominator;

    private double doubleValue(int number) {
        double newDouble = number;
        return newDouble;
    }
    public Rational(float p1, float p2) {
        this.numerator = p1;
        this.denominator = p2;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return Float.compare(rational.numerator, numerator) == 0 && Float.compare(rational.denominator, denominator) == 0;
    }

    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
    
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