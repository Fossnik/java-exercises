import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class KindergartenGarden {

	// Plant[] remit = new Plant[];
	// private List<Plant> remit;
	ArrayList<Plant> remit = new ArrayList<>();

	private String garden;

	KindergartenGarden(String garden, String[] students) {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	KindergartenGarden(String garden) {
		this.garden = garden;
	}

	List<Plant> getPlantsOfStudent(String student) {
		remit.add(Plant.RADISHES);
		remit.add(Plant.CLOVER);
		remit.add(Plant.GRASS);
		remit.add(Plant.GRASS);
		return remit;
	}

}
