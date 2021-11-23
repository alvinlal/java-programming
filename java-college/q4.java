// 4. Write a program to find the area of a rectangle using classes and objects.

public class q4 {
    public static void main(String[] args) {
        int area1, area2;
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();
        r1.length = 15;
        r1.breadth = 10;
        area1 = r1.length * r1.breadth;
        System.out.println("area1=" + area1);
        r2.getdata(20, 10);
        area2 = r2.rectarea();
        System.out.println("area2=" + area2);
    }
}

class rectangle {
    int length, breadth;

    void getdata(int x, int y) {
        length = x;
        breadth = y;
    }

    int rectarea() {
        int area = length * breadth;
        return area;
    }
}
