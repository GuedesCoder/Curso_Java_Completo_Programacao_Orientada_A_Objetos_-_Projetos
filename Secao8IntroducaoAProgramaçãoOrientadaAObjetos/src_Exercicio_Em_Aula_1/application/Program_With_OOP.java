package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program_With_OOP {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle X = new Triangle();
		Triangle Y = new Triangle();

		System.out.println("Enter the measures for X Triangle:");
		X.a = sc.nextDouble();
		X.b = sc.nextDouble();
		X.c = sc.nextDouble();

		System.out.println("Enter the measures for Y Triangle:");
		Y.a = sc.nextDouble();
		Y.b = sc.nextDouble();
		Y.c = sc.nextDouble();

		double areaX = X.area();
		double areaY = Y.area();

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