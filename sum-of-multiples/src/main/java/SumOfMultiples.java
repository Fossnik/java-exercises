import java.util.List;
import java.util.ArrayList;

class SumOfMultiples {

	private int sum = 0;

	// avoid summing the same number twice with this array
	ArrayList<Integer> multiples = new ArrayList<Integer>();

	SumOfMultiples(int number, int[] set) {

		for (int numerator = 1; numerator < number; numerator++) {
			for (int denominator : set) {

				if (numerator % denominator == 0 && multiples.indexOf(numerator) == -1) {
					multiples.add(numerator);
					sum += numerator;
				}

			}
		}

	}

	int getSum() {
		return sum;
	}

}
