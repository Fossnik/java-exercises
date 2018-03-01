class Atbash {

	public static String encode(String input) {
		String remit = "";
		int index = 0;
		for (char c : input.replaceAll("[^a-zA-Z0-9]", "").toCharArray()) {
			if (index != 0 && index % 5 == 0)
				remit += " ";

			if (Character.isAlphabetic(c)) {
				remit += switcheroo(c);
				index++;
			} else if (Character.isDigit(c)) {
				remit += c;
				index++;
			}
		}

		return remit;
	}

	public static String decode(String input) {
		String remit = "";
		for (char c : input.toCharArray())
			if (Character.isAlphabetic(c))
				remit += switcheroo(c);
			else if (Character.isDigit(c))
				remit += c;

		return remit;
	}

	private static char switcheroo(char input) {
		int zeroIndex = Character.toLowerCase(input) - 'a';
		return (char)('z' - zeroIndex);
	}

}