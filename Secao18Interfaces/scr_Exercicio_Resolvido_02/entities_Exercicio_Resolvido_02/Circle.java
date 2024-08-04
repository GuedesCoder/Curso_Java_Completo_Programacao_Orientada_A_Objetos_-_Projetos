package entities_Exercicio_Resolvido_02;

import enums_Exercicio_Resolvido_02.Colors;

public class Circle extends AbstractShape {

	private Double radius;

	public Circle(Colors color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return 3.1415 * Math.pow(radius, 2);
	}

}
