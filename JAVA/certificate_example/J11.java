package JAVA.certificate_example;

public class J11 {
    public static void main(String[] args) {
        J11 a1 = new J11();
        Ovr2 a2 = new Ovr2();
        System.out.println(a1.sun(3, 2) + a2.sun(3, 2));
    }

    int sun (int x, int y) {
        return x + y;
    }
}

class Ovr2 extends J11 {
    int sun (int x, int y) {
        return x - y + super.sun(x, y);
    }
}
