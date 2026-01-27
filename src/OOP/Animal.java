package OOP;

class Animal {
  // thuộc tính (attributes)
  String name;
  int age;
  String gender;
  static int count;

  Animal() {

  }

  Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  Animal(String gender) {

  }

  // phương thức (methods)
  void eat() {
    System.out.println("Eating...");
  }
}
