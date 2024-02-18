public class myDecryption {

    // main method
    public static void main(String[] args) {

        // create an instance of the myDecryption class
        myDecryption decryptCaesar = new myDecryption();

        // Call the decryptString
        System.out.println(decryptCaesar.decryptSring("ABC", 4));
    }

    // method to decrypt string using caesar cipher
    public String decryptString(String msg, int shift) {
        // Create an array
        // int myArray = ["EKMFLGDQVZNTOWYHXUSPAIBRCJ"];
        // String.charAt(0);

        // Build a stringbuilder
        // StringBuilder decryptedMsg = new StringBuilder();
        // find the index of each letter
        // check if character is indeed a letter and if not print message
        // take note of count?
        // reverse the caesar shift
        // decrement
        // shift--;

        // NB!! All string characters must be in uppercase
        // -- minus

        // for loop to iterate through the characters in the message
        for (int i = 0; i < msg.length; i++) {
            if ('A') {
                char encryptedChar = encryptedMsg.charAt(i);
            }
        }
        // Change the string to uppercase
        char currentChar = msg.toUpperCase().charAt(i);
        return decryptedMsg.toString();
    }
} // close class
