package JAVA.certificate_example;

class Person {
    private String name;
    public Person(String val) {
        name = val;
    }

    public String get() {
        return name;
    }

    public void print() {
        System.out.println(name);
    }
}

public class J26 {
    public static void main(String[] args) {
        Person obj = new Person("Kim");
        obj.print();
    }
}
