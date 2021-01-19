import java.util.*;
class Question16{
    public static void main(){
     Scanner sc=new Scanner(System.in);
     int count = 0;
     int a[] = new int[]{23,45,56,67,78};
     System.out.println("Enter the number to be searched -");
     int value = sc.nextInt();
     int length = a.length;
     int mid = (length-1) / 2;
     
     if(a[mid] == value)
     {
         System.out.println("Element found at location - " + mid);
        }
     else if(value > a[mid])
     {
            for (int i = length-1; i > mid;i--)
            { 
               if(a[i] == value)
               {
                    System.out.println("Element found at location - " + (i+1));
                    count+=1;
                }
            }
     }
     else if(value < a[mid])
     { 
            for (int i = 0 ; i<mid;i++)
            {
                if(a[i] == value)
                {
                    System.out.println("Element found at location - " + (i+1));
                    count+=1;
                }
            }
     }
     if(count == 0)
     {
          System.out.println("Element not found");
    }
}
}




                    
         
        