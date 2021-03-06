class CollatzCalculator {

	int computeStepCount(int n) {

		if (n < 1)
			throw new IllegalArgumentException("Only natural numbers are allowed");

		for (int steps = 0; n != 1; steps++)
			if (n % 2 == 0)
				n = n / 2;
			else
				n = n * 3 + 1;

		return steps;
	}

}
