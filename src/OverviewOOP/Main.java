package OverviewOOP;

import OverviewOOP.shape.Rectangle;

public class Main {
    public static void main(String[] args) {
        Animal.count = 0;
        Animal animal = new Animal("Cat", 2);
        Animal.count++;
//        animal.name = "Dog";
        Animal animal1 = new Animal("Cat2", 2);
        Animal.count++;

        Animal animal2 = new Animal("Cat2", 2);
        Animal.count++;

        System.out.println("Count: " + Animal.count);

        Animal.showInfo(animal);

//        animal.eat();

        Rectangle rect = new Rectangle(10, 20);
        Rectangle.showInfo(rect);
    }
}
