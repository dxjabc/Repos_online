/**
 * 2021-July-03
 * @author Jimmy Duan
 */
package milestone1Exercise;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
   public static void main(String[] args) {     
      game();
}
   public static void game() {
      Scanner myScanner = new Scanner(System.in);
      System.out.println("How many rounds you want to play?(1-10)");//Asking user to input a number.
      String input = myScanner.nextLine();
      if (numberCheck(input)) { //Checking input, if input is null, empty or String then quit game.
          System.out.println("invalid input!");  
          quit();    
      } else {
          int number = Integer.parseInt(input); //Covert input to int. 
          int userChoie = 0;
          // Declare variables for track win time after each rounds.          
          int tie = 0;
          int youWin = 0;
          int computerWin = 0;
          if ( number < 1 || number > 10 ) { // Checking input number range. if out of range then quit.
              System.out.println("Number out of range!"); 
              quit();
          } else {
              for (int i = 1; i <= number; i++) {
              boolean isValid = false;
              do { //If user input an invalid data then ask user input again until user input a correct number.
              System.out.println("Please choose: "); //Waiting for user choose.
              System.out.println("1.Rock    2.Paper     3.Scissors");  
              String input1 = myScanner.nextLine();              
              if (numberCheck(input1)) { //Checking input, if input is null, empty or String then quit game.
              System.out.println("invalid input!"); 
              } else {
                  int choie = Integer.parseInt(input1);
                  if ( choie < 1 || choie > 3 ) { // Checking input number range. if out of range then quit.
                      System.out.println("Number out of range!");  
                  } else {
                      userChoie = choie;
                     isValid = true;
                  }
              }
              } while (!isValid);             
             
                      Random randomizer = new Random();
                      int randomNum = randomizer.nextInt(3) + 1;   //Randomly generate number 1-3. 
                      // Check who is winner.
                      if (userChoie == randomNum ) {
                          System.out.println("tie");
                          tie++;
                      } else if (userChoie ==1 & randomNum == 2) {
                                 System.out.println("Computer win!");
                                 computerWin++;
                             } else if (userChoie == 1 & randomNum == 3) {
                                        System.out.println("You win!");
                                        youWin++;
                                    } else if (userChoie == 2 & randomNum == 1) {
                                               System.out.println("You win!");
                                               youWin++;
                                           } else if (userChoie == 2 & randomNum == 3) {
                                                      System.out.println("Computer win!");
                                                      computerWin++;
                                                  } else if (userChoie ==3 & randomNum == 1) {
                                                             System.out.println("Computer win!");
                                                             computerWin++;
                                                         } else if (userChoie == 3 & randomNum == 2) {
                                                                    System.out.println("You win!");
                                                                    youWin++;
                                                                }         
              }
                      }

  

            // Print out the number of ties, user wins, and computer wins.
            System.out.println("You win: " + youWin + " Computer win: " + computerWin + " tie: " + tie);
            // Check who is the final winner.
            if (youWin > computerWin ) {
                System.out.println("You win the game!");
            } else if (youWin < computerWin) {
                       System.out.println("Computer win the game!");
                   } else {
                       System.out.println("Tie!");
                   }
         System.out.println("Do you wan to play again? (y/n)"); //Asking user whether play again.
         String answer = myScanner.nextLine();
         if (answer.equalsIgnoreCase("y")) { // If answer is y call game() method.
             game();
         } else { 
             System.out.println("Thanks for playing!");
         }
        }
      }
      
     
   public static Boolean numberCheck(String input) {
       Boolean result = false;
       Boolean notNumber = false;
       try {
           int x = Integer.parseInt(input); //Covert input to int.
       } catch(NumberFormatException e) {   // If throws NumberFormatException during the perform 
           notNumber = true;                // that means the input type is not int.
       }
       
       if(input == null || input.isEmpty() || notNumber ) { //Check user input. Can not be null, empty or String.
         result = true;
       } else {
         result = false;
       }
         return result;       
   }
   public static void quit(){
       System.out.println("Bye!");       
   }
}
