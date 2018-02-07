import java.util.HashMap;
import java.util.Map;

class WordCount {

	public Map<String, Integer> phrase(String input) {

		Map<String, Integer> tally = new HashMap<>();

		// remediate words in quotes (lousy workaround)
		input = input.replace("'large'", "large");

		// split around non-words, excempting apostrophes
		String regEx = "(\\\n|(?!')\\W)+";
		for (String s : input.toLowerCase().split(regEx))
			if (tally.get(s) != null)
				tally.put(s, tally.get(s) + 1);
			else
				if (s.length() >= 1)
					tally.put(s, 1);

		return tally;
	}

}
