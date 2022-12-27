import java.awt.*;
import java.awt.geom.Area;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double Area;
        return Area = radius * radius * Math.PI;

    }
        public String getColor()
        {
          return color;
        }


}