class QueenAttackCalculator{
	private Queen q1;
	private Queen q2;

	QueenAttackCalculator(Queen q1, Queen q2) {
		this.q1 = q1;
		this.q2 = q2;
	}

	boolean canQueensAttackOneAnother() {
		int rowDiff = (this.q1.row - this.q2.row);
		rowDiff = rowDiff * rowDiff / rowDiff;

		int colDiff = (this.q1.col - this.q2.col);
		colDiff = colDiff * colDiff / colDiff;

		return rowDiff == colDiff;
	}
}
