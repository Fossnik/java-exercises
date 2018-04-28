import java.util.*;

public class Transpose {
	String transpose(String input) {
		if (input.isEmpty()) return "";

		// each queue is a column
		List<Queue> queueList = new ArrayList<>();

		for (String s : input.split("\n"))
			queueList.add(makeQueue(s));

		// build row by row
		String remit = "";
		while (queueList.stream().anyMatch(queue -> !queue.isEmpty())) {
			for (Queue queue : queueList)
				remit += queue.poll();

			remit += "\n";
		}

		// remove superfluous newline
		return remit.substring(0, remit.length() - 1);
	}

	private Queue makeQueue(String s) {
		Queue<Character> queue = new LinkedList<>();

		for (char c: s.toCharArray())
			queue.add(c);

		return queue;
	}

}