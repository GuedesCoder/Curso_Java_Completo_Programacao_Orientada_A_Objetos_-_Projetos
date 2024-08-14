package servicesExercicioAula239;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

	private List<Integer> prints = new ArrayList<>();
	
	public void addValue(int value) {
		prints.add(value);
	}
	
	public int first() {
		if(prints.isEmpty()) {
			throw new IllegalStateException("The list is empty");
		}
		return prints.get(0);
	}
	
	public void print() {
		System.out.println("[");
		if(!prints.isEmpty()) {
			System.out.println(prints.get(0));
		}
		for(int i = 0; i < prints.size(); i++) {
			System.out.println(", " + prints.get(i));
		}
		System.out.println("]");
	}
}
