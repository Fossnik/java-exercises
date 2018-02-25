class BracketChecker {

	private String input;

	BracketChecker(String input) {
		this.input = input.replaceAll("[^\\{\\(\\[\\}\\)\\]]", "");
	}

	public boolean areBracketsMatchedAndNestedCorrectly() {
		Stack<Character> stack = new Stack<>();

		for (char c : input.toCharArray())
			if (String.valueOf(c).matches("[\\{\\(\\[]"))
				stack.add(c);
			else
				if (stack.isEmpty())
					return false;
				else
					if (c == mirror(stack.peek()))
						stack.pop();

		return stack.isEmpty();
	}

	private char mirror(char bracket) {
		if (bracket == '[') return ']';
		if (bracket == '{') return '}';
		if (bracket == '(') return ')';
		return '\0';
	}

}
