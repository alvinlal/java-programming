// 8. write a program to implement constructor overloading

public class q8 {
    public static void main(String[] args) {
        cuboid c1 = new cuboid();
        cuboid c2 = new cuboid(2, 3, 4);
        c1.volume();
        c2.volume();
    }
}

class cuboid {
    int length, width, height;

    cuboid() {
        length = 20;
        width = 10;
        height = 10;
    }

    cuboid(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    void volume() {
        int peri = (length * width * height);
        System.out.println("Volume of cuboid is " + peri);
    }
}
