import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Question10{
    private static void sum(int x){
        int s = 0;
        for (int i = 1 ; i<x ; i++){
            s += (i * (i+1));
        }
        System.out.println("The sum is :- " + s);
    }
    public static void main() throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number :- ");
        int a = Integer.parseInt(input.readLine());
        sum(a);
    }
}
