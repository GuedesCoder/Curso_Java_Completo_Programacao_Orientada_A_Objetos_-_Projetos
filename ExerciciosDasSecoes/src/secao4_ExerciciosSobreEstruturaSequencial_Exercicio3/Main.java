package secao4_ExerciciosSobreEstruturaSequencial_Exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int produtoAB = A * B;
		int produtoCD = C * D;
		
		int diferencaProdutos = produtoAB - produtoCD;
		
		System.out.println("Diferença = " + diferencaProdutos);
		
		sc.close();
	}

}
