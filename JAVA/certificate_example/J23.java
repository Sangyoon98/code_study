package JAVA.certificate_example;

public class J23 {
    public static void main(String[] args) {
        System.out.print(J23.check(1));
    }

    static String check(int num) {
        return (num >= 0) ? "positive" : "negative";
    }
}