package OverviewOOP.homework;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction (int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    int GCD (int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void simplify () {
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        int GCDFraction = GCD(numerator, denominator);
        System.out.println("After simplify: " + numerator/GCDFraction + "/" + denominator/GCDFraction);
    }

    public void showFraction () {
        System.out.println(numerator + "/" + denominator);
    }

    public void addition (Fraction fraction2) {
        int newNumerator = numerator * fraction2.denominator + denominator * fraction2.numerator;
        int newDenominator = denominator * fraction2.denominator;
        int GCDNewFraction = GCD(newNumerator, newDenominator);

        System.out.println("Addition: " + newNumerator/GCDNewFraction + "/" + newDenominator/GCDNewFraction);
    }

    public void subtraction (Fraction fraction1, Fraction fraction2) {
        int newNumerator = fraction1.numerator * fraction2.denominator - fraction1.denominator * fraction2.numerator;
        int newDenominator = fraction1.denominator * fraction2.denominator;
        int GCDNewFraction = GCD(newNumerator, newDenominator);

        System.out.println("Subtraction: " + newNumerator/GCDNewFraction + "/" + newDenominator/GCDNewFraction);
    }

    public void multiple (Fraction fraction1, Fraction fraction2) {
        int newNumerator = fraction1.numerator * fraction2.numerator;
        int newDenominator = fraction1.denominator * fraction2.denominator;
        int GCDNewFraction = GCD(newNumerator, newDenominator);

        System.out.println("Multiple: " + newNumerator/GCDNewFraction + "/" + newDenominator/GCDNewFraction);
    }

    public void division (Fraction fraction1, Fraction fraction2) {
        int newNumerator = fraction1.numerator * fraction2.denominator;
        int newDenominator = fraction1.denominator * fraction2.numerator;
        int GCDNewFraction = GCD(newNumerator, newDenominator);

        System.out.println("Division: " + newNumerator/GCDNewFraction + "/" + newDenominator/GCDNewFraction);
    }
}
