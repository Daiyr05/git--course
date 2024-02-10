package Inter;

public class Programmer extends Worker implements CanCode{


    public Programmer(String name){
        super(name);
    }

    @Override
    public void work() {
        System.out.println("code");
    }
}
