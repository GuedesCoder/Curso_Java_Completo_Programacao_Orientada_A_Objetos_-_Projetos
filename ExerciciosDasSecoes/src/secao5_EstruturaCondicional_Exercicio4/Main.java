package secao5_EstruturaCondicional_Exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int totalHoras = 0;

		if (horaInicial > horaFinal) {
			totalHoras = (24 - horaInicial) + horaFinal;
			System.out.println("O jogo durou " + totalHoras + " hora(s)");
		} else if (horaInicial == horaFinal) {
			totalHoras += 24;
			System.out.println("O jogo durou " + totalHoras + " hora(s)");
		} else {
			totalHoras = horaFinal - horaInicial;
			System.out.println("O jogo durou " + totalHoras + "hora(s)");
		}
		sc.close();
	}
}