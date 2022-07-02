import java.util.Scanner;
public class P1038 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        s.close();
        switch (x) {
            case 1:
                System.out.printf("Total: R$ %.2f\n", y*4.0);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", y*4.5);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", y*5.0);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", y*2.0);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n", y*1.5);
                break;
            default:
                break;
        }
    }
    
}
