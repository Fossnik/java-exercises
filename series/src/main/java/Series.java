import java.util.List;
import java.util.ArrayList;

class Series {

	private String series;

	Series(String string) {
		this.series = string;
	}

	public List<Integer> getDigits() {
		List<Integer> list = new ArrayList<Integer>();

		for (char c : series.toCharArray())
			list.add(Character.getNumericValue(c));

		return list;
	}

	public List<List<Integer>> slices(int n) {
		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i <= series.length() - n; i++)
			list.add(getListDigits(series.substring(i, i + n)));

		return list;
	}

	private List<Integer> getListDigits(String s) {
		List<Integer> list = new ArrayList<>();
		for (char c : s.toCharArray())
			list.add(Character.getNumericValue(c));

		return list;
	}

}
