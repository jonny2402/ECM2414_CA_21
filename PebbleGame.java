import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class PebbleGame {
    private static int number_of_players;
    private static ArrayList < Players > playerList = new ArrayList < Players > ();
    private ArrayList<Bags> bagList; //change variable
    private static String file_location_0 = "";
    private static String file_location_1 = "";
    private static String file_location_2 = "";

  public PebbleGame() {
    playerList = new ArrayList<Players>();
    // change from arraylist to array
    bagList = new ArrayList<Bags>();
  }
  public static void main(String[] args) {
      userInput();
      if (PebbleGame.testUserInputPlayer(number_of_players)) {
          if (testUserInputLocation(file_location_0)) {
              if (testUserInputLocation(file_location_1)) {
                  if (testUserInputLocation(file_location_2)) {
                      try {
                          // convertFileToArrayList(file_location_0); // need to convert all at once
                          createPlayers(number_of_players);
                          Bags.dealToBags();
                      } catch (Exception e) {
                          System.out.println("There was an error with the file that you submitted.");
                      }
                  }
              }
          }
          //SUCCESS MESSAGE
      }
  }



  // METHOD THAT RECIEVES USER INPUT IN COMMAND LINE
  public static void userInput() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter the number of players: ");
      while (!scanner.hasNextInt()) {
        System.out.println("Please enter a valid integer.");
        scanner.nextLine();
      }
      number_of_players = scanner.nextInt();
      System.out.println("Please enter the location of bag number 0 to load: ");
      file_location_0 = scanner.next();
      System.out.println("Please enter the location of bag number 1 to load: ");
      file_location_1 = scanner.next();
      System.out.println("Please enter the location of bag number 2 to load: ");
      file_location_2 = scanner.next();
      scanner.close();
  }

 // METHOD TO TEST WHETHER THE NUMBER OF PLAYER INPUT IS VALID
  public static Boolean testUserInputPlayer(int number_of_players) {
    //if (number_of_players instanceof Integer && number_of_players > 0) {
      //return number_of_players > 0;
      if (number_of_players > 0) {
          return true;
      } else {
          return false;
      }
  }

  // METHOD TO TEST WHETHER THE FILE INPUT EXISTS AND IS IN LEGITIMATE FORMAT
  public static boolean testUserInputLocation(String file_location) {
     //return Files.exists(Path.of(file_location));
      File temp = new File(file_location);
      return temp.exists();
  }


  // METHOD TO CONVERT INPUT FILE INTO AN ARRAY LIST
  public static ArrayList<Integer> convertFileToArrayList(File file) {
    // complete this
      return null;
  }

  public static void createPlayers(int number_of_players) {
      for (int i = 1; i <= number_of_players; i++) {
      // fill in players class attributes
          playerList.add(new Players());
    }
  }
}
