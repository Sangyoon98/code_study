package JAVA.certificate_example;

class Parent {
    int x = 1000;

    Parent() {
        this(30000);
    }

    Parent(int x) {
        this.x = x;
    }
}

class Child extends Parent {
    int x = 4000;

    Child() {
        this(5000);
    }

    Child(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}

public class J12 {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.getX());
    }
}
