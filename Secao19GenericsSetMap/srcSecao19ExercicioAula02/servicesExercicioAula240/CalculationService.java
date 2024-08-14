package servicesExercicioAula240;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("The list can't be empty asshole");
		}
		T max = list.get(0);
		for(T listItem : list) {
			if(listItem.compareTo(max) > 0) {
				max = listItem;
			}
		}
		return max;
	}
}
