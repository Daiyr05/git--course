package OOP;

public class Triangle {
    int a;
    int b;
    int c;

    public void setDimensions(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area(){
        int p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
