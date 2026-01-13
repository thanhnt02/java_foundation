package operator;

import java.util.Scanner;

public class Homework {
  public static void main(String[] args) {
    // 1
    String s = "Thanh";
    System.out.println("String is: " + s);

    // 2
    int number = 2;
    if (number % 2 == 0) {
      System.out.printf("%d is even\n", number);
    } else {
      System.out.printf("%d is odd\n", number);
    }
    if (number < 0) {
      System.out.printf("%d is negative\n", number);
    } else {
      System.out.printf("%d is positive\n", number);
    }

    // 3
//    Scanner scanner = new Scanner(System.in);
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//    if (b == 0) {
//      System.out.println("Please type another number");
//      return;
//    }
//    System.out.printf("%d + %d = %d\n", a, b, a + b);
//    System.out.printf("%d - %d = %d\n", a, b, a - b);
//    System.out.printf("%d * %d = %d\n", a, b, (long)a * (long)b);
//    System.out.printf("%d / %d = %f\n", a, b, (float)a / (float)b);

    // 4
//    Scanner scanner = new Scanner(System.in);
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//    if (a > b) {
//      System.out.println("a is greater than b");
//    } else if (a < b) {
//      System.out.println("a is less than b");
//    } else {
//      System.out.println("a is equal to b");
//    }

    // 5
//    Scanner scanner = new Scanner(System.in);
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//    System.out.println("Chu vi của hình chữ nhật là: " + 2 * (a + b));
//    System.out.println("Diện tích của hình chữ nhật là: " + (long)a * b);

    // 6
//    Scanner scanner = new Scanner(System.in);
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//    int c = scanner.nextInt();
//    if (a < 0 || b < 0 || c < 0) {
//      System.out.println("Not valid");
//      return;
//    }
//    if (a + b < c || a + c < b || b + c < a) {
//      System.out.println("Not triangle");
//    } else {
//      System.out.println("Triangle");
//    }
  }
}
