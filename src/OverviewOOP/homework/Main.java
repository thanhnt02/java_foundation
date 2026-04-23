package OverviewOOP.homework;

public class Main {
    public static void main(String[] args) {
//        Circle circle = new Circle(2.5);
//        System.out.printf("Chu vi: %.2f\n", circle.chuVi());
//        System.out.printf("Dien tich: %.2f", circle.dienTich());

        Fraction fraction = new Fraction(-16, 20);
        fraction.simplify();
        fraction.showFraction();
        Fraction fraction2 = new Fraction(10, 20);
        fraction.addition(fraction2);
        fraction.subtraction(fraction, fraction2); // need to make it right
        fraction.multiple(fraction, fraction2); // need to make it right
        fraction.division(fraction, fraction2); // need to make it right
    }
}
