package Inheritance;

public abstract class Figure {
    private int a;
    private int b;

    public Figure(int a, int b){
        this.a = a;
        this.b = b;
    }


    public final int getA() {
        return a;
    }

    public final int getB() {
        return b;
    }

    public abstract double area();
}
