public class Queen {
	int row;
	int col;

	Queen(int row, int col) {
		if (col > 7)
			throw new IllegalArgumentException("Queen position must have column <= 7.");
		if (col < 0)
			throw new IllegalArgumentException("Queen position must have positive column.");
		if (row > 7)
			throw new IllegalArgumentException("Queen position must have row <= 7.");
		if (row < 0)
			throw new IllegalArgumentException("Queen position must have positive row.");

		this.row = row;
		this.col = col;
	}
}
