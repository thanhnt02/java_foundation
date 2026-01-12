package variable;

//Nhập tên, giá, số lượng 3 sản phẩm
//tính trung bình 3 sản phâm
//tính tổng số tiên của đơn hàng

import java.util.Scanner;

public class HomeWork {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter name of package 1: ");
    String namePackage1 = scanner.nextLine();
    System.out.print("Enter price of package 1: ");
    int pricePackage1 = scanner.nextInt();
    System.out.print("Enter quantity of package 1: ");
    int quantityPackage1 = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter name of package 2: ");
    String namePackage2 = scanner.nextLine();
    System.out.print("Enter price of package 2: ");
    int pricePackage2 = scanner.nextInt();
    System.out.print("Enter quantity of package 2: ");
    int quantityPackage2 = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter name of package 3: ");
    String namePackage3 = scanner.nextLine();
    System.out.print("Enter price of package 3: ");
    int pricePackage3 = scanner.nextInt();
    System.out.print("Enter quantity of package 3: ");
    int quantityPackage3 = scanner.nextInt();

    System.out.printf("Average Price: %f\n", (1D * pricePackage1 * quantityPackage1 + pricePackage2 * quantityPackage2 + pricePackage3 * quantityPackage3) / 3);
    System.out.printf("Price: %d", ((long) pricePackage1 * quantityPackage1 + (long) pricePackage2 * quantityPackage2 + (long) pricePackage3 * quantityPackage3));
  }
}
