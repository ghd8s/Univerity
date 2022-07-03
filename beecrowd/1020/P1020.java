import java.util.Scanner;
public class P1020{
	public static void main(String[] args){
		var s = new Scanner(System.in);
		int d = s.nextInt();
		int ano = d/365;
		int mes = (d % 365)/30;
		int dia = (d % 365) % 30;
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",ano,mes,dia);
		s.close();
	}
}