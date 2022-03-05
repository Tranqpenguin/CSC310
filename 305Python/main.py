class Rational:
    def __init__(self, numerator, denominator):
        """

        :param numerator:
        :param denominator:
        """
        self._num1: float = numerator
        self._num2: float = denominator

    def getNumerator(self) -> float:
        return self._num1

    def getDenominator(self) -> float:
        return self._num2

    def equals(self, rational: "Rational") -> bool:
        """

        :param rational:
        :return true if numerators and denominators are the same:
        """
        numerator2 = rational.getNumerator()
        denominator2 = rational.getDenominator()
        a = Rational.getNumerator(self) * denominator2
        b = Rational.getDenominator(self) * numerator2
        if a == b:
            return True
        else:
            return False

    def as_float(self) -> float:
        return self._num1 / self._num2


rational12 = Rational(1, 2)
rational23 = Rational(2, 3)
print("Test rational12 equals another Rational(1,2):", "passed" if rational12.equals(Rational(1, 2)) else "failed")
print("Test rational12 not equals rational23:", "passed" if not rational12.equals(rational23) else "failed")
print("Test rational12 < rational23 as floats:",
      "passed" if rational12.as_float() < rational23.as_float() else "failed")
