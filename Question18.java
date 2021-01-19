import java.util.*;
import java.lang.*;
class Question18{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.println("Enter a Three word name - ");
        String a = sc.nextLine();
        String name = ' ' + a.trim();
        for(int i = 0; i<name.length();i++){
            char ch = name.charAt(i);
            if (ch == (' ')){
                if(count<=2){
                ch = name.charAt(i+1);
                System.out.print(ch + ". ");
                count+=1;
                 }
                else if (count>=2){
                    String s = a.substring(i,(name.length()-1));
                    System.out.print(s);
                    break;
                   }
              } 
}
}
}