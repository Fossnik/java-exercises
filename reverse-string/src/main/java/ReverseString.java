class ReverseString {
		String reverse(String inputString) {
			String reversed = new String("");

			for (int i = inputString.length(); i > 0; i--) {
			  reversed += inputString.charAt(i);
			}

			return reversed;
		}
}
