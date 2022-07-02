import java.util.Scanner;
/**
 * Read 3 floating-point numbers. After, print the roots of bhaskara’s formula. 
 * If it's impossible to calculate the roots because a division by zero or a square root of a negative number, presents the message “Impossivel calcular”.

Input
Read 3 floating-point numbers (double) A, B and C.

Output
Print the result with 5 digits after the decimal point or the message if it is impossible to calculate.
 */
public class P1036 {
    static double[] bhaskara(double a, double b, double c){
        double delta = Math.sqrt(Math.pow(b,2)+(-4*a*c));
        double r1 = ((-b)+delta)/2*a;
        double r2 = ((-b)-delta)/2*a;
        double roots[] = {r1/100,r2/100};
        return roots;
    }
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        String input[] = s.nextLine().split(" ");
        double A = Double.parseDouble(input[0]);
        double B = Double.parseDouble(input[1]);
        double C = Double.parseDouble(input[2]);
        if ((A == 0) || (Math.pow(B,2) - 4 * A * C < 0)) {
			System.out.println("Impossivel calcular");
		} else System.out.printf("R1 = %.5f\nR2 = %.5f\n",bhaskara(A,B,C)[0],bhaskara(A,B,C)[1]);
        s.close();        
    }    
}
