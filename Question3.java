class Question3{
    public static void main(int x){
        double bill = 0;
        if(x <= 50){
           bill = x * 0.50;
        }
        else if (x > 50 && x <= 150){
           bill = (50 * 0.50)+((x-50)*0.75);
        }
        else if ( x > 150 && x <= 250){
            bill = (50 * 0.50) + (100 * 0.75) + ((x-150) * 1.20);
        }
        else if ( x > 250 ){
            bill = (50 * 0.50) + (100 * 0.75) + (100 * 1.2) + ((x-250)*1.5);
        }
           bill = bill + (bill * 0.20);
           System.out.println(" The bill is : " + bill);
    }
}