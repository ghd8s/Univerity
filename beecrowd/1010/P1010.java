import java.util.Scanner;

public class P1010 {
     
    public static double total(String produto) {
        String[] array = produto.split(" ");
        int units = Integer.parseInt(array[1]);
        double unitPrice = Double.parseDouble(array[2]);
        double total = units * unitPrice;
        return total;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String prod1 = s.nextLine();
        String prod2 = s.nextLine();
        double TOTAL = total(prod1) + total(prod2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", TOTAL);
        s.close();
    }
}
