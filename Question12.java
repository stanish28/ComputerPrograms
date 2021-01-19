class Question12{
    static int a;
    static int b;
     Question12(int x,int y){
        a = x;
        b = y;
    }
    
    public static void Calculate(){
    int temp,temp1,temp2,lcm,hcf;
    temp1 = a;
    temp2 = b;
    System.out.println("The Number Entered Are : " + a + " and " + b);    
   

      while(temp2 != 0){
         temp = temp2;
         temp2 = temp1%temp2;
         temp1 = temp;
      }

      hcf = temp1;
      lcm = (a*b)/hcf;

      System.out.println("HCF of input numbers: "+hcf);
      System.out.println("LCM of input numbers: "+lcm);
   }
}
    