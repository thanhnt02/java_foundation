package loopAndFunctions;

public class Homework {
  public static boolean isPrimeNumber(int number) {
    if (number <= 0 || number == 1) {
      return false;
    }
    if (number == 2) {
      return true;
    }
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
      ;
    }
    return true;
  }

  public static void main(String[] args) {
    // Tìm ước chung lớn nhất của hai số tự nhiên
//    Scanner scanner = new Scanner(System.in);
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//    if (a == 0 || b == 0) {
//      System.out.println("UCLN là: " + Math.abs(a + b));
//      return;
//    }
//    while (a != b) {
//      if (a > b) a-= b;
//      else b -= a;
//    }
//    System.out.println(b);

    // Tìm số palindrome
//    Scanner scanner = new Scanner(System.in);
//    String s = scanner.nextLine();
//    int i = 0, j = s.length() - 1;
//    while (i < s.length()/2) {
//      if (s.charAt(i) != s.charAt(j)){
//        System.out.println(false);
//        return;
//      } else {
//        i++;
//        j--;
//      }
//    }
//    System.out.println(true);

    // In ra 50 số nguyên tố đầu tiên
    int count = 0;
    int number = 0;
    while (count <= 50) {
      if (isPrimeNumber(number)) {
        System.out.print(number + " ");
        count++;
        number++;
      } else number++;
    }
  }
}
