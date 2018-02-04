class CollatzCalculator {

	int computeStepCount(int start) {

		if (start < 1) new IllegalArgumentException("Only natural numbers are allowed");

		int steps = 0;
		for (int n = start; n != 1; steps++)
			if (n % 2 == 0) n = n / 2;
			else n = n * 3 + 1;

		return steps;
	}

}
