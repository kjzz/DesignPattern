package ResponsibilityMethod;

/**
 * Created by Jeremy on 2017/7/24.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {

        System.out.println(name+"deal!");
        if(this.getHandler()!=null){
            this.getHandler().operator();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
