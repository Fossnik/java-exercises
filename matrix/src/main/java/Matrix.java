class Matrix {

	private char[] matrix;

	Matrix(String matrixAsString) {
		this.matrix = matrixAsString.toCharArray();
	}

	int[] getRow(int rowNumber) {
		String concat = "";
		int rows = 0;
		// build a string from the correct row
		for (char c : matrix)
			if (c == '\n')
				rows++;
			else if (rows == rowNumber && Character.isDigit(c))
				concat += Character.getNumericValue(c);

		// build an int[]
		int[] remitArray = new int[concat.length()];
		int index = 0;
		for (char c : concat.toCharArray())
			remitArray[index++] = Character.getNumericValue(c);

		return remitArray;
	}

	int[] getColumn(int columnNumber) {
		String concat = "";
		int column = 0;

		for (char c : matrix)
			if (c == '\n')
				column = 0;
			else if (Character.isDigit(c) && columnNumber == column++)
				concat += c;

			// build an int[]
			int[] remitArray = new int[concat.length()];
			int index = 0;
			for (char c : concat.toCharArray())
				remitArray[index++] = Character.getNumericValue(c);

			return remitArray;
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
