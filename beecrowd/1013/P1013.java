import java.util.Scanner;

public class P1013 {
    public static int maiorAB(int A, int B){
        return (A + B + Math.abs(A-B))/2;
    }
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        int maiorXY = maiorAB(x,y);
        int maiorXYZ = maiorAB(maiorXY,z);
        System.out.printf("%d eh o maior\n", maiorXYZ);
        s.close();
    }
    
}
