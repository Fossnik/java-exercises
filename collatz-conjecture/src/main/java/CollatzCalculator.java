class CollatzCalculator {

	int computeStepCount(int start) {

		if (start < 1)
			throw new IllegalArgumentException("Only natural numbers are allowed");

		int steps = 0;
		int n = start;

		while (n != 1) {
			if (n % 2 == 0)
				n = n / 2;
			else
				n = n * 3 + 1;

			steps++;
		}

		return steps;
	}

}
