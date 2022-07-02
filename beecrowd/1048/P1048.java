import java.util.Scanner;
/**
 * 0 - 400.00            *  15%
 * 400.01 - 800.00       *  12%
 * 800.01 - 1200.00      *  10%
 *1200.01 - 2000.00      *  7%
 *Above 2000.00          *  4%
 Novo salario: 460.00
 Reajuste ganho: 60.00
 Em percentual: 15 %
 */
public class P1048 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        double sal = s.nextDouble();
        s.close();
        double newSal = 0;
        double earned = 0;
        double percentage = 0;
        double table[][] = {{2000.0,4.0},{1200.0,7.0},{800.0,10.0},{400.0,12.0},{0,15.0}};
        for (double[] i : table){
            double perc = i[1];
            if (sal > i[0]){
                newSal = sal*perc/100+sal;
                earned = sal*perc/100;
                percentage = perc;
                break;
            }
        }
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %.0f %s\n",newSal,earned,percentage,"%");
    }
    
}
