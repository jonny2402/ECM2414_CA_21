import java.util.ArrayList;

public class Players {
  // may be unnecessary
  private int playerID;
  private ArrayList<Integer> playerInventory;
  // CONSTRUCTOR METHOD
  public Players(int playerID) {
    this.playerID = playerID;
  }

  // METHOD THAT RETURNS IF A PLAYER HAS WON
  public boolean getPlayerWinState() {
    int InventoryTotal = 0;
    //this.playerInventory?
    for (int i: playerInventory) {
      InventoryTotal += i;
    }
    return InventoryTotal == 100;
  }


}
