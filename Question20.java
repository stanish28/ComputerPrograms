import java.util.*;

class Question20{
    public static void main(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the String - ");
     String s = sc.nextLine();
     String[] words = s.split(" ");
     String reversedString = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		/* The charAt() function returns the character
		 * at the given position in a string
		 */
		reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reversedString + reverseWord + " ";
	}
	System.out.println(reversedString);
   }
}