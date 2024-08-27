package srcSecao20ExercicioResolvidoStreamApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import srcSecao20ExercicioResolvidoStreamEntities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// pede o caminho de um arquivo existente
		System.out.print("Enter the file path: ");
		String path = sc.nextLine();
		System.out.println();

		// bloco try com resource que lê esse arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// instanciado uma lista de produtos para armazenar os produtos.
			List<Product> products = new ArrayList<>();
			String line = br.readLine();
			/*
			 * Enquanto houver linhas, é adicionado ao vetor fields dois elementos por
			 * linha. Cada linha está sendo dividida por virgula, onde no elemento 0 do
			 * vetor são inseridos os nomes dos produtos e no elemento 1 são inseridos os
			 * preços dos produtos.
			 */
			while (line != null) {
				String[] fields = line.split(",");
				products.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}

			// avg = variavel que vai conter a média dos produtos
			double avg = products.stream() // converte a lista de produtos em um stream
					.map(p -> p.getPrice()) // novo stream que pega o preço de cada produto (le-se: "para cada produto p retorne o preço")
					.reduce(0.0, (x, y) -> x + y) / products.size(); /* função reduce realiza a soma dos preços de todos os elementos  
																		da lista a partir do valor inicial indicado no 1º parametro e 
																		então é aplicada a somatoria de x, y levando a x + y e ao 
																		fim divide pelo tamanho da lista (número de produtos)*/
			System.out.println("Average price: R$" + String.format("%.2f", avg));
			System.out.println();

			//comparador de string que verifica se as Strings são iguais ou diferentes ignorando o case
			Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			//Lista que ordena os itens em ordem decrescente
			List<String> names = products.stream()
					.filter(p -> p.getPrice() < avg) // filtra todos os produtos que tem preço inferior a media (variável avg)
					.map(p -> p.getName()) //pega os nomes de todos os produtos resultantes do filter acima
					.sorted(comparator.reversed()) // ordena os nomes em ordem decresente
					.collect(Collectors.toList()); // transforma a stream em lista de volta.

			names.forEach(System.out::println);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
