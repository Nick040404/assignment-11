// shapes/Rectangle.java
package shapes;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    public void resize(int scale) {
        this.length *= scale;
        this.width *= scale;
    }
}