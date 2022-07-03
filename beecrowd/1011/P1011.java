import java.util.Scanner;

public class P1011 {
    
    final static double PI = 3.14159;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        double VOLUME = Math.pow(r, 3) * PI * (4.0 / 3);
        System.out.printf("VOLUME = %.3f\n", VOLUME);
        s.close();
    }
}
