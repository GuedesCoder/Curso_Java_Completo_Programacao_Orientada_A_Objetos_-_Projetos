package secao6_EstruturasDeRepeticao_While_Exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha =sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		sc.close();
	}
}