import java.util.Scanner;
public class P1051 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        double sal = s.nextDouble();
        s.close();
        double tax = 0;

        if (sal >2000 && sal <= 3000){
            tax += (sal - 2000) * 0.08;
        } else if (sal > 3000 && sal <= 4500) {
            tax += (sal - 3000) * 0.18 + 80;
        } else tax += (sal - 4500) * 0.28 + 350;

        if (tax == 0) System.out.println("Isento");
        else System.out.printf("R$ %.2f",tax);
    }
}
