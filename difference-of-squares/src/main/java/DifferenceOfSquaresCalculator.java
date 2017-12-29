class DifferenceOfSquaresCalculator {

	int computeSquareOfSumTo(int input) {
		int sum = 0;
		for (int i = input; i > 0; i--) {
			sum += i;
		}
		// cast to int because of Math.pow returns a double
		return (int)Math.pow(sum, 2);
	}

	int computeSumOfSquaresTo(int input) {
		int sum = 0;
		for (int i = input; i > 0; i--) {
			sum += (int)Math.pow(i, 2);
		}
		return sum;
	}

	int computeDifferenceOfSquares(int input) {
		return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
	}

}
