public class myDecryption {

   // main method
   public static void main(String[] args) 
   {
   
      // create an instance of the myDecryption class
      myDecryption decryptCaesar = new myDecryption();
   
      // Call the decryptString
      System.out.println(decryptCaesar.decryptString("ABC", 3));
   }

   // method to decrypt string using caesar cipher
   public String decryptString(String msg, int shift) 
   {
      // Create an array
      // int myArray = ["EKMFLGDQVZNTOWYHXUSPAIBRCJ"];
      // Realised working with letters in a normal String format is more
      // straightforward than using an array
   
      // find the index of each letter
      // check if character is indeed a letter and if not print an error message
      // take note of count?
      // reverse the caesar shift
      // decrement
      // shift--;
   
      // NB!! All string characters must be in uppercase
      // -- minus
      
      // Define the alphabet
      String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      // String.charAt(0);
   
      // Build a stringbuilder to store the decrypted message
      StringBuilder decryptedMsg = new StringBuilder();
   
      // for loop to iterate through the characters in the message
      for (int i = 0; i < msg.length(); i++) 
      {
         // Get the current character in iteration and convert it to all caps
         char currentChar = Character.toUpperCase(msg.charAt(i));
      
         // Check if the character is a letter
         if (Character.isLetter(currentChar)) 
         {
            // Find the index of the current character in the alphabet
            // index needs to be 0-25
            int alphaIndex = alphabet.indexOf(currentChar);
         
            // Reverse the Caesar shift method to decrypt
            // Plus 26 
            alphaIndex = (alphaIndex - shift + 26) % 26;
         
            // Store the decrypted character in a variable called decryptedChar
            char decryptedChar = alphabet.charAt(alphaIndex);
         
            // If the character is not a letter, append it unchanged
            decryptedMsg.append(decryptedChar);
         }
         
         else 
         {
            // If the character entered is not a letter, append the value entered to the
            // returned error message
            // ends the program
            return "Error Msg: A non-alphabetic character has been entered " + currentChar;
         }
         
         // Decrement the shift for the next character
         shift--;
      }
      // Return the decrypted message as a string
      return decryptedMsg.toString();
      
      ///////OUTPUT: I keep getting XZB////////
   }
} // end of class
