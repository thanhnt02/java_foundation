package OverviewOOP;

class Animal {

    static int count;

    String name;

    int age;

    Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println("Eating...");
    }

    static void showInfo(Animal animal) {
        System.out.println("Name: " + animal.name);
    }
}
