// shapes/Shape.java
package shapes;

import utilities.Drawable;

public abstract class Shape implements Drawable {
    protected String color;
    public double PI = 3.1415;

    public Shape() {
        this.color = "unknown";
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}