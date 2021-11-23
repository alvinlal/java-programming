// 12. Write a program to demonstrate method override.
class q12 {
    public static void main(String args[]) {
        SBI s = new SBI();
        ICIC i = new ICIC();
        AXIS a = new AXIS();

        System.out.println("SIB rate of interest =" + s.getrateofinterest());
        System.out.println("ICIC rate of interest =" + i.getrateofinterest());
        System.out.println("AXIS rate of interest =" + a.getrateofinterest());
    }
}

class Bank {
    int getrateofinterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getrateofinterest() {
        return 8;
    }
}

class ICIC extends Bank {
    int getrateofinterest() {
        return 7;
    }
}

class AXIS extends Bank {
    int getrateofinterest() {
        return 9;
    }
}
