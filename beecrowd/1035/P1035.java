import java.util.Scanner;
/**
 * if B is greater than C and 
 * D is greater than A and 
 * if the sum of C and D is greater than the sum of A and B and 
 * if C and D were positives values and 
 * if A is even
 */
public class P1035 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int D = s.nextInt();
        if (B > C && D > A && (C+D) > (A+B) && C > 0 && D > 0 && A%2 == 0){
                System.out.println("Valores aceitos");
        } else System.out.println("Valores nao aceitos");
        s.close();
    }    
}
