import java.util.Scanner;

public class P1008 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int workHours = s.nextInt();
        double sal = s.nextDouble()*workHours;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n",num,sal);
        s.close();
    }    
}
