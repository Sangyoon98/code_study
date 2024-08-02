package JAVA.certificate_example;

class Parent {
    public void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public void show() {
        System.out.println("Child");
    }
}

public class J15 {
    public static void main(String[] args) {
        Parent pa = new Child();
        pa.show();
    }
}