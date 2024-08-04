package entities_Exercicio_Resolvido_02;

import enums_Exercicio_Resolvido_02.Colors;

public class Rectangle extends AbstractShape {

	private Double width;
	private Double height;

	public Rectangle(Colors color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

}
