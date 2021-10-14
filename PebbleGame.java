public class PebbleGame {
  private int number_of_players;
  private ArrayList<Players> playerList;
  private ArrayList<Bags> bagList;

  public CardGame() {
    playerList = new ArrayList<Players>();
    // change from arraylist to array
    bagList = new arrayList<Bags>();
  }
  public static void main(String[] args) {
    userInput();
    if (testUserInputPlayer(number_of_players)) {
      if (testUserInputLocation(file_location_0)) {
        if (testUserInputLocation(file_location_1)) {
          if (testUserInputLocation(file_location_2)) {
            try {
              convertFileToArrayList(file_location)
              createPlayers(number_of_players)
              Bags.dealToBags();
            }
            catch (Exception e) {
              System.out.println("There was an error with the file that you submitted.");
            }
          }
        }
      }
      //SUCCESS MESSAGE
    }



  // METHOD THAT RECIEVES USER INPUT IN COMMAND LINE
 public userInput() {
   Scanner scanner = new scanner(System.in);
   System.out.println("Please enter the number of players: ");
   while (!scan.hasNextInt()) {
     System.out.println("Please enter a valid integer.");
     scan.nextLine();
   }
   number_of_players = scanner.nextInt();
   System.out.println("Please enter the location of bag number 0 to load: ");
   file_location_0 = scanner.next();
   System.out.println("Please enter the location of bag number 1 to load: ");
   file_location_1 = scanner.next();
   System.out.println("Please enter the location of bag number 2 to load: ");
   file_location_2 = scanner.next();
 }

 // METHOD TO TEST WHETHER THE NUMBER OF PLAYER INPUT IS VALID
  public Boolean testUserInputPlayer(number_of_players) {
    //if (number_of_players instanceof Integer && number_of_players > 0) {
    if (number_of_players > 0) {
      return True;
    } else {return False;}
  }

  // METHOD TO TEST WHETHER THE FILE INPUT EXISTS AND IS IN LEGITIMATE FORMAT
  public Boolean testUserInputLocation(file_location) {
      return Files.exists(file_location);
  }


  // METHOD TO CONVERT INPUT FILE INTO AN ARRAY LIST
  public arrayList<Integer> convertFileToArrayList(file) {
    // complete this
  }

  public void createPlayers(int number_of_players) {
    for (i = 0; i < number_of_players; i++) {
      // fill in players class attributes
      playerList.add(new Players());
    }
  }
}
