// 17. Write a program to implement multilevel inheritance.

class q17 {
    public static void main(String args[]) {
        thirdclass obj = new thirdclass();
        obj.display();
    }
}

class firstclass {
    int i;
    int j;

    void get(int p, int q) {
        i = p;
        j = q;
    }
}

class secondclass extends firstclass {
    int k;

    void get_seond(int m) {
        k = m;
    }
}

class thirdclass extends secondclass {
    int z;

    void get_third(int c) {
        z = c;
    }

    void display() {
        System.out.println("superclass i:" + i);
        System.out.println("superclass j:" + j);
        System.out.println("superclass k:" + k);
        System.out.println("subclass z:" + z);
    }
}
