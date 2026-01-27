package OOP.Homework2;

public class Fraction {
  int numerator;
  int denominator;

  Fraction(int numerator, int denominator){
    this.numerator = numerator;
    this.denominator = denominator;
  }

  static int GCD(int a, int b) {
    while (a != b) {
      if (a > b) a -= b;
      else b -= a;
    }
    return a;
  }

  static Fraction simplify(Fraction fraction) {
    int GCDFraction = GCD(fraction.numerator, fraction.denominator);

    int newNumerator = fraction.numerator / GCDFraction;
    int newDenominator = fraction.denominator / GCDFraction;

    return new Fraction(newNumerator, newDenominator);
  }

  static void format(Fraction fraction) {
    System.out.println(fraction.numerator + "/" + fraction.denominator);
  }

  static Fraction addition(Fraction fraction1, Fraction fraction2) {
    int newNumerator = (fraction1.numerator * fraction2.denominator + fraction1.denominator * fraction2.numerator);
    int newDenominator = fraction1.denominator * fraction2.denominator;

    int GCDFraction = GCD(Math.abs(newNumerator), Math.abs(newDenominator));
    return new Fraction(newNumerator/GCDFraction, newDenominator/GCDFraction);
  }

  static Fraction subtraction(Fraction fraction1, Fraction fraction2) {
    int newNumerator = (fraction1.numerator * fraction2.denominator - fraction1.denominator - fraction2.numerator);
    int newDenominator = fraction1.denominator * fraction2.denominator;

    int GCDFraction = GCD(Math.abs(newNumerator), Math.abs(newDenominator));
    return new Fraction(newNumerator/GCDFraction, newDenominator/GCDFraction);
  }

  static Fraction multiplication(Fraction fraction1, Fraction fraction2) {
    int newNumerator = fraction1.numerator * fraction2.numerator;
    int newDenominator = fraction1.denominator * fraction2.denominator;

    int GCDFraction = GCD(Math.abs(newNumerator), Math.abs(newDenominator));
    return new Fraction(newNumerator/GCDFraction, newDenominator/GCDFraction);
  }

  static Fraction division(Fraction fraction1, Fraction fraction2) {
    int newNumerator = fraction1.numerator * fraction2.denominator;
    int newDenominator = fraction1.denominator * fraction2.numerator;

    int GCDFraction = GCD(Math.abs(newNumerator), Math.abs(newDenominator));
    return new Fraction(newNumerator/GCDFraction, newDenominator/GCDFraction);
  }
}
