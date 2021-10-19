public class PebbleGame {
  private Int number_of_players;
  private ArrayList<Players> playerList;
  private ArrayList<Bags> bagList;
  private String file_location_0;
  private String file_location_1;
  private String file_location_2;
  // maybe change to individual variables
  private Boolean[] valid_array;

  // CONSTRUCTOR METHOD FOR CARDGAME CLASS
  public CardGame() {
    playerList = new ArrayList<Players>();
    // change from arraylist to array
    bagList = new arrayList<Bags>();
  }
  public static void main(String[] args) {
    // CALL FOR USER TO INPUT
    userInput();
    testInputs(number_of_players, file_location_0, file_location_1, file_location_2);
    // LOOP THROUGH VALID_ARRAY TO TELL THE USER WHETHER FILE LOCATIONS ARE VALID
    // EXCEPT VALID_ARRAY[0] - (PLAYERS VALID)
    for (int i = 1; i < valid_array.length; i++) {
      // PLAYER NUMBER SUCCESS MESSAGE
      System.out.println("Testing number of players...");
      if (valid_array[0] == True) {
        System.out.println("Success!")
      } else {System.out.println("Failure. Please choose a valid number of players.")}
      // FILE LOADING SUCCESS MESSAGES
      System.out.println("Loading file " + i + "... : " );
      if (valid_array[i] == true) {
        System.out.println("Success!" );
      } else {System.out.println("Failure.")
    System.out.println("Please enter a valid location for file " + i)}
    }
    // AFTER VALIDITY CHECKS DONE, USE INPUTS
    try {
      // doesn't work yet
      convertFileToArrayList(file_location);
      createPlayers(number_of_players);
      Bags.dealToBags();
    }
    catch (Exception e) {
      System.out.println("There was an error with the file(s) that you submitted.");
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

  // METHOD TO CALL ALL QUERY METHODS TOGETHER
  public void testInputs(Int number_of_players, String file_location_0, String file_location_1, String file_location_2) {
    Boolean players_valid = testUserInputPlayer(number_of_players);
    Boolean file_0_valid = testUserInputLocation(file_location_0);
    Boolean file_1_valid = testUserInputLocation(file_location_1);
    Boolean file_2_valid = testUserInputLocation(file_location_2);
    valid_array = {players_valid, file_0_valid, file_1_valid, file_2_valid};
  }



  // METHOD TO CONVERT INPUT FILE INTO AN ARRAY LIST
  public arrayList<Integer> convertFileToArrayList(file) {
    // complete this
  }
  // METHOD TO CREATE N NUMBER OF PLAYER SELECTED BY THE USER
  public void createPlayers(int number_of_players) {
    for (i = 0; i < number_of_players; i++) {
      // fill in players class attributes
      playerList.add(new Players());
    }
  }
}
