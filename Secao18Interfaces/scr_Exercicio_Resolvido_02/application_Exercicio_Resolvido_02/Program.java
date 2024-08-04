package application_Exercicio_Resolvido_02;

import java.util.Locale;

import entities_Exercicio_Resolvido_02.AbstractShape;
import entities_Exercicio_Resolvido_02.Circle;
import entities_Exercicio_Resolvido_02.Rectangle;
import enums_Exercicio_Resolvido_02.Colors;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		AbstractShape shape1 = new Circle(Colors.GREEN, 2.0);
		AbstractShape shape2 = new Rectangle(Colors.ORANGE, 3.0, 4.0);
		
		System.out.println("Circle color: " + shape1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", shape1.area()));
		System.out.println("Rectangle color: " + shape2.getColor( ));
		System.out.println("Rectangle area: " + String.format("%.3f", shape2.area()));
	}

}
