package studio7;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive numbers");
        }
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public boolean isSmallerThan(Rectangle other) {
        return this.getArea() < other.getArea();
    }

    public boolean isSquare() {
        return length == width;
    }

    public String toString() {
        return String.format("Rectangle {length=%.2f, width=%.2f}", length, width);
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(3, 3);

        System.out.println(rect1);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        System.out.println("Is Square? " + rect1.isSquare());
        System.out.println("Is smaller than rect2? " + rect1.isSmallerThan(rect2));

        System.out.println();

        System.out.println(rect2);
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
        System.out.println("Is Square? " + rect2.isSquare());
        System.out.println("Is smaller than rect1? " + rect2.isSmallerThan(rect1));
    }
}
