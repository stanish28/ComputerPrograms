class Question8{
    public static void main(int x){
        int check = 0;
        for (int i = 1 ; i < x ; i++){
            if(x % i == 0){
                for ( int j = 1 ; j < i ; j++){
                    if (check == i){
                            continue;
                        }
                    if(i % j == 0){
                        System.out.println(i + " is a prime factor ");
                        
                        check = i;
                    }
                }
                //System.out.println(i);
            }
        }
    }
}
