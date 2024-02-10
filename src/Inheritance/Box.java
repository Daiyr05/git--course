package Inheritance;

public class Box {
    private int width;
    private int length;
    private int height;

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void info(){
        System.out.println("\nwidth is: "+width+"\nlength is: "+length+"\nheight : "+height);
    }
}
