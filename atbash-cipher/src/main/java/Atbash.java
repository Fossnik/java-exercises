class Atbash {

	public static String encode(String input) {
		String remit = "";
		int index = 0;
		for (char c : input.replaceAll("[^a-zA-Z0-9]", "").toCharArray()) {
			if (index != 0 && index % 5 == 0)
				remit += " ";

			if (Character.isLetterOrDigit(c)) {
				remit += switcheroo(c);
				index++;
			}
		}

		return remit;
	}

	public static String decode(String input) {
		String remit = "";
		for (char c : input.toCharArray())
			if (Character.isLetterOrDigit(c))
				remit += switcheroo(c);

		return remit;
	}

	private static char switcheroo(char input) {
		if (Character.isDigit(input))
			return input;

		int zeroIndex = Character.toLowerCase(input) - 'a';
		return (char)('z' - zeroIndex);
	}

}