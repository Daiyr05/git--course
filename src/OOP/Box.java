package OOP;

public class Box {
    private double width;
    private double length;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDimensions(double width, double length, double heigh){
        this.width = width;
        this.length = length;
        this.height = heigh;
    }
    public Box(double width, double length, double height){
        this.width = width;
        this.length = length;
        this.height = height;
    }
    public double volume(){
        return width*length*height;
    }

    public static Box increase(Box a, Box b){
        return new Box(a.width+b.width,a.length+b.length,a.height+b.height);
    }

    public void info(){
        System.out.println("length is "+this.length+"\nwidth is"+this.width+"\nheight is"+this.height);
    }
}
