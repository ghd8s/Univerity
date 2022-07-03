import java.util.Scanner;

public class P1012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();
        double a = A * C / 2;
        double b = Math.pow(C, 2) * 3.14159;
        double c = ((A + B) * C) / 2;
        double d = Math.pow(B, 2);
        double e = A * B;
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", a, b, c, d, e);
        s.close();
    }    
}
