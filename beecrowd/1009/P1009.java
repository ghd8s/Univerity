import java.util.Scanner;

public class P1009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        double sal = s.nextDouble();
        double sale = s.nextDouble();
        double TOTAL = sal+sale*0.15;
        System.out.printf("TOTAL = R$ %.2f\n",TOTAL);
        s.close();  
    }    
}
