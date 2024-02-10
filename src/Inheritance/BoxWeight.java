package Inheritance;

public class BoxWeight extends Box{
    private int weight;

    public BoxWeight(int width, int length, int height, int weight){
        super(width,length,height);
        this.weight = weight;
    }


    @Override
    public void info() {
        super.info();
        System.out.println("weight is: "+weight);
    }
}
