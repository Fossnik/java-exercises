class IsbnVerifier {

	boolean isValid(String stringToVerify) {
		int checkdigit = 10, sum = 0;

		for (char c : stringToVerify.toCharArray())
			if (Character.isDigit(c))
				sum += Character.getNumericValue(c) * checkdigit--;

		return sum % 11 == 0;
	}

}
