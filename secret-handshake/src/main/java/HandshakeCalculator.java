import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {
/*
    1 = wink							1
   10 = double blink			2
  100 = close your eyes		4
 1000 = jump							8
10000 = Reverse order of operations.
**/
	List<Signal> calculateHandshake(int number) {
		// create a list of type signal, that expresses 4 potential enum values
		// the enums are defined in the other file
		ArrayList<Signal> enumList = new ArrayList<>();

		// binary representation of input
		String binaryString = Integer.toString(number, 2);

		// zero pad binary number to length of 5
		// this builds sort of an array of state values
		while (binaryString.length() < 5) {
			binaryString = "0" + binaryString;
		}

		// build a response based on boolean state values of the string
		if (binaryString.charAt(4) == '1')
			enumList.add(Signal.WINK);

		if (binaryString.charAt(3) == '1')
			enumList.add(Signal.DOUBLE_BLINK);

		if (binaryString.charAt(2) == '1')
			enumList.add(Signal.CLOSE_YOUR_EYES);

		if (binaryString.charAt(1) == '1')
			enumList.add(Signal.JUMP);

		if (binaryString.charAt(0) == '1')
			Collections.reverse(enumList); // reverse enumList

		return enumList;
	}

}
