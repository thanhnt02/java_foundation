package OOP;

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal("Dog", 3);
    Animal.count++;
    Animal animal1 = new Animal("Dog1", 4);
    Animal.count++;
  }
}
