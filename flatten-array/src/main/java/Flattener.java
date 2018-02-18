import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class Flattener {

	private List<Object> remit = new ArrayList<>();

	List<?> flatten(List<?> input) {

		Iterator<?> it = input.iterator();
		Object element;

		while (it.hasNext())
			if ((element = it.next()) instanceof List<?>)
				flatten((List<?>)element);
			else if (element != null)
				remit.add(element);

		return remit;
	}

}
