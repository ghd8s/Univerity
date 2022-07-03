import java.util.Scanner;
public class P1018{

	public static void main(String[] args){
		var s = new Scanner(System.in);
		int input = s.nextInt();
		int qntN[] = {0,0,0,0,0,0,0};
		double notas[] = {100,50,20,10,5,2,1};
		for (int i = 0; i < notas.length; i++) {
			while (input >= notas[i]) {
				input -= notas[i];
				qntN[i]++;
			}
		}
		int j = 0;
		System.out.printf("%d\n",input);
		for (int e: qntN){
			System.out.printf("%d nota(s) de R$ %.2f\n",e,notas[j]);
			j++;
		}
		s.close();
	}
}