package srcSecao20StreamApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Integer> intList = Arrays.asList(3, 6, 9, 12, 15, 18, 21, 24, 27, 30);

		Stream<Integer> st1 = intList.stream().map(x -> x * 10);
		System.out.println("Multiplicando itens do vetor por 10");
		System.out.println(Arrays.toString(st1.toArray()));

		System.out.println();
		System.out.println("Somando todos itens do vetor");
		int sum = intList.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum: " + sum);

		System.out.println();
		System.out.println("Utilizando streams intermediarios combinados (filter e map)");
		List<Integer> newList = intList.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 7)
				.collect(Collectors.toList());

		System.out.println(Arrays.toString(newList.toArray()));

	}
}
