import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Question4{
    public static void main() throws IOException{
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        double hra = 0;
        double da = 0;
        System.out.println("Enter your Name: ");
        String name = inp.readLine();
        System.out.println("Enter Basic Salary: ");
        int salary = Integer.parseInt(inp.readLine());
        if ( salary <= 10000){
            hra = 0.2;
            da = 0.8;
        }
        else if ( salary <= 20000){
            hra = 0.25;
            da = 0.9;
        }
        else if ( salary > 20000){
            hra = 0.3;
            da = 0.95;
        }
        salary += (salary * hra) + (salary * da);
        System.out.println(name + " " + salary);
    }
}