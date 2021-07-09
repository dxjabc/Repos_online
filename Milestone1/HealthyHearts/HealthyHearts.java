/**
 * 2021-July-03
 * @author Jimmy Duan
 */
package milestone1Exercise;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int age = 0;
        boolean isValid = false;
        do { //If user input an invalid data then ask user input again until user input a correct number.
          System.out.println("What is your age?");  
          String input = myScanner.nextLine();
          if (numberCheck(input)){
             System.out.println("invalid input!");
          } else {
              int choie = Integer.parseInt(input);
              if  (choie < 1 || choie > 120 ) {
                  System.out.println("Number out of range!");
              } else {
                 age = choie;
                 isValid = true;
              }
          }              
        } while (!isValid);        
        
        int heartRate = 220 - age;
        float mintemp = Math.round(heartRate * 0.5);
        int min = (int)mintemp; //Covert float to int.
        float maxtemp = Math.round(heartRate * 0.85); //Get the rounding number(an integer) of the result.
        int max = (int)maxtemp;
        System.out.println("Your maximum heart rate should be " + heartRate + " beats per minute." );
        System.out.println("Your target HR Zone is " + min + " - " + max + " beats per minute." );
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
}
