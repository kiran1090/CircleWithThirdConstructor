import java.awt.*;
import java.awt.geom.Area;

public class Circle {
     double radius;
      String color;

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
// Setter for instance variable radius
     public void setRadius(double newRadius)
     {
         radius=newRadius;
     }
     // Setter for instance variable color
     public void setColor(String newColor)
     {
         color=newColor;
     }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
