import java.util.Scanner;
public class P1060 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        double input[] = new double[6];
        input[0] = s.nextDouble();
        input[1] = s.nextDouble();
        input[2] = s.nextDouble();
        input[3] = s.nextDouble();
        input[4] = s.nextDouble();
        input[5] = s.nextDouble();
        s.close();
        int positivos = 0;
        for (double e : input){
            if (e > 0){
                positivos++;
            }
        }
        System.out.println(positivos +" valores positivos");
    }   
}
