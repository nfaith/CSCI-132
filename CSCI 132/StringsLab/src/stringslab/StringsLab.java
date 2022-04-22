/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringslab;

import static java.lang.System.console;
import static java.lang.System.out;
import java.lang.String;
import java.lang.Iterable;
import java.util.Scanner;
// import static javafx.beans.binding.Bindings.convert;

/**
 *
 * @author Hunter
 */

public class StringsLab {
     public static int countVowels(String input){
         
         //1. Count the number of vowels
         int numVowels = 0;
         for( int i =0; i < input.length(); i++){
            char check = input.charAt(i);
            if(check == 'a'|| check == 'e'|| check == 'i'|| check == 'o'|| check == 'u'){
                numVowels++;
            }
         }
         return numVowels;
     }
     
     public static String[] returnEachWord(String input)
     {
         // 2. return each word.
        String answer[] = input.split(" ");
        return answer;
     }
     public static String removeWhiteSpace(String input)
     {
    //3. Remove all white space in a String, including beginning and ending white space
         
         String removeWhiteSpace = input.replaceAll(" ", "");
         
         return removeWhiteSpace;        
     }
     
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
    
        String answer = "yes";
        do{
           System.out.println("Give me a sentence you want to parse");
           String sentence = console.nextLine();
 //1.convert to lowercase
           System.out.println("");
           System.out.println("Number of vowels using count     = " + countVowels(sentence));
           String output[] = returnEachWord(sentence);
           for(String x : output)
                  System.out.println(x);
           System.out.println("String without spaces = |" + removeWhiteSpace(sentence) + "|");
           System.out.println("");
           System.out.println("Would you like to continue: ");
           answer = console.nextLine();
           
        System.out.println("");
      }while(answer.equals("yes"));  
   }
}
