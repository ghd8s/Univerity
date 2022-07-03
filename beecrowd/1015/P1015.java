import java.util.Scanner;

public class P1015 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        double x1 = s.nextDouble();
        double y1 = s.nextDouble();

        double x2 = s.nextDouble();
        double y2 = s.nextDouble();
        double D = Math.abs(x2-x1)+Math.abs(y2-y1);
        System.out.printf("%.4f",D);
        s.close();
    }
    
}
