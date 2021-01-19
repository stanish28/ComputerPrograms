class Question7{
    public static void main(){
        int rows = 5;
    System.out.println("** Printing the pattern... **");
        
        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j < rows; j++)
            {
                System.out.print(j + " ");
            }

            for (int k = rows - i; k < rows; k++)
            {
                System.out.print(5 + " ");
            }
            System.out.println();
}
}
}