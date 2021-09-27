package Lab_2;

import java.lang.Math;


public class Circle {

    private double radius;
    private double length;
    private String color;

    public Circle(double r, String c)  {
        radius = r;
        length = 2 * r * Math.PI;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double r) {
        radius = r;
        length = 2 * Math.PI * r;
    }

    public void setLength(double l) {
        length = l;
        radius = l / (2 * Math.PI);
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", length=" + length +
                ", color='" + color + '\'' +
                '}';
    }
}
