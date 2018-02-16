class PhoneNumber {

	private String digits;
	private int length;

	public PhoneNumber(String input) {
		if (! input.matches("[\\d. )(\"+-]*"))
			throw new IllegalArgumentException("Illegal character in phone number. Only digits, spaces, parentheses, hyphens or dots accepted.");

		this.digits = input.replaceAll("\\D", "");
		this.length = digits.length();

		if (!(length == 10 || length == 11))
				throw new IllegalArgumentException("Number must be 10 or 11 digits");

		if (digits.substring(0,length - 9).matches("[0-1]") ||
			digits.substring(length - 7, length - 6).matches("[0-1]"))
			throw new IllegalArgumentException("Illegal Area Or Exchange Code. Only 2-9 are valid digits");

		if (length == 11 && !this.digits.startsWith("1"))
			throw new IllegalArgumentException("Can only have 11 digits if number starts with '1'");
	}

	public String getNumber() {
		return digits.substring(length - 10, length);
	}

}
