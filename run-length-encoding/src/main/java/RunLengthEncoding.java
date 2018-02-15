class RunLengthEncoding {

  public String encode(String input) {
    StringBuilder output = new StringBuilder();

		char a = '\r';
		char b;
    int i = 0;
		int count = 1;
		while (!input.isEmpty()) {
			try {
				a = input.charAt(i);
				b = input.charAt(++i);

				if (a == b) {
					count++;
				} else {
					output.append((count > 1 ? (Integer.toString(count) + a) : a));
					count = 1;
				}

			} catch (Exception e) {
        output.append((count > 1 ? (Integer.toString(count) + a) : a));
        break;
      }
		}

		return output.toString();
	}

  public String decode(String input) {
    StringBuilder output = new StringBuilder("");
		char[] ca = input.toCharArray();
		String runLength;

		int i = 0;
		while (!input.isEmpty()) {
			runLength = "";
			try {
				if (Character.isDigit(ca[i]))
					while (Character.isDigit(ca[i]))
						runLength += ca[i++];
				else
					runLength = "1";

				for (int j = Integer.valueOf(runLength); j > 0; j--)
					output.append(ca[i]);

				i++;

			} catch (Exception e) {
				break;
			}
		}

		return output.toString();
  }

}
