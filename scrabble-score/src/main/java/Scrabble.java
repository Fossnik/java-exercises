class Scrabble {

/*
	Letter                           Value
	A, E, I, O, U, L, N, R, S, T       1
	D, G                               2
	B, C, M, P                         3
	F, H, V, W, Y                      4
	K                                  5
	J, X                               8
	Q, Z                               10
**/

	private int wordScore = 0;

	Scrabble(String word) {
		word = word.toUpperCase();
		// loop through each letter and tally
		// note the lack of break statements.
		for (char c : word.toCharArray()) {
			switch (c) {
				case 'Q': case 'Z':
					wordScore += 2; // 10
				case 'J': case 'X':
					wordScore += 3; // 8
				case 'K':
					wordScore++; // 5
				case 'F': case 'H': case 'V': case 'W': case 'Y':
					wordScore++; // 4
				case 'B': case 'C': case 'M': case 'P':
					wordScore++; // 3
				case 'D': case 'G':
					wordScore++; // 2
				case 'A': case 'E': case 'I': case 'O': case 'U':
				case 'L': case 'N':	case 'R': case 'S': case 'T':
					wordScore++; // 1
				default:
					continue;
			}
		}
	}

	int getScore() {
		return wordScore;
	}

}
