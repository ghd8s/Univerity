import java.util.Scanner;

public class P1014 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int X = s.nextInt();
        double Y = s.nextDouble();
        double avg= X/Y;
        System.out.printf("%.3f km/l\n", avg);
        s.close();
    }
    
}
