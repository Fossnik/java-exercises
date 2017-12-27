public class Twofer {
    public String twofer(String name) {
        // First test - noNameGiven
        if (name == null)
          name = "you";

        // All other cases:
        return "One for " + name + ", one for me.";
    }
}
