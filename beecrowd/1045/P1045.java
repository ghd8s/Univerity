import java.util.Scanner;
public class P1045 {

    static double[] sortInput(double a, double b, double c){
        double[] arr = {a,b,c};
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){

                if (arr[j] < arr[j+1]){
                    double aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
        return arr;
    }   
    public static void main(String[] args) {
        var s  =  new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        s.close();
        double sortedIn[] = sortInput(a,b,c);
        a = sortedIn[0];
        b = sortedIn[1];
        c = sortedIn[2];
        boolean trRet = Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2);    
        boolean trOb = Math.pow(a,2) > Math.pow(b,2) + Math.pow(c,2);       
        boolean trAc = Math.pow(a,2) < Math.pow(b,2) + Math.pow(c,2);
        boolean trEq = a == b && b == c;    
        boolean trIs = (a == b && a != c) || (a == c && a != b) || (b == c && b != a);
        if(a >= b + c) System.out.println("NAO FORMA TRIANGULO");
        else {
            if(trRet) System.out.println("TRIANGULO RETANGULO");
            if(trOb) System.out.println("TRIANGULO OBTUSANGULO");
            if(trAc) System.out.println("TRIANGULO ACUTANGULO");          
            if(trEq) System.out.println("TRIANGULO EQUILATERO");
            if (trIs) System.out.println("TRIANGULO ISOSCELES");
        }       
    }    
}
