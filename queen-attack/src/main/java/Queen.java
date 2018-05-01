public class Queen {
	int row;
	int col;

	Queen(int row, int col) {
		if (row > 7 || row < 0)
			throw new IllegalArgumentException("Row Must Be Between 0 and 7");

		if (col > 7 || col < 0)
			throw new IllegalArgumentException("Column Must Be Between 0 and 7");

		this.row = row;
		this.col = col;
	}
}
