import java.util.Scanner;

public class P1050 {
    static void ddd(String input){
        switch(input){
            case "61":
                System.out.println("Brasilia");
                break;
            case "71":
                System.out.println("Salvador");
                break;
            case "11":
                System.out.println("Sao paulo");
                break;
            case "21":
                System.out.println("Rio de janeiro");
                break;
            case "32":
                System.out.println("Juiz de Fora");
                break;
            case "19":
                System.out.println("Campinas");
                break;
            case "27":
                System.out.println("Vitoria");
                break;
            case "31":
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        String num = s.nextLine();
        s.close();
        ddd(num);
    }
    
}
