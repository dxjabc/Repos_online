/**
 * 2021-July-03
 * @author Jimmy Duan
 */
package milestone1Exercise;


public class SummativeSums {
    public static void main(String[] args) {
       int sum = 0;
       int[] numbers1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };    
       sum = sumArray(numbers1);
       System.out.println("#1 Array Sum: " + sum);
       int[] numbers2 = { 999, -60, -77, 14, 160, 301 };
       sum = sumArray(numbers2);
       System.out.println("#2 Array Sum: " + sum);
       int[] numbers3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99 } ;
       sum = sumArray(numbers3);
       System.out.println("#3 Array Sum: " + sum);
       
    }
    
     public static int sumArray(int[] array) {
         int sum = 0;
         for (int i = 0; i < array.length; i++) {             
             sum = sum + array[i];
         }         
          return sum;  
        }        
}
