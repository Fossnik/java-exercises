import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
	protected LocalDateTime birthDateTime;

	Gigasecond(LocalDate birthDate) {
		// atStartOfDay() constructs a LocalDateTime from a LocalDate
		// LocalDate is useless because of it's imprecision.
		this.birthDateTime = birthDate.atStartOfDay();
	}

	Gigasecond(LocalDateTime birthDateTime) {
		this.birthDateTime = birthDateTime;
	}

	// calculate the billionth second using LocalDateTime method
	LocalDateTime getDate() {
		return birthDateTime.plusSeconds(1000000000);
	}

}
