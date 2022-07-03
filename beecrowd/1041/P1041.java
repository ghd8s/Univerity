import java.util.Scanner;
public class P1041 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = s.nextDouble();
        if (x == 0 && y == x){
            System.out.println("Origem");
        } else if (x == 0){
            System.out.println("Eixo Y");
        } else if (y == 0){
            System.out.println("Eixo X");
        }
        if (x > 0 && y < 0){
            System.out.println("Q4");
        }else if(x > 0 && y > 0){
            System.out.println("Q1");
        }else if(x < 0 && y > 0){
            System.out.println("Q2");
        }else if(x < 0 && y < 0){
            System.out.println("Q3");
        }
        s.close();
    }    
}
