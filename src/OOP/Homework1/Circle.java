package OOP.Homework1;

public class Circle {
  int radius;
  Circle(int radius){
    this.radius = radius;
  }
  static void chuVi (Circle circle) {
    System.out.println("Chu vi hình tròn là: " + 2 * circle.radius * 3.14);
  }
  static void dienTich (Circle circle) {
    System.out.println("Diện tích hình tròn là: " + circle.radius * circle.radius * 3.14);
  }
}
