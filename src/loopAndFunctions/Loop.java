package loopAndFunctions;

import java.util.Random;
import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {
    // Tính tổng cho đến khi input bằng 0
//    Scanner scanner = new Scanner(System.in);
//    int sum = 0, input;
//
//    do {
//      System.out.println("Enter a number: ");
//      input = scanner.nextInt();
//      sum += input;
//    } while (input != 0);
//
//    System.out.println("Sum = " + sum);

    // Random 2 số nguyên --> hỏi người dùng trả lời tổng 2 số đó --> chương trình kết thúc khi trả lời đúng
    Random random = new Random();
    int a = random.nextInt(10);
    int b = random.nextInt(10);
    System.out.println(a+b);
    Scanner scanner = new Scanner(System.in);
    int guessNumber;
    do {
      System.out.println("Enter the number: ");
      guessNumber = scanner.nextInt();
    } while (guessNumber != a + b);
    System.out.println("Correct!");
  }
}
