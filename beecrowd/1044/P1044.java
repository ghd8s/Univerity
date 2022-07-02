import java.util.Scanner;

public class P1044{
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();
        int maior;
        int menor;
        if (a > b){
            maior = a;
            menor = b;
        }else{
            maior = b;
            menor = a;
        }
        if (maior%menor == 0){
            System.out.println("Sao Multiplos");
        } else System.out.println("Nao sao Multiplos");
    }
}