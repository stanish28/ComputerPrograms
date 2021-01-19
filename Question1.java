import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Question1{
    public static void main() throws IOException{
    BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter vales of three sies of triangle: ");
    int a= Integer.parseInt(inp.readLine());
    int b= Integer.parseInt(inp.readLine());
    int c= Integer.parseInt(inp.readLine());
    System.out.println();
    if(a == b && b==c){
        System.out.println("The triangle is an Equilateral triangle");
        
     }
    else if(a == b || b == c || a == c){
        System.out.println("The triangle is an Isoceles triangle");
    }
    else{
        System.out.println("The triangle is neither Equilateral nor Isoceles Triangle");
    }
}
}