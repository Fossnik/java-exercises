import java.util.List;
import java.util.ArrayList;

class Series {

	private String series;

	Series(String string) {
		this.series = string;
	}

	public List<Integer> getDigits() {
		List<Integer> list = new ArrayList<Integer>();

		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		return list;
	}

	public List<List<Integer>> slices (int n) {

		return new ArrayList<>();
	}

}
