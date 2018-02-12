import java.util.List;
import java.util.ArrayList;

class DiamondPrinter {

  private static char max;
  private static int depth;

  static List<String> printToList(char a) {

    List<String> remit = new ArrayList<String>();

    max = (char) (a - 'A');
    depth = max * 2 + 1;

    for (char i = 'A'; i < a; i++)
      remit.add(printRow(i));

    for (char i = a; i >= 'A'; i--)
      remit.add(printRow(i));

    return remit;
  }

  private static String printRow(char c) {
    String row = "";
    for (int i = 0; i < depth; i++)
      if (i == max - (c-'A') || i == (c-'A') + max)
        row += c;
      else
        row += ' ';

    return row;
  }

}
