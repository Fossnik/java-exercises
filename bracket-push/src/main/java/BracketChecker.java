class BracketChecker {

	private String input;

	BracketChecker(String input) {
		this.input = input.replaceAll("[^\\{\\(\\[\\}\\)\\]]", "");
	}

	public boolean areBracketsMatchedAndNestedCorrectly() {
		if (input.isEmpty())
			return true;

		return testString(this.input);
	}

	private boolean testString(String string) {

		int end = opposingBracketIndex(string);
		if (end == -1)
			return false;

		String substring = string.substring(1, end);

		if (!hasInternalSymmetry(substring))
			return false;
		else
			testString(substring);

		return true;
	}

	private int opposingBracketIndex(String string) {
		// returns the index of the opposite bracket.

		if (string.length() < 2)
			return -1;

		char bracket = string.charAt(0);
		char mirror = mirror(bracket);

		if (mirror == '\0')
			return -1;

		// note the number of forward brackets -
		// an additional forward bracket means searching past the first matching bracket
		int index = 0;
		int depth = 0;
		while (index < string.length())
			if (string.charAt(++index) == mirror)
				if (depth == 0)
					return index;
				else
					depth--;
			else if (string.charAt(index) == bracket)
				depth++;

		return -1;
	}

	private boolean hasInternalSymmetry (String s) {
		// input has an equivalent quantity of the respective left and right brackets?
		return
				   s.replaceAll("\\[", "").length() == s.replaceAll("\\]", "").length()
				&& s.replaceAll("\\(", "").length() == s.replaceAll("\\)", "").length()
				&& s.replaceAll("\\{", "").length() == s.replaceAll("\\}", "").length();
	}

	private char mirror(char bracket) {
		if (bracket == '[') return ']';
		if (bracket == '{') return '}';
		if (bracket == '(') return ')';
		return '\0';
	}

}
