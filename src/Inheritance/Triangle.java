package Inheritance;

public class Triangle extends Figure{
    private int c;

    public Triangle(int c){
        super(c,c);
        this.c = c;
    }

    public Triangle(int a, int b, int c){
        super(a, b);
        this.c = c;
    }

    @Override
    public double area(){
        int perimetre = (getA()+getB()+c)/2;
        return Math.sqrt(perimetre*(perimetre-getA())*(perimetre-getB())*(perimetre-c));
    }
}
