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

class Demo {
    public static void main(String args[]) {
        XYZ obj = new XYZ();
        obj.Mymethod();
    }
}