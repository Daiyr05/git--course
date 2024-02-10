package Inter;

public class Cook extends Worker implements CanCook{


    public Cook(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("cook");
    }
}
