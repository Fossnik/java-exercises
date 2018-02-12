import java.util.List;
import java.util.ArrayList;

class DiamondPrinter {

  private static int depth;
  private static char max;

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

  private static String printRow(char a) {
    String row = "";
    for (int i = 0; i < depth; i++)
      if (i == max - (a-'A') || i == a-'A' + max)
        row += a;
      else
        row += ' ';

    return row;
  }

}
