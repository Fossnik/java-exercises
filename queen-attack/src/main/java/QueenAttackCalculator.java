import static java.lang.Math.abs;

class QueenAttackCalculator{
	private Queen q1;
	private Queen q2;

	QueenAttackCalculator(Queen q1, Queen q2) {
		this.q1 = q1;
		this.q2 = q2;
	}

	boolean canQueensAttackOneAnother() {
		int rowDiff = abs(this.q1.row - this.q2.row);
		int colDiff = abs(this.q1.col - this.q2.col);

		return rowDiff == colDiff;
	}
}
