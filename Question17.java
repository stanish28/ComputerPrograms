class Question17{
    public static void main(){
        int a[][]= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int trans[][]= new int[3][3];
        System.out.println("Original Matrix - ");
        for(int i = 0; i < a.length ; i++){
            for(int j=0; j<a.length;j++){
                 System.out.print(a[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            System.out.println("Transpose Matrix - ");
        for(int i = 0; i < a.length ; i++){
            for(int j=0; j<a.length;j++){
                 System.out.print(a[j][i]);
                }
                System.out.println();
            }
        }
    }
        