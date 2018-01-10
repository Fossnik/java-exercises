
class Matrix {

	private char[] matrix;

	Matrix(String matrixAsString) {
		this.matrix = matrixAsString.toCharArray();
	}

	int[] getRow(int rowNumber) {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int[] getColumn(int columnNumber) {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int getRowsCount() {
		int rows = 1;
		// count newline characters
		for (char c : matrix)
			if (c == '\n')
				rows++;

		return rows;
	}

	int getColumnsCount() {
		int columns = 1;
		// count whitespace characters
		for (char c : matrix)
			if (c == ' ')
				columns++;
			else if (c == '\n') // count only first row
				break;

		return columns;
	}
}
