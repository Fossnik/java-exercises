import java.util.HashMap;
import java.util.Map;

class WordCount {

	private Map<String, Integer> wc = new HashMap<>();

	// this is the class constructor
	WordCount() {
	}

	// this is the method
	public Map<String, Integer> phrase(String input) {

		for (String s : input.toLowerCase().split("[^A-z0-9]"))
			if (wc.get(s) != null)
				wc.put(s, wc.get(s) + 1);
			else
				wc.put(s, 1);

		return wc;
	}

}
