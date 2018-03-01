class Atbash {

	public String encode(String input) {
		String remit = "";
		for (char c : input.toCharArray())
			if (Character.isAlphabetic(c))
				remit += switcheroo(c);
			else
				remit += c;

		return remit;
	}

	public String decode(String input) {
		return encode(input);
	}

	private char switcheroo(char input) {
		int zeroIndex = Character.toLowerCase(input) - 'a';
		return (char)(Character.isLowerCase(input) ? 'z' - zeroIndex : 'Z' - zeroIndex);
	}
}