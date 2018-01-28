import java.util.Set;
import java.util.HashSet;

class SumOfMultiples {

	private int sum = 0;

	// avoid summing the same number twice using this HashSet (hashset implies non-duplication)
	Set<Integer> multiples = new HashSet<Integer>();

	SumOfMultiples(int number, int[] set) {

		for (int numerator = 1; numerator < number; numerator++)
			for (int denominator : set)
				if (numerator % denominator == 0)
					multiples.add(numerator);

		for (int i : multiples)
			sum+=i;
	}

	int getSum() {
		return sum;
	}

}
