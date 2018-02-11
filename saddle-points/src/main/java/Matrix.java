import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

class Matrix {

	private List<List<Integer>> values;

	Matrix(List<List<Integer>> values) {
		this.values = values;
	}

	Set<MatrixCoordinate> getSaddlePoints() {
		if (this.values.isEmpty())
			return Collections.emptySet();

		Set<MatrixCoordinate> remit = new HashSet<MatrixCoordinate>();

		// test every point in matrix
		boolean isSaddle = true;
		int pointValue;

		int numRows = this.values.size();
		int numColumns = this.values.get(0).size();

		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numColumns; col++) {

				pointValue = this.values.get(row).get(col);
				isSaddle = true;

				// test whether GTE to each element in the same row
				for (int x = 0; x < numRows; x++)
					if (pointValue < this.values.get(row).get(x))
						isSaddle = false;

				// test whether LTE to each element in the same column
				for (int y = 0; y < numColumns; y++)
					if (pointValue > this.values.get(y).get(col))
						isSaddle = false;

				if (isSaddle)
					remit.add(new MatrixCoordinate(row, col));

			}
		}

		return remit;
	}

}
