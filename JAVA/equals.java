package JAVA;

public class equals {
    public static void main(String[] args) {
        String text1 = new String("hello");
        String text2 = new String("hello");
        System.out.println(text1 == text2);
        System.out.println(text1.equals(text2));
    }
}
