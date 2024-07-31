package application_Secao_9_Exercicio_Resolvido_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities_Secao_9_Exercicio_Resolvido_02.Comment;
import entities_Secao_9_Exercicio_Resolvido_02.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");

		Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Treaveling to New Zeland",
				"I'm going to visit this wonderful country!", 12);

		post1.addComment(c1);
		post1.addComment(c2);

		Comment c3 = new Comment("Good night!");
		Comment c4 = new Comment("May the 4th be with u!");

		Post post2 = new Post(sdf.parse("28/07/2018 21:14:37"), "Good night guys", "See u tomorrow", 5);
		post2.addComment(c3);
		post2.addComment(c4);

		System.out.println(post1);
		System.out.println(post2);
	}

}
