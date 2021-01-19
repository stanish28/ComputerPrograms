class Question14{
    private static double re, im; 
      
    // A normal parametrized constructor  
    public Question14(double re, double im) { 
        this.re = re; 
        this.im = im; 
    } 
      
    // copy constructor 
    Question14(Question14 c) { 
        System.out.println("Copy constructor called"); 
        re = c.re; 
        im = c.im; 
    } 
       

  
    public static void main(String[] args) { 
        Question14 c1 = new Question14(10, 15); 
          
        // Following involves a copy constructor call 
        Question14 c2 = new Question14(c1);    
  
        // Note that following doesn't involve a copy constructor call as  
        // non-primitive variables are just references. 
        Question14 c3 = c2;    
  
        System.out.println(re + "  " + im); // toString() of c2 is called here 
    } 
} 