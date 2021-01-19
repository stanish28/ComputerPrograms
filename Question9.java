
class Question9{
    private static int Area(int x){
        int a = x * x;
        return (a);
    }
    private static int Area(int x, int y){
        int a = x * y;
        return (a);
    }
    private static double Area(float x){
        double a = 3.14 * x * x;
        return(a);
    }
    public static void main(int square, int rec_side_1, int rec_side_2, float radius){
        int sq = Area(square);
        int rec = Area(rec_side_1,rec_side_2);
        double cir = Area(radius);
        System.out.println("Area of square : " + sq);
        System.out.println("Area of rectangle : " + rec);
        System.out.println("Area of circle : " + cir);
    }
}
        
        