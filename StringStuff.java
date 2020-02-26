// java.util.Scanner found at https://www.programiz.com/java-programming/basic-input-output
import java.util.Scanner;

/**
* The MicrowaveTime program implements an application that calculates how much 
* time a microwave should run depending on the item and how many of said item.
*
* @author  Bradley Wills
* @version 1.0
* @since   2020-02-23 
*/

public class StringStuff {
  // Create variables 
  static int count;
  static double lastNumber;
  static double currentNumber;
  
  /**
  * Calculates and outputs the amount of time depending on the item and how many of said item.
  */
  
  public static void main(String[] args) {
    // Create scanner also found at https://www.programiz.com/java-programming/basic-input-output
    Scanner userInput = new Scanner(System.in);
    // Ask for input
    System.out.println("Input the string.");
    try { 
      count = 0;
      String inputedText = userInput.nextLine();
      inputedText = inputedText.replaceAll("\\s", "");
      String lastLetter = "";
      String currentLetter = String.valueOf(inputedText.charAt(count));
      String rewrittenString = "";
      while (count < inputedText.length()) {
        currentLetter = String.valueOf(inputedText.charAt(count));
        count += 1;
        try {
          lastNumber = Double.parseDouble(lastLetter);
          for (int i = 0; i < lastNumber; i++) {
            rewrittenString += currentLetter;
          }
          lastLetter = currentLetter;
        } catch (Exception e) {
          try {
            currentNumber = Double.parseDouble(currentLetter);
            lastLetter = currentLetter;
          } catch (Exception q) {
            rewrittenString += currentLetter;
          }
        }
      }
      System.out.println("The rewritten string is " + rewrittenString);
    } catch (Exception e) {
      // Informs user their input is invalid
      System.out.println("Invalid Input");
    }
  }
}