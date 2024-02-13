public class Caesar{

public static void main(String[] args)
{
      Caesar caesar = new Caesar();
      System.out.print(caesar.ceasarShift("wyz", -1));
}
   
   public String ceasarShift(String message, int shift)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder newString = new StringBuilder();
        
        for(int i = 0; i < message.length(); i++)
        {
         char currentChar = message.toUpperCase().charAt(i);
         int alphaIndex = alphabet.indexOf(currentChar);
         alphaIndex = (alphaIndex + shift) % 26;
         char newChar = alphabet.charAt(alphaIndex);
         newString.append(newChar);
         shift++;
         }
         return newString.toString();
}
}
