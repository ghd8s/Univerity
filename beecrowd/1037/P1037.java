import java.util.Scanner;
public class P1037 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        double v = Double.parseDouble(s.nextLine());
        s.close();
        Object[][] intervals = { {"[",0,25,"]"},
                                {"(",25,50,"]"},
                                {"(",50,75,"]"},
                                {"(",75,100,"]"} };
        boolean ok = false;
        for (Object[] e : intervals){
            int inter1 = (int)e[1];
            int inter2 = (int)e[2];
            if (v >= inter1 && v <= inter2 && !ok){
                System.out.printf("Intervalo %s%d,%d%s\n",e[0],e[1],e[2],e[3]);
                ok = true;
            } 

        }
        if (!ok){
            System.out.println("Fora de intervalo");
        }
        
    }
  
}
