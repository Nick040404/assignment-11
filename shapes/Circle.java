// shapes/Circle.java
package shapes;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    public void resize(int scale) {
        this.radius *= scale;
    }
}
