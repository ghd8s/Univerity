import java.util.Scanner;
public class P1134{
	public static void main(String[] args){
		var s = new Scanner(System.in);
		int v = 0;
		int c = 1;
		String arr[] = {"Alcool: ","Gasolina: ","Diesel: "}
		do{
			v = s.nextInt();
			for (int i = 0; i <= arr.length; i++){
				System.out.printf("%s %d",arr[i], v);
			}
		} while (v = 4);
	}
}