class IsbnVerifier {

	boolean isValid(String stringToVerify) {
		int checkdigit = 10, sum = 0;

		for (char c : stringToVerify.toCharArray())
			if (Character.isDigit(c))
				sum += Character.getNumericValue(c) * checkdigit--;
			else if (c == 'X')
				sum += 10;

		return sum % 11 == 0;
	}

}
