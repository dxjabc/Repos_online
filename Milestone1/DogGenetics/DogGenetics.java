/**
 * 2021-July-03
 * @author Jimmy Duan
 */
package milestone1Exercise;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        int fullNum = 100; // Declare an int variable for one hundred percent.
        String answer = "";
        Scanner myScanner = new Scanner(System.in);
        boolean isValid = false;
        do { //If user input an invalid data then ask user input again until user input a correct number.
           System.out.println("What is your dog's name?"); 
           String input = myScanner.nextLine();
           if (inputCheck(input)) {
               System.out.println("You did not input anything!");
           } else {
               answer = input;
               isValid = true;
           }
        } while (!isValid);     
        
        System.out.println("Well then, I have this highly reliable report on " + answer + "'s prestigious background right here." );
        System.out.println(answer + " is:");
        
        Random randomizer = new Random();
        int num1 = randomizer.nextInt(fullNum + 1);//Randomly get a number from 0 - 100.
        fullNum = fullNum - num1;                  //Next random number2 range from 100 - num1.
        int num2 = randomizer.nextInt(fullNum);
        fullNum = fullNum - num2;                  //Next random number3 range from 100 - num1 - num2
        int num3 = randomizer.nextInt(fullNum);
        fullNum = fullNum - num3;                  //Next random number4 range from 100 - num1 - num2 - num3
        int num4 = randomizer.nextInt(fullNum);    
        int num5 = fullNum - num4;                 //Last one number5 = 100 - num1 - num2 - num3 - num4
        
        System.out.println(num1 + "% St. Bernard");
        System.out.println(num2 + "% Chihuahua");
        System.out.println(num3 + "% Dramatic RedNosed Asian Pug");
        System.out.println(num4 + "% Common Cur");
        System.out.println(num5 + "% King Doberman");
        
        System.out.println("Wow, that's QUITE the dog!");                
    }
    
     public static Boolean inputCheck(String input) {
       Boolean result = false;       
       if(input == null || input.isEmpty() ) { //Check user input. Can not be null, empty.
         result = true;
       } else {
         result = false;
       }
         return result;       
   }
}
