import java.util.Scanner;
public class P1001 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();
        System.out.printf("X = %d\n", a+b);
    }
}