import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

  boolean isIsogram(String phrase) {
    Set<Character> letters = new HashSet<Character>();

		for (char c: phrase.toCharArray())
			if (letters.add(c))
				return false;

		return true;
  }

}
