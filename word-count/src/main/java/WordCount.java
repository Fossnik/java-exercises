import java.util.HashMap;
import java.util.Map;

class WordCount {

	private Map<String, Integer> wc = new HashMap<>();

	// this is the class constructor
	WordCount() {
	}

	// this is the method
	public Map<String, Integer> phrase(String input) {

		// remediate words in quotes (lousy workaround)
		input = input.replace("'large'", "large");

		// split around non-words, excempting apostrophes
		for (String s : input.toLowerCase().split("(\\\n|(?!')\\W)+"))
			if (wc.get(s) != null)
				wc.put(s, wc.get(s) + 1);
			else
				if (s.length() >= 1)
					wc.put(s, 1);

		return wc;
	}

}
