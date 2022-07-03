import java.util.Scanner;
public class P1017{
	static final double KM_L = 12.0;
	public static void main(String[] args){
		var s = new Scanner(System.in);
		int hours = s.nextInt();
		int avgSp = s.nextInt();
		double d = avgSp*hours;
		double fuelSpent = d/KM_L;
		System.out.printf("%.3f\n", fuelSpent);
	}
}