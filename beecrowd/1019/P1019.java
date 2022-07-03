import java.util.Scanner;
public class P1019 {
	public static void main(String[] args){
		var s = new Scanner(System.in);
		int n = s.nextInt();
		int h = n/3600;
		int m = n%3600/60;
		int sec = n%60;
		System.out.printf("%d:%d:%d\n", h,m,sec);
		s.close();
	}
}