/*
 * Programa que implementa uma reserva de quartos utilizando vetores de classes
 */
package application_Secao_10_Exercicio_Fixacao_01;

import java.util.Locale;
import java.util.Scanner;

import entity_Secao_10_Exercicio_Fixacao_01.RentRooms;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		RentRooms[] room = new RentRooms[10];

		System.out.print("How many rooms will be rented?");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.println("Room: ");
			int choosenRoom = sc.nextInt();

			room[choosenRoom] = new RentRooms(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if(room[i] != null) {
				System.out.println(i + ": " + room[i]);
			}
		}

		sc.close();
	}

}
