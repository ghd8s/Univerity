import java.util.Scanner;
public class P1039 {

    // static double area(int raio){
    //     return Math.pow(raio,2) * Math.PI;
    // }
    
    static double dist(int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        while(s.hasNext()){
            String arr[] = s.nextLine().split(" ");
            int r1 = Integer.parseInt(arr[0]);
            int x1 = Integer.parseInt(arr[1]);
            int y1 = Integer.parseInt(arr[2]);
            int r2 = Integer.parseInt(arr[3]);
            int x2 = Integer.parseInt(arr[4]);
            int y2 = Integer.parseInt(arr[5]);

            if (r1-dist(x1,x2,y1,y2) >= r2){
                System.out.println("RICO");
            } else System.out.println("MORTO");
        }
        s.close();
    }
}
