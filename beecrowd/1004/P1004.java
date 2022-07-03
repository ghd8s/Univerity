import java.util.Scanner;

public class P1004 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int prod = a * b;
        System.out.printf("PROD = %d", prod);
        s.close();
    }
}