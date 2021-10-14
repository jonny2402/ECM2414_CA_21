import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bags {
  private int bagID;
  private List<Integer> bagInventory = Collections.synchronizedList(new ArrayList<>());
  // CONSTRUCTOR METHOD
  public Bags() {


  }

  // METHOD TO DEAL OUT PEBBLES TO BAGS INITIALLY
  public static void dealToBags() {
  }

  // METHOD TO DRAW A RANDOM PEBBLE FROM A BAG
  public int bagDraw() {
    if (checkBagEmpty()) {
      replaceBagContents();
    }
    return randomPebble();

  }

  // WILL RETURN FALSE IF BAG IS EMPTY
  public boolean checkBagEmpty() {
    return bagInventory.isEmpty();
  }

  // METHOD TO REPLACE BLACK AND WHITE BAG CONTENTS
  public void replaceBagContents() {
  }

  // METHOD TO SELECT A RANDOM PEBBLE FROM A BAG
  public int randomPebble() {
    Random rand = new Random();
    return bagInventory.get(rand.nextInt(bagInventory.size()));
  }
}
