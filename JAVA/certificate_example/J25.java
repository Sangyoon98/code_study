package JAVA.certificate_example;

class Car implements Runnable {
    int a;

    public void run() {
        System.out.println("message");
    }
}

public class J25 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Car());
        t1.start();
    }
}
