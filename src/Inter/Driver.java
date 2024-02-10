package Inter;

public class Driver extends Worker implements CanDrive{


    public Driver(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("drive");
    }
}
