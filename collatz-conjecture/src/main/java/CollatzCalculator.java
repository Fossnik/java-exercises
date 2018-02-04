class CollatzCalculator {

	int computeStepCount(int start) {

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
