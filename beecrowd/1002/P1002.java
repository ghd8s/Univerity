import java.util.Scanner;

public class P1002 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        final double PI = 3.14159;
        System.out.printf("A=%.4f\n",PI*Math.pow(r,2));
        s.close();
    }
}