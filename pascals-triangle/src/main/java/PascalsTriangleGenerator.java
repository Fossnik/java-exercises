class PascalsTriangleGenerator {

	private int[][] triangle = new int[][]{};
	private int size;

	public int[][] generateTriangle(int size) {
		this.size = size;
		for (int i = 0; i < size; i++)
			makeRow(i);

		return triangle;
	}

	private void makeRow(int n) {
		System.out.println(n);
	}

}
