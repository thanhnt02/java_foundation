package OOP.Homework2;

public class Main {
  public static void main(String[] args) {
    Fraction fraction = new Fraction(10, 20);
    Fraction simplified = Fraction.simplify(fraction);
    System.out.print("Phân số sau khi rút gọn là: " );
    Fraction.format(simplified);
    Fraction fraction1 = new Fraction(10, 20);
    Fraction fraction2 = new Fraction(2, 3);
    Fraction addition = Fraction.addition(fraction1, fraction2);
    System.out.print("Tổng của hai phân số là: " );
    Fraction.format(addition);
    Fraction subtraction = Fraction.subtraction(fraction1, fraction2);
    System.out.print("Hiệu của hai phân số là: " );
    Fraction.format(subtraction);
    Fraction multiplication = Fraction.multiplication(fraction1, fraction2);
    System.out.print("Tích của hai phân số là: " );
    Fraction.format(multiplication);
    Fraction division = Fraction.division(fraction1, fraction2);
    System.out.print("Thương của hai phân số là: " );
    Fraction.format(division);
  }
}
