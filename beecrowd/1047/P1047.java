import java.util.Scanner;
public class P1047{
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int startH = s.nextInt();
        int startM = s.nextInt();
        int endH = s.nextInt();     
        int endM = s.nextInt();
        s.close();

        int totalHours = startH - endH;
        int totalMinuts = Math.abs(startM - endM);

        if (totalHours < 0){
            totalHours*=-1;
        }

        if (startM > endM){
            totalMinuts = 60 - totalMinuts;
            totalHours--;
        }
    
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",totalHours,totalMinuts);
    }
}