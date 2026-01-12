package variable;

import java.util.Scanner;

public class StringVariable {
    public static void main(String[] args) {
//        String s = "hello";
//        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hi %s\n", name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.printf("%s is %d", name, age);
    }
}
