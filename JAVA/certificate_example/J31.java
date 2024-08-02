package JAVA.certificate_example;

public class J31 {
    public static void main(String[] args) {
        int[][] a = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = j * 3 + (i + 1);
                System.out.println(a[i][j] + "");
            }
            System.out.println();
        }
    }
}
