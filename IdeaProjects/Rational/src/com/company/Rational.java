package com.company;

import java.util.Objects;

public class Rational {

    float p1;
    float p2;
    // constructor
    public Rational(float p1, float p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // getters
    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }

    // equals() method to check two Rational is equal or not
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return Float.compare(rational.p1, p1) == 0 && Float.compare(rational.p2, p2) == 0;
    }

    public int hashCode() {
        return Objects.hash(p1, p2);
    }

    // doubleValue() method to return of the getter
    public double doubleValue(){
        return getP1();
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