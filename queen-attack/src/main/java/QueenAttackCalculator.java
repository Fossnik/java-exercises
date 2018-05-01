import static java.lang.Math.abs;

class QueenAttackCalculator{
	private Queen q1;
	private Queen q2;

	QueenAttackCalculator(Queen q1, Queen q2) {
		if (q1 == null || q2 == null)
			throw new IllegalArgumentException("You must supply valid positions for both Queens.");

		if (q1.col == q2.col && q1.row == q2.row)
			throw new IllegalArgumentException("Queens cannot occupy the same position.");

		this.q1 = q1;
		this.q2 = q2;
	}

	boolean canQueensAttackOneAnother() {
		int rowDiff = abs(this.q1.row - this.q2.row);
		int colDiff = abs(this.q1.col - this.q2.col);

		if (this.q1.row == this.q2.row)
			return true;

		if (this.q1.col == this.q2.col)
			return true;

		return rowDiff == colDiff;
	}
}
