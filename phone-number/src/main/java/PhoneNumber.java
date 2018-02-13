class PhoneNumber {

  public String phoneNumber;

  public PhoneNumber(String input) {
    this.phoneNumber = input;
  }

  public String getNumber() {
    String digits = this.phoneNumber.replaceAll("\\D", "");

		return digits.substring(digits.length() - 10, digits.length());
  }

}
