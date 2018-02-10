import java.util.List;
import java.util.Set;
import java.util.Collections;

class Matrix {

	Matrix(List<List<Integer>> values) {
		// throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	Set<MatrixCoordinate> getSaddlePoints() {
		return Collections.singleton(new MatrixCoordinate(1, 0));
	}
}
