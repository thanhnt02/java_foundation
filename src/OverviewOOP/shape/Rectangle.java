package OverviewOOP.shape;

public class Rectangle {
    int length;
    int width;

    static int count;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static void showInfo(Rectangle rect) {
        System.out.println("Length: " + rect.length);
        System.out.println("Length: " + rect.width);
    }
}
