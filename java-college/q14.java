// 14. To demonstrate the use of super keyword
class ABC {
    public void Mymethod() {
        System.out.println("in abc");
    }
}

class XYZ extends ABC {
    public void Mymethod() {
        super.Mymethod();
        System.out.println("in xyz");
    }
}

class person {
    person() {
        System.out.println("person class constructor");
    }
}

class student extends person {
    student() {
        super();
        System.out.println("student class constructor");
    }
}

class vehicle {
    int maxspeed = 120;

    public int maxspeed() {
        return maxspeed;
    }
}

class car extends vehicle {
    int maxspeed = 180;

    void display() {
        System.out.println("maximum speed=" + super.maxspeed());
    }
}

class q14 {
    public static void main(String args[]) {

        student s = new student();
        XYZ obj = new XYZ();
        obj.Mymethod();
        car c = new car();
        c.display();
    }
}