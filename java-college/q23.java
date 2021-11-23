//23. Write a program to implement interface.

interface sport {
    int s = 20;

    public void calc();
}

class student {
    int rollno, mark1, mark2, mark3;
    String name;

    student(String n, int r, int a, int m, int m2, int m3) {
        name = n;
        rollno = r;
        age = a;
        mark1 = m;
        mark2 = m2;
        mark3 = m3;
    }

    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("Age: " + age);
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
    }

}

class marks extends student implements sport {
    marks(String n, int r, int a, int m1, int m2, int m3) {
        super(n, r, a, m1, m2, m3);
    }

    public void calc() {
        int mark = (mark1 + mark2 + mark3);
        int total = mark;
        System.out.println("Total: " + total);
    }

    void display() {
        super.display();
    }
}

public class q23 {
    public static void main(String[] args) {
        marks m = new marks("Raj", 1, 20, 20, 20, 20);
        m.display();
        m.calc();
    }
}
