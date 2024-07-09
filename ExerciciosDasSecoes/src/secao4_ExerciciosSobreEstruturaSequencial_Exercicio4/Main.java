package secao4_ExerciciosSobreEstruturaSequencial_Exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double remuneracaoHora = sc.nextDouble();
		double salarioFuncionario = horasTrabalhadas * remuneracaoHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f\n", salarioFuncionario);
		
		sc.close();
	}
}