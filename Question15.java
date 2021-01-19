import java.util.*;
class Question15{
    public static void main(){
     Scanner sc = new Scanner (System.in);
     int count = 0;
     int a[] = new int[]{2,3,1,5,7};
     System.out.println("Enter position - ");
     int x = sc.nextInt();
     System.out.println("Enter new element - ");
     int y = sc.nextInt();
     int temp[] = new int[5];
     System.out.println("Original Array : "+Arrays.toString(a));     
  
  for(int i=a.length-1; i > x; i--){
    a[i] = a[i-1];
   }
   a[x] = y;
   System.out.println("New Array: "+Arrays.toString(a));
 }
 }