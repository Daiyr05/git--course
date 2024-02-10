package Inter;

public class Count implements Counter{
    @Override
    public String report(int i) {
        return "Report for "+i+" monthes";
    }
}
