package entities_Exercicio_Resolvido_02;

import entities_Service_Exercicio_Resolvido_02.Shape;
import enums_Exercicio_Resolvido_02.Colors;

public abstract class AbstractShape implements Shape{

	private Colors color;

	public AbstractShape(Colors color) {
		this.color = color;
	}

	public Colors getColor() {
		return color;
	}

	public void setColor(Colors color) {
		this.color = color;
	}
}
