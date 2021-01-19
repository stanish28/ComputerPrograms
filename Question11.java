import java.util.*;

class Question11{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number - ");
        int num = sc.nextInt();
        System.out.println("Enter 1 for Buzz Number ");
        System.out.println("Enter 2 for Comp Number ");
        int a = sc.nextInt();
        switch(a){
            case 1: int c = (Buzz(num));
            if(c==1){
                System.out.println("It is a Buzz Number");
            }
            else{
                System.out.println("It is not a Buzz Number");
            }
                
            break;
            
            case 2: c = (Comp(num));
            if(c==1){
                System.out.println("It is a Comp Number");
            }
            else{
                System.out.println("It is not a Comp Number");
            }
            break;
            
            default: System.out.println("Wrong Choice");
    }
}

private static int Buzz(int x){
    if(x % 7 == 0 || x % 10 == 7){
        return 1;
}
else{
    return 0;
}
}

private static int Comp(int x){
    int count = 0;
    for(int i = 1; i<x;i++){
        if(x%i==0){
            count = count + 1;
        }
    }
        if(count>1){
            return 0;
        }
        else{
            return 1;
        }
    }
}

