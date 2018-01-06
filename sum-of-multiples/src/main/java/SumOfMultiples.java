class SumOfMultiples {

	int sum = 0;

	SumOfMultiples(int number, int[] set) {

		for (int i = 1; i < number; i++) {

			if (i % 3 == 0 || i % 5 == 0)
				sum++;

		}

	}

	int getSum() {
			return sum;
	}

}
