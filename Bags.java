import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bags {
  private int bagID;
  private ArrayList<Integer> bagInventory;
  private List<Integer> syncBagInventory;
  // CONSTRUCTOR METHOD
  public Bags(ArrayList<Integer> bagInventory) {
    this.bagInventory = bagInventory;
    this.syncBagInventory = Collections.synchronizedList(bagInventory);
  }
  // methods

}
