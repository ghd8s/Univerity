import java.util.Scanner;

public class P1005 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        double A = s.nextDouble() * 3.5;
        double B = s.nextDouble() * 7.5;
        s.close();
        double MEDIA = (A + B) / 11;
        System.out.printf("MEDIA = %.5f\n", MEDIA);     
    }
}