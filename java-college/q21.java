// 21. Write a program to implement abstract and concrete classes.

abstract class MyClass {
    public void disp() {
        System.out.println("Concrete method of parent class");
    }

    abstract public void disp2();
}

class Demo extends MyClass {
    public void disp2() {
        System.out.println("Overiding abstract method");
    }

}

public class q21 {
    public static void main(String args[]) {
        Demo d = new Demo();
        d.disp();
        d.disp2();
    }
}
