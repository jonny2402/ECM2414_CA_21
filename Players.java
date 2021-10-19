

public class Players {
  private int playerID
  private ArrayList<Integer> playerInventory;
  // CONSTRUCTOR METHOD
  public Players(int playerID) {
    this.playerID = playerID
  }

  // METHOD THAT RETURNS IF A PLAYER HAS WON
  public getPlayerWinState() {
    int InventoryTotal = 0;
    //this.playerInventory?
    for (int i: playerInventory) {
      InventoryTotal += i:
    }
    if (InventoryTotal == 100) {
      return true
    }
    else {
      return false
    }
  }


}
