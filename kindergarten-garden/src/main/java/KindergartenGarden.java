import java.util.List;
import java.util.ArrayList;

class KindergartenGarden {

	private ArrayList<Plant> remit = new ArrayList<>();
	private String garden;

	KindergartenGarden(String garden, String[] students) {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	KindergartenGarden(String garden) {
		this.garden = garden;
	}

	List<Plant> getPlantsOfStudent(String student) {
		int studentLocus = ((int)student.charAt(0) - (int)'A') * 2;

		for (String row : garden.split("\n"))
			for (int i : new int[]{studentLocus, studentLocus + 1})
				remit.add(Plant.getPlant(row.charAt(i)));

		return remit;
	}

}
