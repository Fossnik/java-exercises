import java.util.ArrayList;

class BracketChecker {

	private ArrayList<Character> input = new ArrayList<>();

	BracketChecker(String input) {
		for (Character c : input.replaceAll("[^\\{\\(\\[\\}\\)\\]]", "").toCharArray())
			this.input.add(c);
	}

	public boolean areBracketsMatchedAndNestedCorrectly() {
		char mirror = '\0';

		while (! input.isEmpty()) {

			Character first = input.get(0);

			if      (first == '[') mirror = ']';
			else if (first == '{') mirror = '}';
			else if (first == '(') mirror = ')';

			input.remove(0);

			if (input.indexOf(mirror) == -1)
				return false;
			else
				input.remove(input.indexOf(mirror));

		}

		return true;
	}

}
