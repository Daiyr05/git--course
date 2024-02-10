package OOP;

public class MyMath {
    public static double PI = 3.14;

    public static int sqare(int a){
        return a*a;
    }

    public static double circLength(double r ){
        return 2*PI*r;
    }

    public static double area(double r){
        return r*r*PI;
    }

    public static int sum(int... nums){
        int sum = 0;
        for (int i :nums){
            sum+=i;
        }
        return sum;
    }
}
