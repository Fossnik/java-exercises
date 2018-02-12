import java.util.ArrayList;
import java.util.List;

class Flattener {

  private List<Object> remit = new ArrayList<>();

	List<?> flatten(List<?> input) {

		for (Object element : input)
			if (element instanceof List<?>)
				flatten((List<?>)element);
			else if (element != null)
				remit.add(element);

		return remit;
	}

}
