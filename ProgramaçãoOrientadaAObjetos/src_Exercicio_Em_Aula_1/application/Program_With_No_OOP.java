package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_With_No_OOP {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[] X = new double[3];
		double[] Y = new double[3];

		System.out.println("Enter the measures for X Triangle:");
		for (int i = 0; i <= 2; i++) {
			X[i] = sc.nextDouble();
		}

		System.out.println("Enter the measures for Y Triangle:");
		for (int i = 0; i <= 2; i++) {
			Y[i] = sc.nextDouble();
		}

		double p = (X[0] + X[1] + X[2]) / 2;
		double areaX = Math.sqrt(p * (p - X[0]) * (p - X[1]) * (p - X[2]));

		p = (Y[0] + Y[1] + Y[2]) / 2;
		double areaY = Math.sqrt(p * (p - Y[0]) * (p - Y[1]) * (p - Y[2]));

		System.out.printf("Triangle X has area of: %.4f\n", areaX);
		System.out.printf("Triangle Y has area of: %.4f\n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger is X triangle");
		} else if (areaX < areaY) {
			System.out.println("Larger is Y triangle");
		} else {
			System.out.println("Both triangles has the same area");
		}
		sc.close();
	}
}