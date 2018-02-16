class RunLengthEncoding {

	public static String encode(String input) {
		StringBuilder output = new StringBuilder();
		char a = '\r';
		char b;
		int i = 0;
		int count = 1;
		while (!input.isEmpty()) {
			try {
				a = input.charAt(i);
				b = input.charAt(++i);

				if (a == b) {
					count++;
				} else {
					output.append((count > 1 ? (Integer.toString(count) + a) : a));
					count = 1;
				}
			} catch (Exception e) {
				output.append((count > 1 ? (Integer.toString(count) + a) : a));
				break;
			}
		}

		return output.toString();
	}

	public static String decode(String input) {
		StringBuilder output = new StringBuilder();
		int i = 0;
		while (!input.isEmpty()) try {
			String prefix = "";
			while (Character.isDigit(input.charAt(i)))
				prefix += input.charAt(i++);

			int runLength = (prefix.equals("") ? 1 : Integer.valueOf(prefix));
			while (runLength-- > 0)
				output.append(input.charAt(i));

			i++;
		} catch (Exception e) {
			break;
		}

		return output.toString();
	}

}
