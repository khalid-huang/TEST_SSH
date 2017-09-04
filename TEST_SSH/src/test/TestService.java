package test;

/**
 * Created by kinthon on 17-3-31.
 */
public class TestService {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void hello()
    {
        System.out.println("hello "+ getName());
    }
}
