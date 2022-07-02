import java.util.Scanner;

public class P1043 {

    public static void main(String[] args) {
        var s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        s.close();
        if (a < b + c && b < a + c && c < a + b){
            double perimeter = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimeter);
        } else {
            double area = (a + b)/2 * c;
            System.out.printf("Area = %.1f\n", area);
        }
    } 
}
