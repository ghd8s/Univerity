import java.util.Scanner;
public class P1046 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        s.close();
        int h = start;
        int totalHours = 0;
        if (start != end){   
            while(h != end){
                if (h == 24){
                    h = 0;
                }
                h++;
                totalHours++;
            }    
        } else totalHours = 24;
        //totalHours = 24 - (start - end) % 24;
        System.out.printf("O JOGO DUROU %d HORA(S)\n",totalHours);
    }
}
