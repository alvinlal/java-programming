// 22. Create an abstract class called Figure which contains 3 data members (length,bread and height).Include an abstract method to find the area of the figure.Figure class also contains a concrete method to read the data members and to display them.Derive 2 classes Rectangle & triangle from Figure and override area() to find the area of a rectangle and area of a triangle.

import java.io.*;

abstract class Figure {
    int length, breadth, height;

    abstract void area();

    void read() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length");
        length = Integer.parseInt(br.readLine());
        System.out.println("Enter the breadth");
        breadth = Integer.parseInt(br.readLine());
        System.out.println("Enter the height");
        height = Integer.parseInt(br.readLine());

    }

    void display() {
        System.out.println("Length is " + length);
        System.out.println("Breadth is " + breadth);
        System.out.println("Height is " + height);
    }
}

class Rectangle extends Figure {
    void area() {
        System.out.println("Area of rectangle is " + length * breadth);
    }
}

class Triangle extends Figure {
    void area() {
        System.out.println("Area of triangle is " + length * height / 2);
    }
}

public class q22 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        r.read();
        r.display();
        r.area();
        t.read();
        t.display();
        t.area();
    }
}
