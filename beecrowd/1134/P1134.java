import java.util.Scanner;
public class P1134{
	public static void main(String[] args){
		var s = new Scanner(System.in);
		int v = 0;

		String fuel[]= {"Alcool: ","Gasolina: ","Diesel: "};
		int fuelCount[] = {0,0,0};

		do{
			v = s.nextInt();
			switch (v) {
				case 1:
					fuelCount[v-1]++;
					break;
				case 2:
					fuelCount[v-1]++;
					break;
				case 3:
					fuelCount[v-1]++;
					break;
				case 4:
					System.out.println("MUITO OBRIGADO");
					break;
				default:
					v = 0;
					break;
			}
			
		} while (v != 4);

		s.close();
		for (int i = 0; i < fuel.length; i++) {
			System.out.printf("%s%d\n",fuel[i],fuelCount[i]);
		}
	}
}