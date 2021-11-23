// 7. Write a program to implement single inheritance.

class q7 {
    public static void main(String args[]) {
        bedroom room1 = new bedroom(10, 10, 10);
        int area1 = room1.area();
        int volume1 = room1.volume();
        System.out.println("area= " + area1);
        System.out.println("volume= " + volume1);
    }
}

class room {
    int length, breadth;

    room(int x, int y) {
        length = x;
        breadth = y;
    }

    int area() {
        return (length * breadth);
    }
}

class bedroom extends room {
    int height;

    bedroom(int x, int y, int z) {
        super(x, y);
        height = z;
    }

    int volume() {
        return (length * breadth * height);
    }
}
