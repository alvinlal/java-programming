// 11a. Write a program to demonstrate method overloading.

class shapes {
    void area(int a) {
        System.out.println("area of a square is " + (a * a));
    }

    void area(int a, int b) {
        System.out.println("area of a rectangle is " + (a * b));
    }
}

class mloading1 {
    public static void main(String args[]) {
        shapes s = new shapes();
        s.area(5);
        s.area(5, 10);
    }
}