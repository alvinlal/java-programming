// 18. Write a program to implement heirarchical inheritance.

class q18 {
    public static void main(String args[]) {

        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        D obj4 = new D();

        obj1.methodA();
        obj2.methodB();
        obj3.methodC();
        obj4.methodD();
    }
}

class A {
    public void methodA() {
        System.out.println("method of Class A");
    }
}

class B extends A {
    public void methodB() {
        System.out.println("method of Class B");
    }
}

class C extends A {
    public void methodC() {
        System.out.println("method of Class C");
    }
}

class D extends A {
    public void methodD() {
        System.out.println("method of Class D");
    }
}
