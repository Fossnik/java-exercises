
class SpaceAge {

	static final double secondsInAnEarthYear = 31557600;
	protected double secondsOfAge;

	SpaceAge(double seconds) {
		this.secondsOfAge = seconds;
	}

	double getSeconds() {
		return secondsOfAge;
	}

	double onEarth() {
		return secondsOfAge / secondsInAnEarthYear;
	}

	double onMercury() {
		// the orbital period of Mercury is .2408467 as long as Earth's
		return secondsOfAge / (secondsInAnEarthYear * .2408467);
	}

	double onVenus() {
		return secondsOfAge / (secondsInAnEarthYear * .61519726);
	}

	double onMars() {
		return secondsOfAge / (secondsInAnEarthYear * 1.8808158);
	}

	double onJupiter() {
		return secondsOfAge / (secondsInAnEarthYear * 11.862615);
	}

	double onSaturn() {
		return secondsOfAge / (secondsInAnEarthYear * 29.447498);
	}

	double onUranus() {
		return secondsOfAge / (secondsInAnEarthYear * 84.016846);
	}

	double onNeptune() {
		return secondsOfAge / (secondsInAnEarthYear * 164.79132);
	}

}
