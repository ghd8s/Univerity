import java.util.Scanner;

public class P1021{

	public static void main(String[] args){
		var s = new Scanner(System.in);
		double input = s.nextDouble();
		int qntN[] = {0,0,0,0,0,0};
		double notas[] = {100.0,50.0,20.0,10.0,5.0,2.0};
		for (int i = 0; i < notas.length; i++) {
			while (input >= notas[i]) {
				input -= notas[i];
				qntN[i]++;
			}
			//if (input % notas[i] == 0){
			//	input = input-(input/notas[i])
			//}

		}
		int cem = 500%100
		int qntM[] = {0,0,0,0,0,0};
		double moedas[] = {1,0.5,0.25,0.10,0.05,0.01};
		for (int i = 0; i < moedas.length; i++) {
			while (input >= moedas[i]) {
				input -= moedas[i];
				qntM[i]++;
			}
		}
		int j = 0;
		System.out.printf("NOTAS:\n");
		for (int e : qntN){
			System.out.printf("%d nota(s) de R$ %.2f\n",e,notas[j]);
			j++;
		}
		j = 0;
		System.out.printf("MOEDAS:\n");
		for (int e : qntM){
			System.out.printf("%d moeda(s) de R$ %.2f\n",e,moedas[j]);
			j++;			
		}
	}
}