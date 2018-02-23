import java.util.HashMap;
import java.util.Stack;

class BracketChecker {

	private String input;

	BracketChecker(String input) {
		this.input = input;
	}

	public boolean areBracketsMatchedAndNestedCorrectly() {
		// test for left/right bracket parity
		if (!(
			   input.replaceAll("\\[","").length() == input.replaceAll("\\]", "").length()
		    && input.replaceAll("\\(","").length() == input.replaceAll("\\)", "").length()
		    && input.replaceAll("\\{","").length() == input.replaceAll("\\}", "").length()
		))
			return false;

		// compile stack of all left brackets
		Stack<Character> left = new Stack<>();
		for (char l : input.replaceAll("[^\\[\\(\\{]", "").toCharArray())
			left.push(l);

		// test if chiral-right brackets unpack in symmetric order with mirrors
		HashMap<Character, Character> mirrors = new HashMap<Character, Character>();
		mirrors.put('{','}');
		mirrors.put('[',']');
		mirrors.put('(',')');

		for (char r : input.replaceAll("[^\\]\\)\\}]", "").toCharArray())
			if (mirrors.get(left.pop()) != r)
				return false;

		return true;
	}

}
