class RunLengthEncoding {

	public static String encode(String input) {
		if (input.isEmpty())
			return "";
		else
			return compressText(input);
	}

	private static String compressText(String input) {
		StringBuilder output = new StringBuilder();
		char first = '0';
		int count = 1;

		for (char next : input.toCharArray())
			if (first == next) {
				count++;
			} else {
				output.append((count > 1 ? (Integer.toString(count) + first) : first));
				count = 1;
				first = next;
			}

		return output.append((count > 1 ? (Integer.toString(count) + first) : first)).deleteCharAt(0).toString();
	}

	public static String decode(String input) {
		StringBuilder output = new StringBuilder();
		int i = 0;
		while (!input.isEmpty()) try {
			String prefix = "";
			while (Character.isDigit(input.charAt(i)))
				prefix += input.charAt(i++);

			int runLength = prefix.equals("") ? 1 : Integer.valueOf(prefix);
			while (runLength-- > 0)
				output.append(input.charAt(i));

			i++;
		} catch (Exception e) {
			break;
		}

		return output.toString();
	}

}
