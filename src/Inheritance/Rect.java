package Inheritance;

public class Rect extends Figure {

    public Rect(int n){
        super(n,n);
    }

    public Rect(int a, int b){
        super(a,b);
    }
    @Override
    public double area(){
        return getA()*getB();
    }


}
