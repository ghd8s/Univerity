import java.util.Scanner;
public class P1113{
	public static void main(String[] args){
		var s = new Scanner(System.in);
		int x = 0;
		int y = 0;
		do {
			x = s.nextInt();
			y = s.nextInt();
			if (x<y) System.out.println("Crescente");
			else if (y<x) System.out.println("Decrescente");
		} while(x != y);
	}
}