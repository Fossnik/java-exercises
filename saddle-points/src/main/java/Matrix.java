import java.util.List;
import java.util.Set;
import java.util.Collections;

class Matrix {

	private List<List<Integer>> values;

	Matrix(List<List<Integer>> values) {
		this.values = values;
	}

	Set<MatrixCoordinate> getSaddlePoints() {

		// test every point in matrix
		boolean isSaddle = true;
		int pointOfComparisonValue;

		int numRows = values.size();
		int numColumns = values.get(0).size();

		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numColumns; col++) {

				pointOfComparisonValue = values.get(row).get(col);
				isSaddle = true;

				// test whether GTE to each element in the row
				for (int x = 0; x < numRows; x++)
					if (pointOfComparisonValue < values.get(row).get(x))
						isSaddle = false;

				// test whether LTE each in column
				for (int y = 0; y < numColumns; y++)
					if (pointOfComparisonValue > values.get(y).get(col))
						isSaddle = false;

				if (isSaddle) {
					return Collections.singleton(new MatrixCoordinate(row, col));
				}
			}
		}
		return Collections.singleton(new MatrixCoordinate(1, 0));
	}

}
