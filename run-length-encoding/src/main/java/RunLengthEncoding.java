class RunLengthEncoding {

	public static String encode(String input) {
		StringBuilder output = new StringBuilder();
		char first = '0';
		int count = 1;

		for (char next : input.toCharArray())
			if (first == next)
				count++;
			else {
				output.append(count > 1 ? Integer.toString(count) + first : first);
				count = 1;
				first = next;
			}

		return output.append(count > 1 ? Integer.toString(count) + first : first).deleteCharAt(0).toString();
	}

	public static String decode(String input) {
		StringBuilder output = new StringBuilder();
		String prefix = "";

		for (char c : input.toCharArray())
			if (Character.isDigit(c))
				prefix += c;
			else {
				int runLength = prefix.equals("") ? 1 : Integer.valueOf(prefix);
				while (runLength-- > 0)
					output.append(c);
				prefix = "";
			}

		return output.toString();
	}

}
