class PascalsTriangleGenerator {

	private int[][] triangle;
	private int size;

	public int[][] generateTriangle(int size) {
		this.size = size;
		this.triangle = new int[size][size];

		for (int i = 0; i < size; i++)
			makeColumn(i);

		return triangle;
	}

	private void makeColumn(int x) {

		for (int y = x; y < size; y++) {
			try {
				triangle[y][x] = triangle[y - 1][x] + triangle[y - 1][x - 1];
			} catch (ArrayIndexOutOfBoundsException e) {
				triangle[y][x] = 1;
			}
		}

	}

}
