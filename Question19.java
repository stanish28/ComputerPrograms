import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Question19{
    public static void main() throws IOException{
      BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter The String - ");
      String s = inp.readLine(),temp;
      char string[] = s.toCharArray(); 
      int count;
          
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.print(string[i] + ": " + count + " " );  
        }  
    }  
}  