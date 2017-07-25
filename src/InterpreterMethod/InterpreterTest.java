package InterpreterMethod;

/**
 * Created by Jeremy on 2017/7/25.
 */
public class InterpreterTest {

    public static void main(String []args){
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);

    }

}
