class LargestSeriesProductCalculator {

	private String inputNumber;

	LargestSeriesProductCalculator(String inputNumber) {

		if (inputNumber == null)
			throw new IllegalArgumentException("String to search must be non-null.");

		for (char c : inputNumber.toCharArray())
			if (!(Character.isDigit(c)))
				throw new IllegalArgumentException("String to search may only contain digits.");

		this.inputNumber = inputNumber;
	}

	long calculateLargestProductForSeriesLength(int numberOfDigits) {
		if (numberOfDigits > inputNumber.length())
			throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");

		if (numberOfDigits < 0)
			throw new IllegalArgumentException("Series length must be non-negative.");

		long largest = 0L;

		// iterate through each grouping of digits
		for (int i = numberOfDigits; i <= inputNumber.length(); i++) {

			// find the product of the group of digits
			long product = 1L;
			for (int n = numberOfDigits; n > 0; n--)
				product *= Character.getNumericValue(inputNumber.charAt(i - n));

			// keep track of the largest product
			if (product > largest)
				largest = product;

		}

		return largest;
	}

}
