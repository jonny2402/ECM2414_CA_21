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
      System.out.println("Welcome to the PebbleGame!!");
      System.out.println("You will be asked to enter the number of players and then then for the " +
              "location of three files in turn containing comma separated integer values for the " +
              "pebble weights.");
      System.out.println("The integer values must be strictly positive.");
      System.out.println("The game will be simulated, and output written to files in this directory.");
      userInput();
      if (PebbleGame.testUserInputPlayer(number_of_players)) {
          if (testUserInputLocation(file_location_0)
                  && testUserInputLocation(file_location_1)
                  && testUserInputLocation(file_location_2)) {
              // test file formatting here
              try {
                  // convertFileToArrayList(file_location_0); // need to convert all at once
                  createPlayers(number_of_players);
                  Bags.dealToBags();
              } catch (Exception e) {
                  System.out.println("There was an error with the file that you submitted.");
              }
          }
          //SUCCESS MESSAGE
      }
  }



  // METHOD THAT RECEIVES USER INPUT IN COMMAND LINE
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
      return number_of_players > 0;
  }

  // METHOD TO TEST WHETHER THE FILE INPUT EXISTS AND IS IN LEGITIMATE FORMAT
  public static boolean testUserInputLocation(String file_location) {
     //return Files.exists(Path.of(file_location));
      File temp = new File(file_location);
      return temp.exists();
  }
  // METHOD TO TEST FILE FORMATTING
  public static boolean testFileFormat(String file_location) {
      // complete
      return true;
  }

  // METHOD TO CONVERT INPUT FILE INTO AN ARRAY LIST
  public static ArrayList<Integer> convertFileToArrayList(File file) {
    // complete this
      return null;
  }

  public static void createPlayers(int number_of_players) {
      for (int i = 1; i <= number_of_players; i++) {
      // fill in players class attributes
          playerList.add(new Players(1));
    }
  }
}
