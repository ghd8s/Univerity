import java.util.Scanner;

public class P1052 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int i = s.nextInt()-1;
        s.close();
        String months[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
        "Outubro", "Novembro", "Dezembro"};
        System.out.println(months[i]);
    }
}
