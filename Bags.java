import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bags {
  private int bagID;
  private ArrayList<Integer> bagContents;
  private List<Integer> synBagContents;
  // CONSTRUCTOR METHOD
  public Bags(ArrayList<Integer> bagContents) {
    this.bagContents = bagContents;
    this.synBagContents = Collections.synchronizedList(bagContents);
  }
  // methods

}
